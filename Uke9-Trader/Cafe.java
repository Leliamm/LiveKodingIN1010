import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;


public class Cafe {
    //vår monitor -> objekt som håndtere felles data
    protected int antallKaffe = 0;
    protected boolean erStengt = false;
    private Lock las = new ReentrantLock();
    //condition: kø for trader før de kan fortsette
    private Condition ikkeTomt = las.newCondition();
    

    public void lagKaffe(int baristaID){
        //deler felles data --> kritisk region (i dette tilfelle: antall kaffe)
        //vi må beskyte kritisk region for å ungå feil med låser.
        las.lock();
        try{
            System.out.println("Barista " + baristaID +" lager kaffe.");
        antallKaffe++;
        //om en trad venter pga tomt, blir den signalert at den kan fortsette
        ikkeTomt.signal();
        }finally{
            las.unlock();
        }
    }
    public void drikkKaffe(int kundeID) throws InterruptedException {
        las.lock();
        try {while(antallKaffe == 0 && !erStengt){
            //traden må vente på signal
            ikkeTomt.await();
        }
        if (!erStengt){
            System.out.println("Kunde " + kundeID +" drikker kaffe.");
        antallKaffe--;
        }
     } finally {
            las.unlock();
        }
    }
    public void steng(){
        las.lock();
        try{
            erStengt = true;
        //lar alle som venter fortsette
        ikkeTomt.signalAll();
        }finally{
            las.unlock();
        }
        
    }
}
