public class Barista implements Runnable {
    private Cafe cafe;
    private int id;
    private int antllLagd = 0;

    public Barista(Cafe c, int id){
        cafe = c;
        this.id = id;
    }
    
    @Override
    public void run(){
        
        while (antllLagd < 3){
            try{
            
                cafe.lagKaffe(id);
                antllLagd++;
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            
        }
        System.out.println("Barista " + id + " - ferdig.");
        System.out.println("Antall lagd kaffer " + antllLagd + ".");
    }

        
}
