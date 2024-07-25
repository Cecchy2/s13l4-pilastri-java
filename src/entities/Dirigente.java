package entities;

import enums.Dipartimenti;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, double stipendio, Dipartimenti dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public Dirigente(int matricola, Dipartimenti dipartimento) {
        super(matricola, 0, dipartimento);

        calculateSalary();

    }


    @Override
    public void calculateSalary() {
        double stipendioMensile = 7000.00;
        this.stipendio = stipendioMensile;
    }

    @Override
    public String toString() {
        return "Dirigente{" +
                "stipendio=" + stipendio +
                '}';
    }

    @Override
    public void checkIn() {

    }
}
