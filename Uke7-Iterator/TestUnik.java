import java.util.Arrays;

public class TestUnik {
    public static void main(String []args){
        AlisteUnik<Integer, String> unikListe = new AlisteUnik<>();

        unikListe.settInn(1, "en");
        unikListe.settInn(2, "to");

        System.out.println(unikListe);

      //  unikListe.settInn(1, "one");

            Dato [] datoer = new Dato[4];

        Dato d1 = new Dato(12, 23, 3456);
        Dato d2 = new Dato(22, 21, 1234);
        Dato d3 = new Dato(22, 21, 1234);
        System.out.println(d1.compareTo(d2));

        datoer[0] = d1;
        datoer[1] = d2;
        datoer[2] = d3;
        datoer[3] = new Dato(12, 23, 453);
        for (Dato d:datoer){
            System.out.println(d);
        }

        System.out.println("Sortert----");
        Arrays.sort(datoer);

        for (Dato d:datoer){
            System.out.println(d);
        }
    }
    
}
