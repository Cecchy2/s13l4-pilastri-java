package entities;

import enums.Dipartimenti;
import interfaces.Lavoratore;

public abstract class Dipendente implements Lavoratore {
    protected double stipendio;
    private int matricola;
    private Dipartimenti dipartimento;

    //lista costruttori-------------------

    public Dipendente(int matricola, double stipendio, Dipartimenti dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //lista metodi-------------------------

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + matricola + " ha iniziato il suo turno.");
    }

    public abstract void calculateSalary();

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }
}
