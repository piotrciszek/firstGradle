package firstGradle;

public class Pociag {

    private String identyfikator;
    private int numerPociagu;
    private KlasaPociagu klasa;
    private int maxOpoznienie;
    private int dlugoscPodrozy;
    private int cenaPodrozy;
    private int przebieg;
    private boolean czyPosiadaWagonSypialny;

    @Override
    public String toString() {
        return "Pociag{" +
                "identyfikator='" + identyfikator + '\'' +
                ", numerPociagu=" + numerPociagu +
                ", klasa=" + klasa +
                ", maxOpoznienie=" + maxOpoznienie +
                ", dlugoscPodrozy=" + dlugoscPodrozy +
                ", cenaPodrozy=" + cenaPodrozy +
                ", przebieg=" + przebieg +
                ", czyPosiadaWagonSypialny=" + czyPosiadaWagonSypialny +
                '}';
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public void setIdentyfikator(String identyfikator) {
        this.identyfikator = identyfikator;
    }

    public int getNumerPociagu() {
        return numerPociagu;
    }

    public void setNumerPociagu(int numerPociagu) {
        this.numerPociagu = numerPociagu;
    }

    public KlasaPociagu getKlasa() {
        return klasa;
    }

    public void setKlasa(KlasaPociagu klasa) {
        this.klasa = klasa;
    }

    public int getMaxOpoznienie() {
        return maxOpoznienie;
    }

    public void setMaxOpoznienie(int maxOpoznienie) {
        this.maxOpoznienie = maxOpoznienie;
    }

    public int getDlugoscPodrozy() {
        return dlugoscPodrozy;
    }

    public void setDlugoscPodrozy(int dlugoscPodrozy) {
        this.dlugoscPodrozy = dlugoscPodrozy;
    }

    public int getCenaPodrozy() {
        return cenaPodrozy;
    }

    public void setCenaPodrozy(int cenaPodrozy) {
        this.cenaPodrozy = cenaPodrozy;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public boolean isCzyPosiadaWagonSypialny() {
        return czyPosiadaWagonSypialny;
    }

    public void setCzyPosiadaWagonSypialny(boolean czyPosiadaWagonSypialny) {
        this.czyPosiadaWagonSypialny = czyPosiadaWagonSypialny;
    }

    public Pociag(String identyfikator, int numerPociagu, KlasaPociagu klasa, int maxOpoznienie, int dlugoscPodrozy, int cenaPodrozy, int przebieg, boolean czyPosiadaWagonSypialny) {
        this.identyfikator = identyfikator;
        this.numerPociagu = numerPociagu;
        this.klasa = klasa;
        this.maxOpoznienie = maxOpoznienie;
        this.dlugoscPodrozy = dlugoscPodrozy;
        this.cenaPodrozy = cenaPodrozy;
        this.przebieg = przebieg;
        this.czyPosiadaWagonSypialny = czyPosiadaWagonSypialny;


    }
}
