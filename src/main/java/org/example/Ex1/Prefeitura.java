package org.example.Ex1;

public class Prefeitura implements IObservador {
    @Override
    public void update(Sujeito sujeito) {
        System.out.println("Prefeitura alerta umidade do ar: "+sujeito.getUmidade());
    }
}
