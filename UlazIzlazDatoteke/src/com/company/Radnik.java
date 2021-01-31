package com.company;

public class Radnik {
    private String ime;
    private long jmbg;
    private int stza;
    private double plata;

    public Radnik() {
    }

    public Radnik(String ime, long jmbg, int stza, double plata) {
        this.ime = ime;
        this.jmbg = jmbg;
        this.stza = stza;
        this.plata = plata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public long getJmbg() {
        return jmbg;
    }

    public void setJmbg(long jmbg) {
        this.jmbg = jmbg;
    }

    public int getStza() {
        return stza;
    }

    public void setStza(int stza) {
        this.stza = stza;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", jmbg=" + jmbg +
                ", stza=" + stza +
                ", plata=" + plata +
                '}';
    }
}
