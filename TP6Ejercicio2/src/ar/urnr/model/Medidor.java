package ar.urnr.model;

public class Medidor implements Medida{
    private String temperatura;
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima) {
        this.clima = clima;
    }

    public String leerTemperatura() {
        this.temperatura = this.clima.temperatura();
        return this.temperatura;
    }

}
