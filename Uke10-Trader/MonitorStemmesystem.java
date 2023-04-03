import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class MonitorStemmesystem {
    //monitoren håndterer felles resurser
    private Lock las = new ReentrantLock();
    private Condition ikkeTomt = las.newCondition();
    
    private Stemmesystem stemmesystem;

    public MonitorStemmesystem(Stemmesystem stemmesystem){
        this.stemmesystem = stemmesystem;
    }

    public void leggTilStemme(Parti parti){
       las.lock();
       try{
        //kritisk region
        stemmesystem.leggTilStemme(parti);
        ikkeTomt.signalAll();
       }finally{
        las.unlock();
       }
    }

    public Parti taUtStemme() throws InterruptedException {
        las.lock();
       try{
        //kritisk region
        while(tomtForStemmer()){
            ikkeTomt.await(); //pasive venting
        }
        return stemmesystem.taUtStemme();

        
       }finally{
        las.unlock();
       }
    }

    public boolean tomtForStemmer(){
        las.lock();
       try{
        //kritisk region
        return stemmesystem.tomtForStemmer();
       }finally{
        las.unlock();
       }
    }
}
