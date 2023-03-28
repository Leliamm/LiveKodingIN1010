public class TestBolig {
    public static void main(String [] args) {
        Leilighet lei = new Leilighet(2021, "adressveien 2", 2, 23);

        System.out.println("Naboer: " + lei.antallNaboer());
        lei.registrerNabo("venstre");
        lei.registrerNabo("hoyre");
        lei.registrerNabo("sdf");
        System.out.println("Naboer: " + lei.antallNaboer());

        Enebolig enebolig = new Enebolig(1242, "bydgdoy", 4);
        enebolig.male();

        Stue stue = new Stue(23, true);
        Soverom soverom = new Soverom(20, false, stue);

        lei.leggTilRom(stue);
        lei.leggTilRom(soverom);

        int str = lei.hentAreal();
        System.out.println("Størrelse: " + str);

Rekkehus rekkehuse = new Rekkehus(1243, "addresse", 2);
// rekkehuse.registrerNabo("Venstre");
rekkehuse.registrerNabo("hoyre");

        
    }
}
