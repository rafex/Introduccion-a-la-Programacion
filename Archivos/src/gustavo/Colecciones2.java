package gustavo;

import java.util.ArrayList;
import java.util.List;

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

    }

}
