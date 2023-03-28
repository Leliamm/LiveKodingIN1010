public class Rekkehus extends Hus implements HarNaboer, KanMales, BoFelleskap {
    private int naboer = 0;
    public Rekkehus(int aar, String adr, int antallEtj){
        super(aar, adr, antallEtj);
    }
    @Override
    public int antallNaboer(){
        return naboer;
    }
    @Override
    public void registrerNabo(String hvor){
        if (naboer >=2){
            System.out.println("Har nok naboer");
            return;
        }
        if(!(hvor.equals("hoyre")) && !(hvor.equals("venstre"))) {
            throw new HarNokNaboer ("Rekkehus", hvor);
        }

    }
    @Override
    public void male(){
        System.out.println("Maler sidene av rekkehuset.");
    }
    @Override
    public void vaskeFellesAreal(){
        System.out.println("Alle må vaske på dugnad.");
    }
}
