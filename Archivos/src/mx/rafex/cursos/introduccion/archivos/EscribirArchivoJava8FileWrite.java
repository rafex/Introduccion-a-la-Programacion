package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscribirArchivoJava8FileWrite {

    public static void main(String[] args) {

        final String nombreDelArchivo = "archivoDeSalida2.txt";

        Path ruta;
        ruta = Paths.get(nombreDelArchivo);

        final String texto = "A mi me gusta aprender a programar !!";

        try {
            Files.write(ruta, texto.getBytes(StandardCharsets.UTF_8));
        } catch (final IOException e) {
            e.printStackTrace();
        }

    }
}
