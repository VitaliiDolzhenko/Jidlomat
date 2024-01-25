
package jidlomain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Jidlomat {
    private String jmeno;
    private ArrayList<Polozka> položky;

    public Jidlomat() {
        this.položky = new ArrayList<>();
    }

    public void přidejPoložku(Polozka položka) {
        položky.add(položka);
    }

    public void vypišPoložky() {
        for (Polozka položka : položky) {
            System.out.println(položka.toString());
        }
    }

    public Penize kupPoložku(int kód, int vloženéPeníze) {
        for (Polozka položka : položky) {
            if (položka.getKód() == kód) {
                if (položka.getCena() <= vloženéPeníze && položka.getPočet() > 0) {
                    int vrácenéPeníze = vloženéPeníze - položka.getCena();
                    if (vrácenéPeníze >= 0) {
                        položka.setPočet(položka.getPočet() - 1);
                        return vrácenéMince(vrácenéPeníze);
                    } else {
                        System.out.println("Nedostatek peněz!");
                    }
                } else {
                    System.out.println("Položka není dostupná nebo nedostatek peněz!");
                }
            }
        }
        System.out.println("Položka nenalezena!");
        return null;
    }

    private Penize vrácenéMince(int částka) {
        int početPětiKorun = částka / 5;
        částka %= 5;
        int početDvoukorun = částka / 2;
        int početJednokorun = částka % 2;
        return new Penize(početJednokorun, početDvoukorun, početPětiKorun);
    }

    public int cenaVšechPoložek() {
        int celkováCena = 0;
        for (Polozka položka : položky) {
            celkováCena += položka.getCena() * položka.getPočet();
        }
        return celkováCena;
    }

    public void načtiPoložkyZeSouboru(String souborCesta) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(souborCesta))) {
            
            jmeno = bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


