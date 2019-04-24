package mx.rafex.cursos.introduccion.archivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscribirArchivoJava8 {

    public static void main(String[] args) {

        final String nombreDelArchivo = "archivoDeSalida1.txt";

        Path path;
        path = Paths.get(nombreDelArchivo);

        final String[] lineas = new String[] { "linea 1", "linea 2", "linea 3" };

        try (BufferedWriter bufferDeEscritura = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
            Arrays.stream(lineas).forEach((linea) -> {
                try {
                    bufferDeEscritura.write(linea);
                    bufferDeEscritura.newLine();
                } catch (final IOException e) {
                    throw new UncheckedIOException(e);
                }

            });
        } catch (final IOException e) {
            e.printStackTrace();
        }

    }
}
