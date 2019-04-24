
package mx.rafex.cursos.introduccion.archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author rafex
 *
 */
public class LeerUnArchivoConBuffer {

    public static void main(String[] args) {

        final String ubicacionExactaDelArchivo = "/Volumes/@rafex_hdd/job/clientes/cursos/Introduccion-a-la-Programacion/Archivos/src/mx/rafex/cursos/introduccion/archivos/";
        final String nombreDelArchivo = "archivoPruebaEntrada.txt";
        final String rutaMasNombreDeArchivo = ubicacionExactaDelArchivo + nombreDelArchivo;

        try {
            String cadena;
            final FileReader f = new FileReader(rutaMasNombreDeArchivo);
            final BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null)
                System.out.println(cadena);
            b.close();

        } catch (final IOException e) {
            e.printStackTrace();
        }

    }

}
