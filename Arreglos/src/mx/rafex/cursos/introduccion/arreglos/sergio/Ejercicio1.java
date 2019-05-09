package mx.rafex.cursos.introduccion.arreglos.sergio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int suma = 0;

        final Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la dimensión del arreglo");

        final int dimensionArreglo = entrada.nextInt();
        final int[] arregloNumeros = new int[dimensionArreglo];

        for (int indice = 0; indice < arregloNumeros.length; indice++) {
            System.out.println("Introduce un numero");
            arregloNumeros[indice] = entrada.nextInt();
        }

        for (final int arregloNumero : arregloNumeros)
            suma = suma + arregloNumero;

        System.out.println("La suma de los numeros en el arreglo es: " + suma);

    }

}
