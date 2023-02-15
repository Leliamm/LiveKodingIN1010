abstract public class Kjoretoy{
    protected String regNr, merke, model;
    protected double hastighet;

    public Kjoretoy (String r, String m, String md, double h){
        regNr = r;
        merke = m;
        model = md;
        hastighet = h;
    }

    public void beregnKjoreTid (double avstand){
        double tid = (avstand/hastighet)* 60;
        System.out.println("Det tar " +  tid + " å kjøre ditt.");
    }

}