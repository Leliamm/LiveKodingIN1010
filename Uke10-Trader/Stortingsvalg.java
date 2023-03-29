import java.util.concurrent.CountDownLatch;

public class Stortingsvalg {
    public static final int   ANTALL_URNER = 4;
    public static final int   ANTALL_sTEMMER_PER_URNE = 10;

    public static final int   ANTALL_STEMMETELLERE = 5;
    public static final int   ANTALL_sTEMMER_PER_TELLER = ANTALL_URNER*ANTALL_sTEMMER_PER_URNE/ANTALL_STEMMETELLERE;
    public static void main (String [] args) throws InterruptedException{
        Stemmesystem stemesystem = new Stemmesystem();
        MonitorStemmesystem monitor = new MonitorStemmesystem(stemesystem);

        Thread [] stemmetellere = new Thread[ANTALL_STEMMETELLERE];

        for(int i = 0; i < ANTALL_STEMMETELLERE; i++){
            stemmetellere[i] = new Thread(new Stemmeteller(monitor, i, ANTALL_sTEMMER_PER_TELLER));
            stemmetellere[i].start();
        }
        System.out.println("\nStortingsvalget er i gang.");

        CountDownLatch antallUrdner = new CountDownLatch(ANTALL_URNER);

        Thread blindern = new Thread( new Valglokale(monitor, "Blindern",antallUrdner, ANTALL_sTEMMER_PER_URNE));
        Thread nydalen = new Thread( new Valglokale(monitor, "Nydalen", antallUrdner, ANTALL_sTEMMER_PER_URNE));

        blindern.start();
        nydalen.start();


        for(Thread stemeteller : stemmetellere){
            stemeteller.join();//barriere her ----- alle må kjøre ferdig til den barieren før hovedtråden kan fortsette
        }
        System.out.println("\nStortingsvalget er over.");
    }
}
