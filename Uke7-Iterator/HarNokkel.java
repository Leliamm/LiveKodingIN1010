public class HarNokkel extends RuntimeException {
    public HarNokkel(String nokkel){
        super("feil " + nokkel + " -nokkel finnes allrede i lista.");
    }
}
