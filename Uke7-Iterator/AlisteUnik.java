public class AlisteUnik <K, V> extends AListe<K, V> {

    @Override
    public void settInn(K nokkel, V verdi){
        if(harNokkel(nokkel)){
            throw new HarNokkel(nokkel.toString());
        }
        super.settInn(nokkel, verdi);
    }
    
}
