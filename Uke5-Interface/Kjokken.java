import java.util.ArrayList;

public class Kjokken extends RomMedVann {
    private boolean harOppvaskMaskin;


    public Kjokken(int areal, boolean varm, boolean oppvask){
            super(areal, varm);
            harOppvaskMaskin = oppvask;
    }

    @Override
    public ArrayList<String> hentEgenskaper(){
        ArrayList<String> egenskaper = super.hentEgenskaper();
        if(harOppvaskMaskin){
            egenskaper.add("Har oppvaskmaskin.");
        }
        return egenskaper;
    }

    @Override
    public String typeRom(){
        return "Kjøkken";
    }
}
