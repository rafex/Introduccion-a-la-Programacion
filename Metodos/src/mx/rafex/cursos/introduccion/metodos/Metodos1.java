package mx.rafex.cursos.introduccion.metodos;

import java.util.Scanner;

public class Metodos1 {

    public static void main(final String[] args) {

        try (Scanner escaner = new Scanner(System.in)) {

            mostrarMensaje("Insertar dimensión del arreglo: ");
            final int dimensionArreglo = escaner.nextInt();

            final int[] arregloDeNumeros = new int[dimensionArreglo];

            llenarArreglo(arregloDeNumeros, escaner);

            mostrarArreglo(arregloDeNumeros);

        }

    }

    public static void llenarArreglo(final int[] x, final Scanner s) {
        for (int i = 0; i < x.length; i++) {
            mostrarMensaje("Inserte un número");
            x[i] = s.nextInt();
        }
    }

    public static void mostrarMensaje(final String objeto) {
        System.out.println(objeto);
    }

    public static void mostrarMensaje(final Object objeto) {
        System.out.println(objeto);
    }

    public static void mostrarArreglo(final int[] arregloDeNumeros) {
        for (int i = 0; i < arregloDeNumeros.length; i++)
            mostrarMensaje("Valor del arreglo en la posición [" + i + "] " + arregloDeNumeros[i]);
    }

}
