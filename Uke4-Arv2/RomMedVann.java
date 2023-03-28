import java.util.ArrayList;

public abstract class RomMedVann extends Rom {
    protected boolean harVarmtVann;

    public RomMedVann(int areal, boolean varm){
        super(areal);
        harVarmtVann = varm;
    }

    @Override
    public ArrayList<String> hentEgenskaper(){
        ArrayList<String> egenskaper = new  ArrayList<>();
        if(harVarmtVann){
            egenskaper.add("Har varmt vann.");
        }else{
            egenskaper.add("Har vann.");
        }

        return egenskaper;
    }
}
