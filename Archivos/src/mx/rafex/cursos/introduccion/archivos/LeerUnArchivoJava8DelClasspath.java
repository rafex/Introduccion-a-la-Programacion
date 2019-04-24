
package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author rafex
 *
 */
public class LeerUnArchivoJava8DelClasspath {

    public static void main(String[] args) {

        final String nombreDelArchivo = "archivoPruebaEntrada.txt";

        Stream<String> flujo = null;
        try {
            final URI uri = LeerUnArchivoJava8DelClasspath.class.getResource(nombreDelArchivo).toURI();
            final Path ruta = Paths.get(uri);
            if (Files.exists(ruta)) {
                flujo = Files.lines(ruta, StandardCharsets.UTF_8);
                flujo.forEach(System.out::println);
            } else
                System.err.println("No se encuentra el archivo");
        } catch (final IOException excepcion) {
            excepcion.printStackTrace();
        } catch (final URISyntaxException excepcion) {
            excepcion.printStackTrace();
        }

        finally {
            if (flujo != null)
                flujo.close();
        }

    }

}
