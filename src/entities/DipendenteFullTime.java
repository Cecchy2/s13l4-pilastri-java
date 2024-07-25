package entities;

import enums.Dipartimenti;

public class DipendenteFullTime extends Dipendente {

    //costruttori
    public DipendenteFullTime(int matricola, double stipendio, Dipartimenti dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public DipendenteFullTime(int matricola, Dipartimenti dipartimento) {
        super(matricola, 0, dipartimento);

        calculateSalary();

    }


    @Override
    public void calculateSalary() {
        double stipendioMensile = 3000.00;
        this.stipendio = stipendioMensile;

    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "stipendio=" + stipendio +
                '}';
    }


    @Override
    public void checkIn() {

    }
}
