
public class HeiTrad implements Runnable {
    private int id;

    public HeiTrad (int id){
        this.id = id;
    }
    
    @Override
    public void run(){
        System.out.println("Trad " + id +" sier hei!");
    }
}
