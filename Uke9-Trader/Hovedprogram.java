import java.nio.channels.InterruptedByTimeoutException;
import java.util.LinkedList;
import java.util.List;

public class Hovedprogram{
    public static void main (String [] args){
        List <Thread> trader = new LinkedList<>();
        for (int i = 0; i < 5; i++){
            Thread trad = new Thread(new HeiTrad(i));
            trad.start();
        }

        for (Thread trad : trader){
            try{
                // vent til tradene er ferdig, ikke gå videre
                trad.join();
            } catch (InterruptedException e){
                System.out.println("Ble avbrudt.");
            }
            
        }
        //her har alle trådene blitt ferdige, men mine gjør ikke det. "Tadene er ferdig" blir publisert (noen ganger) før alle tradene er ferdig.
     System.out.println("Tradene er ferdig.");

    }
}