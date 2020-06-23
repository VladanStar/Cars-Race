package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Automobil lambordzini = new Automobil(290, 10, "Lambordzini");
        Automobil bugati = new Automobil(250, 26, "Bugati");
        Trka trka = new Trka(lambordzini, bugati, 20000);
        System.out.println(trka.getPobednik());
    }
}
