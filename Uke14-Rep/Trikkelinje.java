import java.util.Scanner;
import java.io.File;

public class Trikkelinje {
    protected  int linjenr;
    protected String endeHoldeplass;
    protected Holdeplass forste, siste;

    public Trikkelinje(String filNavn){
            lesFraFil(filNavn);
    }

    public void lesFraFil( String filnavn){
        Scanner scanner = null;
        try{
            scanner = new Scanner (new File(filnavn));

        } catch (Exception e) {
            System.out.println("Fant ikke filen");
            System.exit(1);
        }

        String [] info = scanner.nextLine().split(";");
        linjenr = Integer.parseInt(info[0]);
        endeHoldeplass = info[1];
        Holdeplass forrige = null;
        while(scanner.hasNextLine()){
            String navn = scanner.nextLine();
            Holdeplass ny = new Holdeplass(navn);
            System.out.println(navn);

            if(forste == null){
                forste = ny;
            }
            if(forrige != null){
                forrige.neste  = ny;
                ny.forrige = forrige;
            }
            forrige = ny;

        }
        siste = forrige; //etter while fordi når while er ferdig har vi tilgagng til den siste
    }

    public String hentUtRute (String fra, String til){
        String rute = "";
        Holdeplass peker = forste;

        //finne fra holdeplass
        while (peker != null){
            if (peker.hentNavn().equals(fra)){
                while(peker != null){
                    //finner til holdeplass
                    if(peker.hentNavn().equals(til)){
                        return "Fra " + fra + ": "+ rute;
                    }
                    peker = peker.neste;
                    rute += "-> " + peker.hentNavn();
                    
                }
            }
            
        }
        return "Fant ikke holdeplass";

    }

    public int antallStoppFra(Holdeplass fra, Holdeplass til, int antall){
        if(fra == null){//finner ikke fra
            return antall;
        }
        if(fra.hentNavn().equals(til.hentNavn())){
            return antall;
        }
        return antallStoppFra(fra.neste, til, antall + 1);
    }

    public Holdeplass hentHoldeplass(String navn){
        Holdeplass peker = forste;
        while (peker != null){
            if(peker.hentNavn().equals(navn)){
                return peker;
            }
            peker = peker.neste;
        }
        return null; //hvis den ikke finner holdeplassen
    }

    //allternativ:

    public Holdeplass hentHoldeplassFraSiste(String navn){
        Holdeplass peker = siste;
        while (peker != null){
            if(peker.hentNavn().equals(navn)){
                return peker;
            }
            peker = peker.forrige;
        }
        return null; //hvis den ikke finner holdeplassen
    }


    public void settForste(Holdeplass h){
        forste = h;
    }
    public Holdeplass hentForste(){
        return forste;
    }

    @Override
    public String toString(){
        return "Linnje: " + linjenr + " " + this.endeHoldeplass;
    }
}
