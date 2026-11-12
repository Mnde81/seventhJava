package lt.vcd1;

public class Preke {
    private String pavadinimas;
    private double kaina;
    private int kiekis;

    public Preke(int kiekis, double kaina, String pavadinimas) {
        this.kiekis = kiekis;
        this.kaina = kaina;
        this.pavadinimas = pavadinimas;
    }

    public Preke(String pavadinimas, double kaina) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
    }

    public int getKiekis() {
        return kiekis;
    }

    public void setKiekis(int kiekis) {
        this.kiekis = kiekis;
    }

    public double getKaina() {
        return kaina;
    }

    public void setKaina(double kaina) {
        this.kaina = kaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }


    @Override
    public String toString() {
        return pavadinimas+",Turimas kiekis: "+kiekis+", Kaina: " +kaina;
    }

    public double kainaSuPVM(){
        return kaina *1.21;
    }

}
