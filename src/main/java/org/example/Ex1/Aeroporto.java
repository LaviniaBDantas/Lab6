package org.example.Ex1;

public class Aeroporto implements IObservador {
    @Override
    public void update(Sujeito sujeito) {
        System.out.println("Aeroporto alerta rajada de vento: "+sujeito.getVento());
    }
}
