package ar.urnr.model;

public class DecoradorAconsola implements Medida {

    private Medida medida;

    public DecoradorAconsola(Medida medida) {
        this.medida = medida;
    }

    @Override
    public String leerTemperatura() {
        String temperatura = this.medida.leerTemperatura();
        int temperaturaNumerica = esNumero(temperatura);
        if (temperaturaNumerica < 12)
            System.out.println("Hace frio se encenderá la caldera");
        if (temperaturaNumerica > 17)
            System.out.println("Hace calor se encenderá el aire acondicionado");
        return temperatura;
    }



    private static int esNumero(String cadena) {
        try {
            String[] soloNumero = cadena.split(" ",0);
            return Integer.parseInt(soloNumero[0]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Valor inválido para evaluar la temperatura", e);
        }
    }

}
