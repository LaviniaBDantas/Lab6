package org.example.Ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mercado financeiro!!");

        Acao acao = new Acao();
        Investidor investidor = new Investidor();
        acao.addObservador(investidor);

        AcaoBroker corretor= new AcaoBroker();
        investidor.addObservador(corretor);
        investidor.setLimMax(1000.00);

        acao.setValor(1000.00);

    }
}
