
package jidlomain;

public class JidloMain {

    
    public static void main(String[] args) {
        
        Jidlomat jídlomat = new Jidlomat();

        // Přidání položek do jídlomatu
        jídlomat.přidejPoložku(new Polozka("Sendvič", 30, 5, 1));
        jídlomat.přidejPoložku(new Polozka("Káva", 20, 10, 2));
        jídlomat.přidejPoložku(new Polozka("Rohlík", 10, 8, 3));

        // Vypsání položek v jídlomatu
        System.out.println("Položky v jídlomatu:");
        jídlomat.vypišPoložky();

        // Simulace nákupu
        int kódPoložky = 2; // Káva
        int vloženéPeníze = 25;

        System.out.println("Nákup: Káva");
        Penize vrácenéMince = jídlomat.kupPoložku(kódPoložky, vloženéPeníze);

        // Vypsání výsledku nákupu
        if (vrácenéMince != null) {
            System.out.println("Nákup úspěšný!");
            System.out.println("Zbývající mince: " + vrácenéMince.toString());
        } else {
            System.out.println("Nákup neúspěšný!");
        }

        // Vypsání celkové ceny všech položek v jídlomatu
        System.out.println("Celková cena všech položek: " + jídlomat.cenaVšechPoložek());

        // Načtení položek ze souboru
        jídlomat.načtiPoložkyZeSouboru("jidlomat.csv");
        System.out.println("Položky po načtení ze souboru:");
        jídlomat.vypišPoložky();
    }
       
    }
    

