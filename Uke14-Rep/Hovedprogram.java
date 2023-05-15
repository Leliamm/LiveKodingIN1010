import java.util.ArrayList;

public class Hovedprogram {
    public static void main (String[] args){
        Holdeplass bislett = new Holdeplass("Bislett");
        // System.out.println(bislett);
        System.out.println(bislett.toString());

        Trikkelinje linje18 = new Trikkelinje("linje_18.txt");

        linje18.settForste(bislett);
        System.out.println(bislett);

        Holdeplass Forskningsparken = new Holdeplass ("Forskningsparken");

System.out.println(Forskningsparken);

String rute = linje18.hentUtRute("Bislett", "Forskningsparken");
System.out.println(rute);

int antallStopp = linje18.antallStoppFra(linje18.hentForste(), Forskningsparken, 0);
// System.out.println(antallStopp);

        // ArrayList<Thread> trader = new ArrayList<>();
        Thread trad = new Thread(new NyTrikk(1, linje18));
        Thread trad2 = new Thread(new GammelTrikk(2, linje18));

        trad.start();
        trad2.start();

        //join() på tradene
        


    }

}
