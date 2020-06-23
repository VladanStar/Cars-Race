package com.company;

public class Automobil {
    private double maxBrzina;
    private double ubrzanje;
    private String naziv;

    public Automobil() {
    }

    public Automobil(double maxBrzina, double ubrzanje, String naziv) {
        this.maxBrzina = maxBrzina;
        this.ubrzanje = ubrzanje;
        this.naziv = naziv;
    }

    public double getMaxBrzina() {
        return maxBrzina;
    }

    public void setMaxBrzina(double maxBrzina) {
        this.maxBrzina = maxBrzina;
    }

    public double getUbrzanje() {
        return ubrzanje;
    }

    public void setUbrzanje(double ubrzanje) {
        this.ubrzanje = ubrzanje;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "maxBrzina=" + maxBrzina +
                ", ubrzanje=" + ubrzanje +
                ", naziv='" + naziv + '\'' +
                '}';
    }
}
