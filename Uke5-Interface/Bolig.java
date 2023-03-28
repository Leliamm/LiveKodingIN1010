import java.util.ArrayList;

public abstract class Bolig {
    protected int byggeAar;
    protected ArrayList<Rom> rommene;
    protected String adresse;

    public Bolig(int aar, String adr){
        byggeAar = aar;
        adresse = adr;
        rommene = new ArrayList<>();
    }
    public int hentAreal(){
        int areal = 0;
        for (Rom rom : rommene){
            areal += rom.hentAreal();
        }
        return areal;
    }
    public void leggTilRom(Rom r){
        if(r!=null) rommene.add(r);
    }

    @Override
    public boolean equals (Object o){
        if(!(o instanceof Bolig)){
            return false;
        }
        Bolig annenBolig = (Bolig) o;

        String adresseDenne = this.adresse;
        String adresseAnnen = annenBolig.adresse;
        return true;
    }
}
