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


        AListeSortert<Integer, String> sortertliste = new AListeSortert<>();

        sortertliste.settInn(3, "tre");
        sortertliste.settInn(2, "to");
        sortertliste.settInn(1, "en");
        sortertliste.settInn(4, "fire");

        System.out.println("\n" + sortertliste);
             //tester at Iterator funker

             for (int nokkel: sortertliste){
                System.out.println(nokkel);
             }

    }
}
