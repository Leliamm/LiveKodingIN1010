public class TestAListe {
    public static void main (String [] arags){
        AListe<Integer, String> tallListe = new AListe<>();

        System.out.println(tallListe.hentStr());
        tallListe.settInn(1, "en");
        tallListe.settInn(2, "to");
        System.out.println(tallListe.hentStr());

        System.out.println(tallListe);
    }
}
