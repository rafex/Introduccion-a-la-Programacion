
package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
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
            final Path ruta = Paths.get(LeerUnArchivoJava8DelClasspath.class.getResource(nombreDelArchivo).toURI());
            flujo = Files.lines(ruta, StandardCharsets.UTF_8);
            flujo.forEach(System.out::println);
        } catch (final IOException e) {
            e.printStackTrace();
        } catch (final URISyntaxException e1) {
            e1.printStackTrace();
        }

        finally {
            if (flujo != null)
                flujo.close();
        }

    }

}
