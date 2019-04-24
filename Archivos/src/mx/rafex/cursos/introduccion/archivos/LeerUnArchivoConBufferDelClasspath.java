
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

            final InputStream flujoDeEntrada = LeerUnArchivoConBufferDelClasspath.class
                    .getResourceAsStream(nombreDelArchivo);
            String linea;
            final BufferedReader bufferDeLectura = new BufferedReader(new InputStreamReader(flujoDeEntrada));
            while ((linea = bufferDeLectura.readLine()) != null)
                System.out.println(linea);
            bufferDeLectura.close();

        } catch (final IOException excepcion) {
            excepcion.printStackTrace();
        }

    }

}
