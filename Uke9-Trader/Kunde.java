public class Kunde implements Runnable {
    private int id;
    private Cafe cafe;
    private int antallDrukket = 0;

    public Kunde(Cafe c, int kundeId){
        cafe = c;
        id = kundeId;
    }

    @Override
    public void run(){
        
        while (antallDrukket < 10){
            try{
                if(cafe.erStengt) {
                    break;  
                }else{
                    cafe.drikkKaffe(id);
                    antallDrukket++;
                    Thread.sleep(500);
                    }          
                
            }catch (InterruptedException e){
                System.out.println(e);
            }
            
        }
        System.out.println("Kunde " + id + " - ferdig.");
        System.out.println("Antall drukket kaffer " + antallDrukket + ".");

    }
    
}
