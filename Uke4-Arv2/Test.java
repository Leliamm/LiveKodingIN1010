public class Test {
    public static void main (String [] Args){

        //ROM definerer hvilken metoder fi har tilgang til. Hvis Rom ikke haddde hatt romType(), hadde vi ikke hatt tilgang til den.
        //Stue sier hvilen implementasjon den her.

        //typen til pekkeren, typen til objektet.
        Rom stue = new Stue(34, true);
        Rom soverom = new Soverom(20, false);
        Soverom sov = new Soverom(30, false);

        RomMedVann kjokken  = new Kjokken(15, false, true);


        // stue.toString();
        // soverom.toString();
        System.out.println(stue);
        System.out.println(soverom);
        System.out.println(kjokken);
        System.out.println(sov);
    }
}
