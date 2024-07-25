import entities.Dipendente;

import static enums.Dipartimenti.*;

public class Main {
    public static void main(String[] args) {

        Dipendente dipendente1 = new Dipendente(4434552, 20000.00, PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(5663228, 40000.00, VENDITE);
        Dipendente dipendente3 = new Dipendente(4434552, 50000.00, AMMINISTRAZIONE);


        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Le matricole dei dipendenti sono: " + dipendenti[i].getMatricola());

        }


    }


}
