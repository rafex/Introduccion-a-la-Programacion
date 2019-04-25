package mx.rafex.cursos.introduccion.metodos;

import java.util.Scanner;

public class Metodos3 {

    public static void main(final String[] args) {

        int numeroUno, numeroDos, resultado;

        try (Scanner escaner = new Scanner(System.in)) {

            mostrarMensaje("Inserta el primer número: ");
            numeroUno = escaner.nextInt();
            mostrarMensaje("Inserta el segundo número: ");
            numeroDos = escaner.nextInt();

            resultado = suma(numeroUno, numeroDos);
            mostrarMensaje("El resultado de la suma es: " + resultado);

            resultado = resta(numeroUno, numeroDos);
            mostrarMensaje("El resultado de la resta es: " + resultado);

            resultado = divicion(numeroUno, numeroDos);
            mostrarMensaje("El resultado de la divición es: " + resultado);

            resultado = multiplicacion(numeroUno, numeroDos);
            mostrarMensaje("El resultado de la multiplicacion es: " + resultado);

            final int veinte = 20;
//            final int[] arregloNumeros = new int[3];
//            resultado = suma(arregloNumeros);
            resultado = suma(numeroUno, numeroDos, veinte, 40, 10, 40, 04, 3434, 34, 34, 34, 34, 23, 2);
            mostrarMensaje("El resultado de la suma es: " + resultado);

            resultado = resta(numeroUno, numeroDos, 122, 33, 11111);
            mostrarMensaje("El resultado de la resta es: " + resultado);

            resultado = divicion(numeroUno, numeroDos, 23, 12, 3);
            mostrarMensaje("El resultado de la divición es: " + resultado);

            resultado = multiplicacion(numeroUno, numeroDos, 999, 23, 87);
            mostrarMensaje("El resultado de la multiplicacion es: " + resultado);

        }

    }

    public static void mostrarMensaje(final String mensaje) {
        System.out.println(mensaje);
    }

    public static void mostrarMensaje(final Object objeto) {
        System.out.println(objeto);
    }

    public static int suma(final int numeroUno, final int numeroDos) {
        final int resultado = numeroUno + numeroDos;
        return resultado;
    }

    public static int resta(final int numeroUno, final int numeroDos) {
        final int resultado = numeroUno - numeroDos;
        return resultado;
    }

    public static int divicion(final int numeroUno, final int numeroDos) {
        final int resultado = numeroUno / numeroDos;
        return resultado;
    }

    public static int multiplicacion(final int numeroUno, final int numeroDos) {
        final int resultado = numeroUno * numeroDos;
        return resultado;
    }

//    public static int suma(final int[] arreglosEnteros) {
//        int resultado = 0;
//        for (final int numero : arreglosEnteros)
//            resultado += numero;
//
//        return resultado;
//    }

    public static int suma(final int... numeros) {
        int resultado = 0;
        for (final int numero : numeros)
            resultado += numero;

        return resultado;
    }

    public static int resta(final int... numeros) {
        int resultado = 0;
        for (final int numero : numeros)
            resultado -= numero;

        return resultado;
    }

    public static int divicion(final int... numeros) {
        int resultado = 0;
        for (final int numero : numeros)
            resultado /= numero;

        return resultado;
    }

    public static int multiplicacion(final int... numeros) {
        int resultado = 0;
        for (final int numero : numeros)
            resultado *= numero;

        return resultado;
    }
}
