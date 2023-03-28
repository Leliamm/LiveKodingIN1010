public class AListeSortert< K extends Comparable <K>, V> extends AListe <K, V> {
    @Override
    public void settInn(K nokkel, V verdi){
        // 1. tom liste

        if(slutt == null){
            super.settInn(nokkel, verdi);
            return;
        }

        // 2. skal inn i starten
        Node nyNode = new Node (nokkel, verdi);
            if(nokkel.compareTo(start.nokkel) < 0){
                start.forrige = nyNode;
                start = nyNode;
                return;
            }
            //skal inn bakerst
            if(nokkel.compareTo(slutt.nokkel) > 0){
                super.settInn(nokkel, verdi);               
                return;
            }

    

        // 3. skal fikke riktig plass
        Node peker = start;
        while(peker.nokkel.compareTo(nokkel) < 0){
            peker = peker.neste;
        }
        peker.forrige.neste = nyNode;
        nyNode.forrige = peker.forrige;
        nyNode.neste = peker;
        peker.forrige = nyNode;
    }
}
