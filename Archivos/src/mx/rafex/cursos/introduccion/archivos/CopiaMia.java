package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class CopiaMia {

    public static void main(String[] args) {

        final String nombreDelArchivo;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Inserte ruta y nombre de archivo: ");
            nombreDelArchivo = entrada.nextLine();

            Path ruta;
            ruta = Paths.get(nombreDelArchivo);

            System.out.println("Inserte texto: ");
            final String texto = entrada.nextLine();

            try {
                Files.write(ruta, texto.getBytes(StandardCharsets.UTF_8));
            } catch (final IOException e) {
                e.printStackTrace();
            }

            ruta = Paths.get(nombreDelArchivo);
            try {
                final Stream<String> flujo = Files.lines(ruta, StandardCharsets.UTF_8);
                flujo.forEach(System.out::println);
            } catch (final IOException excepcion) {
                excepcion.printStackTrace();
            }
        }

    }
}
