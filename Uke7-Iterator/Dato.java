public class Dato implements Comparable <Dato> {
    private int dag, maned, ar;

    public Dato (int dag, int maned, int ar){
        this.dag = dag;
        this.maned = maned;
        this.ar = ar;
    }

    @Override
    public int compareTo( Dato annenDato){
        if(ar < annenDato.ar){
            return -1;
        }else if(ar > annenDato.ar){
            return 1;
        }
        if(maned < annenDato.maned){
            return -1;
        }else if(maned > annenDato.maned){
            return 1;
        }
        if(dag < annenDato.dag){
            return -1;
        }else if(dag > annenDato.dag){
            return 1;
        }
        return 0;
    }
    
@Override
public String toString(){
    return dag + "." + maned + "." + ar;
}

}
