import java.util.*;
public class Student {
    //private pga inkapselering. beskytter variablene for andre klasser
    private String navn;
    private int studentid;
    private ArrayList<Emne> emner = new ArrayList <Emne>();

    public Student(String n, int id){
        navn = n;
        studentid = id;
        emner = new ArrayList <Emne>();
    }
    public int hentStudID(){
        return studentid;
    }

    public String hentNavn(){
        return navn;
    }
    
    public void leggTilEmne(Emne e){
        emner.add(e);
    }
    public void skrivUtEmner(){
        for(Emne e: emner){
            System.out.println(e.hentEmneKode());
        }
    }

    public void fjernTilEmne(Emne e){
        emner.remove(e);
    }
}
