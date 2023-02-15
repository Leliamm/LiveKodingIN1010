public class Emne {
    private String emneKode;
    private int maxAntallStudent;
    private Student[] studenter;
    private int antallStudenter = 0;

    public Emne(String e, int p) {
        emneKode = e;
        maxAntallStudent = p;
        studenter = new Student[maxAntallStudent];
    }

    public String hentEmneKode() {
        return emneKode;
    }

    public boolean harLedigPlass() {
        return maxAntallStudent > antallStudenter;
    }

    public void leggTilStudenter(Student s) {
        if (harLedigPlass()) {
            studenter[antallStudenter] = s;
            antallStudenter++;
        } else {
            System.out.println("Emnet er fult!");
        }
    }

}
