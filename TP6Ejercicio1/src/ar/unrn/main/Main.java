package ar.unrn.main;

import ar.unrn.model.*;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Medidor medir = new Medidor(new WeatherChannelService(),List.of(new ConsolaDatos(),new TXTdatos("docuemento1")));
        medir.leerTemperatura();
    }
}
