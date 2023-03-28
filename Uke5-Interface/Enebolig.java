public class Enebolig extends Hus implements KanMales {
    public Enebolig(int aar, String adr, int antallEtj){
        super(aar, adr, antallEtj); 
        }
        @Override
        public void male(){
            System.out.println("Maler hele utsiden");
    }
}
