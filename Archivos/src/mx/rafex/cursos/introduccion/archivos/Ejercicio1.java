package mx.rafex.cursos.introduccion.archivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] pepita) {

        try (final Scanner entrada = new Scanner(System.in)) {

            final String nombreDelArchivo = "/tmp/archivoCreadoPorElUsuario.txt";

            Path ruta;
            ruta = Paths.get(nombreDelArchivo);

            System.out.println("Inserte su texto por favor: ");
            final String texto = entrada.nextLine();

            try {
                Files.write(ruta, texto.getBytes(StandardCharsets.UTF_8));
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }

    }

}
