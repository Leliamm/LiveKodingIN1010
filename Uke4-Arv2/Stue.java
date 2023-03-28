import java.util.ArrayList;


public class Stue extends Rom {
    private boolean harPeis;

    public Stue(int areal, boolean peis){
        super(areal);
        harPeis=peis;
       
    }

    public String typeRom(){
        return "Stue";
    }

    public ArrayList<String> hentEgenskaper(){
        ArrayList<String> egenskaper = new ArrayList<>();
        egenskaper.add("Areal: " + Integer.toString(areal));

        if(harPeis){
            egenskaper.add("Har peis");
        }

        return egenskaper;
        }

        // @Override
    //     public String toString(){
    // String utskrift = "Dette er en stue " + super.toString();
    // if(harPeis){
    //     utskrift += "\nStuen har peis.";
    // }
    // return utskrift;
    //     }
}
