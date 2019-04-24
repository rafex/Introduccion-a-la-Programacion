
package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author rafex
 *
 */
public class LeerUnArchivoJava8 {

    public static void main(String[] args) {

        final String ubicacionExactaDelArchivo = "/Volumes/@rafex_hdd/job/clientes/cursos/Introduccion-a-la-Programacion/Archivos/src/mx/rafex/cursos/introduccion/archivos/";
        final String nombreDelArchivo = "archivoPruebaEntrada.txt";
        final String rutaMasNombreDeArchivo = ubicacionExactaDelArchivo + nombreDelArchivo;

        final Path ruta = Paths.get(rutaMasNombreDeArchivo);
        try {
            final Stream<String> flujo = Files.lines(ruta, StandardCharsets.UTF_8);
            flujo.forEach(System.out::println);
        } catch (final IOException excepcion) {
            excepcion.printStackTrace();
        }

    }

}
