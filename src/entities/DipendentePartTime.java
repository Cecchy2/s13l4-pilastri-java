package entities;

import enums.Dipartimenti;

public class DipendentePartTime extends Dipendente {
    int oreDiLavoro = 40;

    public DipendentePartTime(int matricola, double stipendio, Dipartimenti dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    public DipendentePartTime(int matricola, Dipartimenti dipartimento) {
        super(matricola, 0, dipartimento);

        calculateSalary();

    }

    @Override
    public void calculateSalary() {
        double stipendioOra = 25.00;
        this.stipendio = stipendioOra * oreDiLavoro;
    }

    public int getOreDiLavoro() {
        return oreDiLavoro;
    }

    @Override
    public String toString() {
        return "DipendentePartTime{" +
                "oreDiLavoro=" + oreDiLavoro +
                ", stipendio=" + stipendio +
                '}';
    }


    @Override
    public void checkIn() {

    }
}
