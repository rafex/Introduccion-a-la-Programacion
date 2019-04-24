
package mx.rafex.cursos.introduccion.archivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author rafex
 *
 */
public class LeerUnArchivoConBufferDelClasspath {

    public static void main(String[] args) {

        final String nombreDelArchivo = "archivoPruebaEntrada.txt";

        try {

            final InputStream inputStream = LeerUnArchivoConBufferDelClasspath.class
                    .getResourceAsStream(nombreDelArchivo);
            String cadena;
            final BufferedReader b = new BufferedReader(new InputStreamReader(inputStream));
            while ((cadena = b.readLine()) != null)
                System.out.println(cadena);
            b.close();

        } catch (final IOException e) {
            e.printStackTrace();
        }

    }

}
