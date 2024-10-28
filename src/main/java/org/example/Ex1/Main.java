package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Observer!");

        Aeroporto obsAero=new Aeroporto();
        Prefeitura obsPref=new Prefeitura();

        CET sujCet = new CET();
        sujCet.addObserver(obsAero);
        sujCet.addObserver(obsPref);
        sujCet.setInfos(32.0, 114.0,20.0);

        sujCet.setUmidade(25.0);
        sujCet.setVento(45.0);


    }
}