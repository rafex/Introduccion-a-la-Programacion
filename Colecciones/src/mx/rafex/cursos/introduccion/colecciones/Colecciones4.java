package mx.rafex.cursos.introduccion.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Colecciones4 {

    public static void main(final String[] args) {

        List<String> nombres = null;

        nombres = new ArrayList<>();

        nombres.add("Pedro");
        nombres.add("Nadia");
        nombres.add("Manuel");
        nombres.add("Jose");
        nombres.add("Batman");
        nombres.add("Darma");

        System.out.println("*********************************************+");
        System.out.println("Ordenar con Collection.sort");
        System.out.println("*********************************************+");
        Collections.sort(nombres);

        // for each de Java 8
        nombres.forEach(System.out::println);

        System.out.println("*********************************************+");
        System.out.println("Ordenar al reves con Collection.sort");
        System.out.println("*********************************************+");

        final Comparator<String> comparador = Collections.reverseOrder();
        Collections.sort(nombres, comparador);

        for (final String nombre : nombres)
            System.out.println(nombre);

        System.out.println("*********************************************+");
        System.out.println("Ordenar con stream().sorted --- JAVA 8");
        System.out.println("*********************************************+");

        nombres = Arrays.asList("Pedro", "Manuel", "Nadia", "Jose", "Darma", "Batman");
        // Java 8
        nombres.stream().sorted().forEach(System.out::println); // ordena con stream

        System.out.println("*********************************************+");
        System.out.println("Ordenar al reves con stream().sorted --- JAVA 8");
        System.out.println("*********************************************+");

        nombres.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}
