
package jidlomain;


public class Penize {
    private int početJednokorun;
    private int početDvoukorun;
    private int početPětiKorun;

    public Penize(int početJednokorun, int početDvoukorun, int početPětiKorun) {
        this.početJednokorun = početJednokorun;
        this.početDvoukorun = početDvoukorun;
        this.početPětiKorun = početPětiKorun;
    }

    public int getPočetJednokorun() {
        return početJednokorun;
    }

    public int getPočetDvoukorun() {
        return početDvoukorun;
    }

    public int getPočetPětiKorun() {
        return početPětiKorun;
    }

    public void setPočetJednokorun(int početJednokorun) {
        this.početJednokorun = početJednokorun;
    }

    public void setPočetDvoukorun(int početDvoukorun) {
        this.početDvoukorun = početDvoukorun;
    }

    public void setPočetPětiKorun(int početPětiKorun) {
        this.početPětiKorun = početPětiKorun;
    }

    @Override
    public String toString() {
        return "Peníze{" +
                "početJednokorun=" + početJednokorun +
                ", početDvoukorun=" + početDvoukorun +
                ", početPětiKorun=" + početPětiKorun +
                '}';
    }
}

