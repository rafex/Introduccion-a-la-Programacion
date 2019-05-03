package mx.rafex.cursos.introduccion.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Colecciones2 {

    public static void main(final String[] args) {

        int numeroAzar;

        final List<String> arrayList = new ArrayList<>();

        final String cadenaContrbando = "de contrbando";

        arrayList.add(cadenaContrbando);

        for (int i = 0; i < 1_0; i++) {
            numeroAzar = (int) (Math.random() * 1000) + 1;
            arrayList.add("algo" + numeroAzar);
        }

        arrayList.forEach(System.out::println); // java 8

        System.out.println("****************************************************");

        arrayList.remove(0);

        for (final String cadena : arrayList)
            System.out.println(cadena);

        System.out.println("****************************************************");

        final LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ravi");
        linkedList.add("Vijay");
        linkedList.add("Ravi");
        linkedList.add("Ajay");

        linkedList.forEach(System.out::println);

        System.out.println("****************************************************");

        final Vector<String> vector = new Vector<>();
        vector.add("Ayush");
        vector.add("Amit");
        vector.add("Ashish");
        vector.add("Garima");

        final Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

}
