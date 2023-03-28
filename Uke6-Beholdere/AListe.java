public class AListe<K, V>{
   
    private Node start, slutt;
    private int størelse = 0;

    protected class Node {
        Node forrige, neste;
        K nokkel;
        V verdi;

        public Node(K n, V v){
            nokkel = n;
            verdi = v;
        }
    }

    public int hentStr(){
        return størelse;
    }

    public void settInn(K nokkel, V verdi){
        Node nyNode = new Node (nokkel, verdi);
        størelse ++;
        if(slutt == null){
            start = nyNode;
            slutt = nyNode;
            return;
        }
        slutt.neste = nyNode;
        nyNode.forrige = slutt;
        slutt = nyNode;
    }

    public V hent(K nokkel){
        Node peker = start;
        while(peker != null && !peker.nokkel.equals(nokkel)){
            peker = peker.neste;
        }
        return peker.verdi;
    }

    @Override
    public String toString(){
        String string = "";
        Node peker = start;
        while(peker != null){
            string += "\n->(Nokkel: " + peker.nokkel + ", Verdi: " + peker.verdi + ")";
            peker = peker.neste;
        }
        return string;
    }
}