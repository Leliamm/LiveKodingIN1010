public class HarNokNaboer extends RuntimeException{
  

        public HarNokNaboer(String typeBolig, String hvor){
           super(typeBolig + "Kan ikke ha en nabo " + hvor);
        
   }
   
}
