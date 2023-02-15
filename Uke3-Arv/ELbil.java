public class ELbil extends Bil {
    private int batteri = 0;
    public ELbil(String r, String m, String md, double h){
        super(r, m, md, h);
    }

    public int hentBatteri(){
        return batteri;
    }

    public void lade(int strom){
        batteri += strom;
    }
    public void skrivUtt(){
        System.out.println("Dette er en ELbil.");
    }
}
