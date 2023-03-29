//disse to blir sammen en stabel
import java.util.Deque;
import java.util.ArrayDeque;

public class Stemmesystem {
    //stabel
    private Deque<Parti> stemmer = new ArrayDeque<>();

    public void leggTilStemme(Parti parti){
        stemmer.push(parti);
    }

    public Parti taUtStemme(){
        return stemmer.pop();
    }

    public boolean tomtForStemmer(){
        return stemmer.isEmpty();
    }
}
