package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscribirArchivoJava8FileWrite {

    public static void main(String[] args) {

        final String nombreDelArchivo = "/tmp/archivoDeSalida3.txt";

        Path ruta;
        ruta = Paths.get(nombreDelArchivo);

        final String texto = "0ap9osu89cyd9cdks09diuhsoidj98 s8j9 !!";

        try {
            Files.write(ruta, texto.getBytes(StandardCharsets.UTF_8));
        } catch (final IOException e) {
            e.printStackTrace();
        }

    }
}
