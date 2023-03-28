public class Leilighet extends Bolig  implements HarNaboer, BoFelleskap{
    protected int etasje, leilighetNr;
    private int antallNaboer = 0;
    public Leilighet(int aar, String adr, int etj, int nr){

        super(aar, adr);
        etasje = etj;
        leilighetNr = nr;
    }
    @Override
    public int antallNaboer(){
        return antallNaboer;
    }
    @Override
    public void registrerNabo(String hvor){
        if(hvor.equals("hoyre") || hvor.equals("venstre")){
            antallNaboer++;
        }else{
            System.out.println("Kan ikke lege på flere naboer");
        }
    }
    @Override
    public void vaskeFellesAreal(){
        System.out.println("Vasking er innleid.");
    }
}
