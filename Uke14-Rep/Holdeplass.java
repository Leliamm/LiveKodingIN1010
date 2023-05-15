public class Holdeplass{
    private String navn;
    public Holdeplass neste, forrige;

    public Holdeplass(String navn){
        this.navn = navn;
    }

    public String hentNavn(){
        return this.navn;
    }

    @Override
    public String toString(){
        return "Holdeplass: " + this.navn;
    }
}