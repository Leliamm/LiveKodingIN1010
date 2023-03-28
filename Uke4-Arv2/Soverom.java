import java.util.ArrayList;

public class Soverom extends Rom {
protected boolean harInnebygdSkap;
Stue egenStue;

    public Soverom(int areal, boolean skap){
        //super må kalles overst i konstruktøren. Vi kan ikke kalle på noe før den.
        super(areal);
        harInnebygdSkap = skap;
    }
    public Soverom(int areal, boolean skap, Stue stue){
        //super må kalles overst i konstruktøren. Vi kan ikke kalle på noe før den.
        super(areal);
        harInnebygdSkap = skap;
        egenStue=stue;
    }
    //fint å ha override for lesbarhet!
    @Override
    public String typeRom(){
        return "Soverom";
    }

    public ArrayList<String> hentEgenskaper(){
        ArrayList<String> egenskaper = new ArrayList<>();
        egenskaper.add("Areal: " + Integer.toString(areal));

        return egenskaper;
        }
//         @Override
//     public String toString(){
// String utskrift = "Dette er et soverom " + super.toString();

// return utskrift;
//     }
}
