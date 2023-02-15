import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

public class StudentSystem {
    private Emne [] emner;
    private HashMap <Integer, Student> studenter = new HashMap<Integer, Student>();;

    public StudentSystem(String filNavn, Emne[] e){
        emner = e;
    }
    public void lesFraFil(String filnavn){
        Scanner sc = null;
try {
    File fil = new File(filnavn);
    sc = new Scanner(fil);
    
} catch (Exception e) {
    System.out.println("FAnt ikke filen.");
}
while(sc.hasNextLine()){
    String navn = sc.nextLine();
    System.out.println(navn);
}
}
    }

