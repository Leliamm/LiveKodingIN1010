public class CafeHovedprogram {
    public static void main (String [] args){
        Cafe cafe = new Cafe();
        Thread barista = new Thread(new Barista(cafe, 1));
        Thread kunde = new Thread(new Kunde (cafe, 1));
        barista.start();
        kunde.start();

        try{
            barista.join();
           // kunde.join();
        } catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        //barista er ferdig
        System.out.println("Barista er ferdig.");
        cafe.steng();

        //etter join() - trådene er ferdig, main fortsetter.
        System.out.println("\nCafeen er stengt.");

    }
}
