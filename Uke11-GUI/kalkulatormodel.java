public class KalkulatorModel {
    private double resultat;

    public double hentResultat(){
        return resultat;
    }

    public void leggTil(double tall1, double tall2){
        resultat = tall1 + tall2;
    }

    public void trekkFra(double tall1, double tall2){
        resultat = tall1 - tall2;
    }

    public void gange(double tall1, double tall2){
        resultat = tall1 * tall2;
    }

    public void dele(double tall1, double tall2){
        if (tall2 == 0) {
            throw new IllegalArgumentException("Kan ikke dele på 0");
        }
        resultat = tall1 / tall2;
    }
}
