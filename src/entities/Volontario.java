package entities;

import interfaces.Lavoratore;

public class Volontario implements Lavoratore {
    private String nome;
    private int eta;
    private String cv;

    //lista costruttori-------------------

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    //lista metodi-------------------------

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Dipendente con matricola " + nome + " ha iniziato il suo turno.");
    }
}
