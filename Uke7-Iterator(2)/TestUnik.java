import java.util.Arrays;

public class TestUnik {
    public static void main(String[] args){
        AListeUnik<Integer, String> unikListe = new AListeUnik<>();
        unikListe.settInn(1, "en");
        unikListe.settInn(2, "to");

        System.out.println(unikListe);

        // unikListe.settInn(1, "one");

        Dato[] datoer = new Dato[4];
        Dato dato1 = new Dato(13, 3, 2023);
        Dato dato2 = new Dato(26, 10, 2019);
        Dato dato3 = new Dato(26, 10, 2021);

        System.out.println(dato1.compareTo(dato2));

        datoer[0] = dato1;
        datoer[1] = dato2;
        datoer[2] = dato3;
        datoer[3] = new Dato(9, 3, 2023);

        for (Dato dato : datoer){
            System.out.println(dato);
        }

        Arrays.sort(datoer);

        System.out.println("\n-- Sortert --");
        for (Dato dato : datoer){
            System.out.println(dato);
        }
    }
}
