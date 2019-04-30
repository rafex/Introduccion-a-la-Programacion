
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

        final String ubicacionExactaDelArchivo = "C:\\Users\\KMMXlen04\\Desktop\\ISRAEL-GITHUB\\Archivos\\src\\mx\\rafex\\cursos\\introduccion\\archivos\\";
        final String nombreDelArchivo = "archivoPruebaEntrada.txt";
        final String rutaMasNombreDeArchivo = ubicacionExactaDelArchivo + nombreDelArchivo;

        try {
            String linea;
            final FileReader lectorDeArchivo = new FileReader(rutaMasNombreDeArchivo);
            final BufferedReader bufferDeLectura = new BufferedReader(lectorDeArchivo);
            while ((linea = bufferDeLectura.readLine()) != null)
                System.out.println(linea);
            bufferDeLectura.close();

        } catch (final IOException excepcion) {
            excepcion.printStackTrace();
        }

    }

}
