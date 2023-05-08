public class Hovedprogram {
    public static void main (String [] args){
        Menneske Jonas = new Menneske(null, null, 32, "Jonas");
        Menneske mamma = new Menneske (62, "mamma");
        Menneske pappa = new Menneske (66, "pappa");

        Jonas.settMor(mamma);
        Jonas.setFar(pappa);

        Menneske mormor = new Menneske (82, "mormor");
        Menneske morfar = new Menneske (96, "morfar");
        mamma.settMor(mormor);
        mamma.setFar(morfar);


        Menneske farmor = new Menneske (662, "farmor");
        Menneske farfar = new Menneske (543, "farfar");
        pappa.settMor(farmor);
        pappa.setFar(farfar);
        farmor.settMor(new Menneske(89, "oldemor"));

        String familietre = Jonas.hentFalimietre();
        System.out.println(familietre);

        System.out.println("");
        pappa.finnRelasjon(farmor);
        Jonas.finnRelasjon(farfar);

        Menneske eldste = Jonas.finnEldsteIFamilieTre();
        System.out.println(eldste);

    }
}
