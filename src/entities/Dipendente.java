package entities;

import enums.Dipartimenti;

public class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimenti dipartimento;


    //lista costruttori

    public Dipendente(int matricola, double stipendio, Dipartimenti dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


    //lista metodi


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
