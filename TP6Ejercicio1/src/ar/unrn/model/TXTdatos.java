package ar.unrn.model;

import ar.unrn.model.Observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;

public class TXTdatos implements Observer {

    private File file;

    public TXTdatos(String file) {
        this.file = new File(file);
    }

    @Override
    public void actualizar(String temperature) {
        try (Writer writer = new FileWriter(file, true)) {
            writer.write(temperature + " " + LocalDateTime.now() + "\n");
        } catch (IOException e) {
            throw new RuntimeException("No se pudo registrar la temperatura", e);
        }
    }

}
