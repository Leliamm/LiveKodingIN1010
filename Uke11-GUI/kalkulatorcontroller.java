public class KalkulatorController {
    private KalkulatorModel model;
    private KalkulatorView view;

    public void start() {
        model = new KalkulatorModel();
        view = new KalkulatorView(this);
    }

    public void leggTil(){
        double tall1 = view.hentTall1();
        double tall2 = view.hentTall2();
        model.leggTil(tall1, tall2);
        double resultat = model.hentResultat();
        view.setResultat(resultat);
    }

    public void trekkFra(){
        double tall1 = view.hentTall1();
        double tall2 = view.hentTall2();
        model.trekkFra(tall1, tall2);
        double resultat = model.hentResultat();
        view.setResultat(resultat);
    }

    public void gange(){
        double tall1 = view.hentTall1();
        double tall2 = view.hentTall2();
        model.gange(tall1, tall2);
        double resultat = model.hentResultat();
        view.setResultat(resultat);
    }

    public void dele(){
        double tall1 = view.hentTall1();
        double tall2 = view.hentTall2();
        model.dele(tall1, tall2);
        double resultat = model.hentResultat();
        view.setResultat(resultat);
    }
    
}
