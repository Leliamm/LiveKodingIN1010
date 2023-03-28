import java.util.ArrayList;

abstract class Rom {
    protected int areal;

    public Rom(int areal){
        this.areal = areal;
    }

    public abstract String typeRom();
    //brukes i andre objekter for å hente arealet.
    public int hentAreal(){
        return areal;
    }
    public abstract ArrayList<String> hentEgenskaper();
    @Override
    public String toString(){
        String utskrift = "Rom type " +  typeRom() + "\n";

        ArrayList<String> egenskap = hentEgenskaper();

        for ( String e: egenskap){
            utskrift += e + "\n";
        }
        return utskrift;
    }
}