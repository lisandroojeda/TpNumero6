package ar.urnr.model;

import java.util.Random;

public class WeatherChannelService implements ClimaOnline {

    @Override
    public String temperatura() {
        int temp = new Random().nextInt(100);
        return temp + " c";
    }

}
