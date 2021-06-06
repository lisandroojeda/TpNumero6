package ar.unrn.main;

import ar.urnr.model.*;

public class Main {
    public static void main(String [] args){
        Medida medida = new DecoradorAconsola(new DecoradorAtxt("documento",new Medidor(new WeatherChannelService())));
        medida.leerTemperatura();

    }
}
