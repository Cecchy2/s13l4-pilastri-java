import entities.*;
import enums.Dipartimenti;
import interfaces.Lavoratore;

public class Main {
    public static void main(String[] args) {

        /*-----------------------ESERCIZIO!------------------*/

        /*Dipendente dipendente1 = new Dipendente(4434552, 20000.00, PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(5663228, 40000.00, VENDITE);
        Dipendente dipendente3 = new Dipendente(4434552, 50000.00, AMMINISTRAZIONE);


        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Le matricole dei dipendenti sono: " + dipendenti[i].getMatricola());

        }*/

        /*-----------------------ESERCIZIO 2-----------------*/

        /*Dipendente[] dipendenti = new Dipendente[6];


        dipendenti[0] = new DipendenteFullTime(4434552, Dipartimenti.PRODUZIONE);
        dipendenti[1] = new DipendenteFullTime(4598877, Dipartimenti.VENDITE);
        dipendenti[2] = new DipendentePartTime(5663228, Dipartimenti.VENDITE);
        dipendenti[3] = new DipendentePartTime(4594305, Dipartimenti.PRODUZIONE);
        dipendenti[4] = new Dirigente(2345345, Dipartimenti.AMMINISTRAZIONE);
        dipendenti[5] = new Dirigente(6543873, Dipartimenti.AMMINISTRAZIONE);


        double stipendioTotale = 0;

        for (int i = 0; i < dipendenti.length; i++) {

            stipendioTotale += dipendenti[i].getStipendio();

            System.out.println(stipendioTotale);


        }

    }*/
        /*----------------ESERCIZIO3-------------------*/

        Lavoratore[] lavoratori = new Lavoratore[8];


        lavoratori[0] = new DipendenteFullTime(4434552, Dipartimenti.PRODUZIONE);
        lavoratori[1] = new DipendenteFullTime(4598877, Dipartimenti.VENDITE);
        lavoratori[2] = new DipendentePartTime(5663228, Dipartimenti.VENDITE);
        lavoratori[3] = new DipendentePartTime(4594305, Dipartimenti.PRODUZIONE);
        lavoratori[4] = new Dirigente(2345345, Dipartimenti.AMMINISTRAZIONE);
        lavoratori[5] = new Dirigente(6543873, Dipartimenti.AMMINISTRAZIONE);
        lavoratori[6] = new Volontario("Diego Armando", 25, "CV di Diego");
        lavoratori[7] = new Volontario("Bruce Willis", 70, "CV di Bruce");


        double stipendioTotale = 0;

        for (int i = 0; i < lavoratori.length; i++) {

            lavoratori[i].checkIn();

            if (lavoratori[i] instanceof Dipendente) {
                Dipendente dipendente = (Dipendente) lavoratori[i];
                stipendioTotale += dipendente.getStipendio();
            }
        }
        System.out.println("Il totale degli stipendi è: " + stipendioTotale + "questo mese");
    }
}
