public abstract class Hus extends Bolig {
    protected int antEtasjer;

    public Hus(int aar, String adr, int antallEtj){
        super(aar, adr);
        antEtasjer = antallEtj;
    }
}
