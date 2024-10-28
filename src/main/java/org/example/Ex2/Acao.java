package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Acao extends Sujeito {
    private Double valor;

    List<IObservador> investidores =new ArrayList<>();

    public void addObservador(IObservador o){
        investidores.add(o);
    }
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
        NotifyObservers(investidores);
    }
}
