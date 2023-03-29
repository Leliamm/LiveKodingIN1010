import java.util.concurrent.CountDownLatch;

public class Valglokale implements Runnable{
    private Parti [] partier = Parti.values();
    private MonitorStemmesystem monitor;
    private String sted;
    private CountDownLatch antallUrdner;
    private int antallStemmerPerUrne;

    public Valglokale(MonitorStemmesystem monitor,
    String sted,CountDownLatch antallUrdner, int antallStemmerPerUrne){
        this.monitor = monitor;
        this.sted = sted;
        this.antallUrdner = antallUrdner;
        this.antallStemmerPerUrne = antallStemmerPerUrne;
    }

    private Parti tilfeldigParti(){
        int tilfeldigIndex = (int) Math.round(Math.random()*(partier.length -1));
        return partier[tilfeldigIndex];
    }

    @Override
    public void run(){
        while(antallUrdner.getCount() > 0){
            antallUrdner.countDown();
            for(int i = 0; i < antallStemmerPerUrne; i++){
                monitor.leggTilStemme((tilfeldigParti()));
            }
            System.out.println(sted + " la til " + antallStemmerPerUrne + " stemmer.");
        }
    }
}
