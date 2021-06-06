package ar.urnr.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

public class DecoradorAtxt implements Medida{

    private File file;
    private Medida medida;

    public DecoradorAtxt(String file,Medida medida){
        this.file = new File(file);
        this.medida = medida;
    }

    @Override
    public String leerTemperatura() {
        String temperatura = this.medida.leerTemperatura();
        try (Writer writer = new FileWriter(file, true)) {
            writer.write(temperatura + " " + LocalDateTime.now() + "\n");
            return "persistido";
        } catch (IOException e) {
            throw new RuntimeException("No se pudo registrar la temperatura", e);
        }
    }
}
