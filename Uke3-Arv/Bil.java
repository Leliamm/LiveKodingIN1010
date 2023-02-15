public class Bil extends Kjoretoy {
    protected String model;

    public Bil (String r, String m, String mod, double h){
        super(r, m, mod, h); //kaller på parametrene fra superkalssen.

    }

    public void skrivUtt(){
        System.out.println("Dette er en bil");
    }

}
