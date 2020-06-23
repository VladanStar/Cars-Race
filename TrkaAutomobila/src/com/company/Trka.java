package com.company;

public class Trka {
    private Automobil lambordzini;
    private Automobil bugati;
    private double kilometrazaPrvi;
    private double kilometrazaDrugi;
    private int vremeTrka = 1;
    private Automobil pobednik;

    public Trka() {
    }

    public Trka(Automobil lambordzini, Automobil bugati, double cilj) {
        this.lambordzini = lambordzini;
        this.bugati = bugati;

        while(kilometrazaPrvi< cilj && kilometrazaDrugi <cilj){
            double brzinaPrvi = vremeTrka*lambordzini.getUbrzanje();
            if(brzinaPrvi > lambordzini.getMaxBrzina()){
                brzinaPrvi = lambordzini.getMaxBrzina();
            }
            double brzinaDrugi = vremeTrka*bugati.getUbrzanje();
            if(brzinaDrugi > bugati.getMaxBrzina()){
                brzinaDrugi = bugati.getMaxBrzina();
            }
            kilometrazaPrvi += brzinaPrvi;
            kilometrazaDrugi += brzinaDrugi;
            vremeTrka++;
        }
        pobednik = (kilometrazaPrvi >kilometrazaDrugi) ? lambordzini :bugati;

    }

    public Automobil getPobednik() {
        return pobednik;
    }
}
