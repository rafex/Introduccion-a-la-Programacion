package gustavo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Colecciones1 {

    public static void main(final String[] args) {

        Set<Integer> hashSet = new HashSet<>(1_000_000);
        final Long tiempoInicioHashSet = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            hashSet.add(i);
        final Long tiempoFinalHashSet = System.currentTimeMillis();
        System.out.println("HashSet: " + (tiempoFinalHashSet - tiempoInicioHashSet));

        Set<Integer> treeSet = new TreeSet<>();
        final Long tiempoInicioTreeSet = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            treeSet.add(i);
        final Long tiempoFinalTreeSet = System.currentTimeMillis();
        System.out.println("TreeSet: " + (tiempoFinalTreeSet - tiempoInicioTreeSet));

        Set<Integer> linkedHashSet = new LinkedHashSet<>(1_000_000);
        final Long tiempoInicioLinkedHashSet = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            linkedHashSet.add(i);
        final Long tiempoFinalLinkedHashSet = System.currentTimeMillis();
        System.out.println("LinkedHashSet: " + (tiempoFinalLinkedHashSet - tiempoInicioLinkedHashSet));

        System.out.println("****************************************************");
        hashSet = new HashSet<>();

        hashSet.add(1000);
        hashSet.add(3000);
        hashSet.add(1000);

        for (final Integer valor : hashSet)
            System.out.println(valor);

        System.out.println("****************************************************");
        treeSet = new TreeSet<>();

        treeSet.add(5000);
        treeSet.add(4000);
        treeSet.add(5000);

        for (final Integer valor : treeSet)
            System.out.println(valor);

        System.out.println("****************************************************");
        linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(8000);
        linkedHashSet.add(3000);
        linkedHashSet.add(8000);

        for (final Integer valor : linkedHashSet)
            System.out.println(valor);

    }

}
