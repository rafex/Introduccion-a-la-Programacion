
package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author rafex
 *
 */
public class LeerUnArchivoJava8CSV {

    public static void main(final String[] args) {

        final String ubicacionExactaDelArchivo = "/Users/rafex/tmp/";
        final String nombreDelArchivo = "asistencia.csv";
        final String rutaMasNombreDeArchivo = ubicacionExactaDelArchivo + nombreDelArchivo;

        final Path ruta = Paths.get(rutaMasNombreDeArchivo);

        List<String> list = new ArrayList<>();

        try {
            final String cabecera = "";
            final Stream<String> flujo = Files.lines(ruta, StandardCharsets.UTF_8);

//            flujo.forEach((p) -> {
//                System.out.println("skdkfhs" + p);
//            });

            list = flujo.filter(line -> !line.startsWith("line3")).map(String::toUpperCase)
                    .collect(Collectors.toList());

//            flujo.forEach(System.out::println);
        } catch (final IOException excepcion) {
            excepcion.printStackTrace();
        }

    }

}
