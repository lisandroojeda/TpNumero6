package ar.unrn.model;

import ar.unrn.model.Observer;

public class ConsolaDatos implements Observer {
    @Override
    public void actualizar(String temperatura) {
        int temperaturaNumerica = esNumero(temperatura);
        if (temperaturaNumerica<12)
            System.out.println("Hace frio se encenderá la caldera");
        if (temperaturaNumerica>17)
            System.out.println("Hace calor se encenderá el aire acondicionado");
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
