package mx.rafex.cursos.introduccion.dia2;

import java.util.Scanner;

public class SumaParesEImparesWhile {

    public static void main(String[] args) {

        final Scanner entrada = new Scanner(System.in);

        int topeRango = 0;
        int sumaPares = 0;
        int sumaNones = 0;

        System.out.println("Inserta un número para determinar el tope del rango:");
        topeRango = entrada.nextInt();

        int indice = 0;

        while (indice <= topeRango) {
            if (indice % 2 == 0)
                sumaPares = sumaPares + indice;
            else
                sumaNones = sumaNones + indice;

            indice = indice + 1;
        }

        System.out.println("La suma de los pares es:" + sumaPares);
        System.out.println("La suma de los nones es:" + sumaNones);

    }
}
