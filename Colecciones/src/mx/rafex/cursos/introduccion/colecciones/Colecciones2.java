package mx.rafex.cursos.introduccion.colecciones;

import java.util.ArrayList;
import java.util.List;

public class Colecciones2 {

    public static void main(final String[] args) {

        int numeroAzar;

        final List<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 1_000; i++) {
            numeroAzar = (int) (Math.random() * 1000) + 1;
            arrayList.add("algo" + numeroAzar);
        }

        arrayList.forEach(System.out::println);

        System.out.println("****************************************************");

        for (final String cadena : arrayList)
            System.out.println(cadena);

    }

}
