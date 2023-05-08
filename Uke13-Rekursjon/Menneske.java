public class Menneske {
    private Menneske mor, far;
    private int alder;
    private String navn;

    public Menneske(Menneske mor, Menneske far, int alder, String navn) {
        this.mor = mor;
        this.far = far;
        this.alder = alder;
        this.navn = navn;
    }

    // overloading - samme metode navn, ulik signatur.
    public Menneske(int alder, String navn) {
        this.alder = alder;
        this.navn = navn;
    }

    public void settMor(Menneske mor) {
        this.mor = mor;
    }

    public void setFar(Menneske far) {
        this.far = far;
    }

    public String hentFalimietre() {
        return familieRekursjon(""); // Starter rekursjive tall
    }

    public String familieRekursjon(String utskrift) {
        String tekst = "\n" + utskrift + this;
        if (mor == null && far == null) {
            return tekst;
        }
        if (mor != null) {
            tekst += mor.familieRekursjon(utskrift + "  ");
        }
        if (far != null) {
            tekst += far.familieRekursjon(utskrift + "  ");
        }
        return tekst;
    }

    public void finnRelasjon(Menneske letterEtter) {
        finnRelasjon(letterEtter, "");
    }

    private void finnRelasjon(Menneske letterEtter, String relasjon) {
        // basis
        if (this == letterEtter) {
            System.out.println("Navn: "+ this.navn + " relasjon: " + relasjon);
            return;
        }
        // rekursjive kall
        if (mor != null) {
            mor.finnRelasjon(letterEtter, relasjon + mor);
        }

        if (far != null) {
            far.finnRelasjon(letterEtter, relasjon + far);
        }
    }

    public Menneske finnEldsteIFamilieTre(){
        if(mor == null && far == null){
            return this;
        }

        Menneske eldsteMorSide = null;
        Menneske eldsteFarSide = null;

        if(mor != null){
            eldsteFarSide = mor.finnEldsteIFamilieTre();
        }
        if(far != null){
            eldsteFarSide = far.finnEldsteIFamilieTre();
        }

        Menneske eldste = this;
        if(eldsteMorSide != null && eldste.alder < eldsteMorSide.alder){
            eldste = eldsteMorSide;
        }
        if(eldsteFarSide != null && eldste.alder < eldsteFarSide.alder){
            eldste = eldsteFarSide;
        }
        return eldste;

    }

    @Override
    public String toString() {
        return navn + "(" + alder + ")";
    }
}
