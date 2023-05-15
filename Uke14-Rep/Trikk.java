public abstract class Trikk implements Runnable {
    protected Trikkelinje trikkelinje;
    protected Holdeplass gjeldendeHoldeplass;
    protected int id;
    protected int hastighet;

    public Trikk(int id, Trikkelinje linje){
        this.id = id;
        trikkelinje = linje;
        gjeldendeHoldeplass = trikkelinje.hentForste();
    }
    
    @Override
    public void run(){
        while(gjeldendeHoldeplass != null){
            System.out.println("ankommer " + gjeldendeHoldeplass);
            gjeldendeHoldeplass = gjeldendeHoldeplass.neste;
            try{
                Thread.sleep(hastighet);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Ferdig med å kjøre. ");

    }

}
