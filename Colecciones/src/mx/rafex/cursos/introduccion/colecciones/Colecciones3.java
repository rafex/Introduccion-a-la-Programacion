package mx.rafex.cursos.introduccion.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Colecciones3 {

    public static void main(final String[] args) {

        int numeroAzar;

        final Map<Integer, String> hashMap = new HashMap<>();

        final Integer llave = 1000000;
        hashMap.put(llave, "hola entre de contrabando");

        for (int i = 0; i < 1_0; i++) {
            numeroAzar = (int) (Math.random() * 1000) + 1;
            hashMap.put(numeroAzar, "cadena" + numeroAzar);
        }

        for (final Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println("Clave/Llave = " + entry.getKey() + ", Valor = " + entry.getValue());

        hashMap.remove(llave);

        System.out.println("******************************");

        for (final Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println("Clave/Llave = " + entry.getKey() + ", Valor = " + entry.getValue());

    }

}
