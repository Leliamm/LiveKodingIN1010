// Typeparameter K er nødt til aa arve fra Comparable
// Det vil si at den kan sammenlignes med et annet objekt av 
// typen K.
// Typeparameter V kan være hvilken som helst type   
public class AListeSortert<K extends Comparable<K>,V> 
            extends AListe<K,V> {
    @Override
    public void settInn(K nokkel, V verdi){
        // 1. tom liste
        if (slutt == null){
            super.settInn(nokkel, verdi);
            return;
        }

        Node nyNode = new Node(nokkel, verdi);

        // 2. skal inn i starten
        if (nokkel.compareTo(start.nokkel) < 0){
            nyNode.neste = start;
            start.forrige = nyNode;
            start = nyNode;
            return;
        }

        // 3. skal inn bakerst
        if (nokkel.compareTo(slutt.nokkel) > 0){
            super.settInn(nokkel, verdi);
            return;
        }

        // 4. eller må jobbe oss fram til riktig plass
        Node peker = start;
        while (peker.nokkel.compareTo(nokkel) < 0){
            peker = peker.neste;
        }
        peker.forrige.neste = nyNode;
        nyNode.forrige = peker.forrige;
        nyNode.neste = peker;
        peker.forrige = nyNode;
    }
}
