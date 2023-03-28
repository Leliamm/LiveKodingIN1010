public class Test {
    public static void main(String[] args){
        AListe<Integer, String> tallListe = new AListe<>();
        System.out.println(tallListe.hentStr());

        tallListe.settInn(1, "en");
        tallListe.settInn(2, "to");
        System.out.println(tallListe.hentStr());

        System.out.println(tallListe);

        System.out.println(tallListe.hent(3));

        //tallListe.sett(2, "two");
        //System.out.println(tallListe.hent(2));

        tallListe.settInn(3, "tre");
        tallListe.fjern(2);

        System.out.println(tallListe);

        AListeSortert<Integer, String> sortertListe = new AListeSortert<>();
        sortertListe.settInn(3, "tre");
        sortertListe.settInn(1, "en");
        sortertListe.settInn(4, "fire");
        sortertListe.settInn(2, "to");

        System.out.println("\n"+sortertListe);

        // teste Iterator
        System.out.println("\n -- Iterator");
        for (int nokkel : sortertListe){
            System.out.println("K: " + nokkel + 
                                " - V: " + sortertListe.hent(nokkel));
        }

    }
}
