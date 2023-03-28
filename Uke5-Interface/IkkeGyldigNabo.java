public class IkkeGyldigNabo extends RuntimeException {

     public IkkeGyldigNabo(String typeBolig, String hvor){
        super(typeBolig + "Kan ikke ha en nabo " + hvor);
     }
}
