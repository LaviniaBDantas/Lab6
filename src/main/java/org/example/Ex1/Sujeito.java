package org.example.Ex1;

import java.util.ArrayList;

public class Sujeito {
    private ArrayList<IObservador>observadores=new ArrayList<>();
    private Double temp;
    private Double vento;
    private Double umidade;

    public void addObserver(IObservador IObservador){
        observadores.add(IObservador);
    }

    public Double getTemp() {
        return temp;
    }

    public Double getVento() {
        return vento;
    }

    public Double getUmidade() {
        return umidade;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
        notificaObs();
    }

    public void setVento(Double vento) {
        this.vento = vento;
        notificaObs();
    }

    public void setUmidade(Double umidade) {
        this.umidade = umidade;
        notificaObs();
    }

    public void setInfos(Double temp, Double velocidade, Double umidade){
        this.temp=temp;
        this.vento =velocidade;
        this.umidade=umidade;
        notificaObs();
    }

    public void notificaObs(){
        for (IObservador obs:observadores) {
            obs.update(this);
        }
    }
}
