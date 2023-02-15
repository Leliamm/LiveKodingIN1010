public class Motorsykkel extends Kjoretoy{
    
    protected String model;
    private final int antHjull = 2;

    public Motorsykkel (String r, String m, String mod, double h){
        super(r, m, mod, h); //kaller på parametrene fra superkalssen.

    }

    public void skrivUtt(){
        System.out.println("Dette er en motorsykkel");
    }

    // trenger ikke lenger siden vi antHjull er FINAL nå.
    //public int hentAntHjull(){
    //     return antHjull;
    //}
}
