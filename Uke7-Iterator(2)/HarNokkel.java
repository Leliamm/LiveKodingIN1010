public class HarNokkel extends RuntimeException {
    
    public HarNokkel(String nokkel){
        super("Feil: " + nokkel + " - nokkel finnes allerede i lista");
    }
}
