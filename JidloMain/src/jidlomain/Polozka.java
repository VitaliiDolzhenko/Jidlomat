
package jidlomain;


public class Polozka {
    private String nazev;
    private int cena;
    private int počet;
    private int kód;

    public Polozka(String nazev, int cena, int počet, int kód) {
        this.nazev = nazev;
        this.cena = cena;
        this.počet = počet;
        this.kód = kód;
    }

    public String getNázev() {
        return nazev;
    }

    public int getCena() {
        return cena;
    }

    public int getPočet() {
        return počet;
    }

    public int getKód() {
        return kód;
    }

    public void setPočet(int počet) {
        this.počet = počet;
    }

    @Override
    public String toString() {
        return "Položka{" +
                "název='" + nazev + '\'' +
                ", cena=" + cena +
                ", počet=" + počet +
                ", kód=" + kód +
                '}';
    }
}

    

