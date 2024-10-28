package org.example.Ex2;

public class AcaoBroker implements IObservador{
    @Override
    public void update(Sujeito sujeito) {
        System.out.println("Ações devem ser vendidas!!");
    }
}
