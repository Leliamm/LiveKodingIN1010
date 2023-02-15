public class TestKjoretoy {
    public static void main (String [] args){
        // denne elBilen har ikke tilgang til metoden lade()
        //fordi den er av type kjoretoy.
        Kjoretoy elBil = new ELbil("sdrw54", "Leaf", "modell", 80);
        
        ELbil elBil2 = new ELbil("sdrw54", "Leaf", "modell", 80);
        elBil2.lade(34);
        elBil2.skrivUtt();


       ELbil elbil3 = null;
       if(elBil instanceof ELbil){
        elbil3 = (ELbil) elbil3;
        elbil3.lade(34);
        elbil3.skrivUtt();
       }

        System.out.println( "Husker ikke hva vi skulle skrve her");

        Kjoretoy [] alleKjoretoy = new Kjoretoy[10];
        alleKjoretoy[0] = elBil;
        
    }
   
}
