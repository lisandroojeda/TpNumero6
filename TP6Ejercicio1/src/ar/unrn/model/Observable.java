package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> observadores;

    public Observable(){
        observadores = new ArrayList<>();
    }

    public void agregarObservadores(Observer obs){
        this.observadores.add(obs);
    }

    protected void notificar(String valor){
        for(Observer observer: observadores){
            observer.actualizar(valor);
        }
    }
}
