package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Investidor  extends Sujeito implements IObservador{

    private Double limMin, limMax;
    private List<IObservador> corretores= new ArrayList<>();

    public void addObservador(IObservador o){
        corretores.add(o);
    }

    @Override
    public void update(Sujeito acao) {
        Double valor = (((Acao) acao).getValor());
        System.out.println("Acão atualizada: "+ valor);
        if(valor.equals(limMax)){
            NotifyObservers(corretores);
        }
    }

    public void setLimMin(Double limMin) {
        this.limMin = limMin;
    }

    public void setLimMax(Double limMax) {
        this.limMax = limMax;
    }
}
