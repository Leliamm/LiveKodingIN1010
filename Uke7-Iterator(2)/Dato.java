public class Dato implements Comparable<Dato> {
    // 13.mars 2023 -> 13 03 2023
    private int dag, maaned, aar;

    public Dato(int dag, int maaned, int aar){
        this.dag = dag;
        this.maaned = maaned;
        this.aar = aar;
    }
    
    // < 0 objektet er mindre enn det andre
    // = 0 objektet er likt det andre
    // > 0 objektet er større enn det andre
    
    @Override
    public int compareTo(Dato annenDato){
        if (aar > annenDato.aar) return 1;
        if (aar < annenDato.aar) return -1;
        if (maaned > annenDato.maaned) return 1;
        if (maaned < annenDato.maaned) return -1;
        if (dag > annenDato.dag) return 1;
        if (dag < annenDato.dag) return -1;
        return 0;
    }

    @Override 
    public String toString(){
        return dag + "." + maaned + "." + aar;
    }
}
