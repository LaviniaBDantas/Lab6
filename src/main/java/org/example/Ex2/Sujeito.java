package org.example.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Sujeito {
    public void NotifyObservers(List<IObservador> lista){
        for(IObservador o : lista){
            o.update(this);
        }
    }

}
