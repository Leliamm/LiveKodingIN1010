import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class KjoretoySamling {


    private ArrayList <Kjoretoy> alleKjoretoy = new ArrayList<>();

    public KjoretoySamling(String Filnavn){
        lesFil(Filnavn);
    }

    public void printMerker(){
        System.out.println(" --- Merker ----");
        for(Kjoretoy kjoretoy : alleKjoretoy){
            System.out.println(kjoretoy.merke);
        }
    }

    private void lesFil(String filnavn){
        Scanner sc = null;
        try {
            sc = new Scanner(new File(filnavn));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not found.");
            return;
        }

        while (sc.hasNextLine()){
            String linje = sc.nextLine();
            String [] splittet = linje.split(";");
            String type = splittet[0];
            String regNr = splittet[1];
            String merke = splittet[2];
            String model = splittet[3];
            double hastighet = Double.parseDouble(splittet[4]);

            Kjoretoy kjoretoy = null;
            if(type.equals("bensinbil")){
                kjoretoy = new Bil(regNr, merke, model, hastighet);
            }else if (type.equals("Elektriskbil")){
                kjoretoy = new ELbil(regNr, merke, model, hastighet);
            }else if (type.equals("motorsykkel")){
                kjoretoy = new Motorsykkel(regNr, merke, model, hastighet);
            }
            else{
                System.out.println("Ugyldig kjøretøy.");
            }
            if (kjoretoy !=null){
                alleKjoretoy.add(kjoretoy);
            }
            
        }
    }

}
