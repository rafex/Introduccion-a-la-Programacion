package mx.rafex.cursos.introduccion.arreglos.israel;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        final Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte eje X: ");
        final int ejeX = entrada.nextInt();
        System.out.println("Inserte eje U: ");
        final int ejeY = entrada.nextInt();

        final int[][] matriz = new int[ejeX][ejeY];

        int suma = 0;

        for (int x = 0; x < matriz.length; x++)
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.println("Inserta valor la celda: [" + x + "][" + y + "]");
                matriz[x][y] = entrada.nextInt();
                suma += matriz[x][y];
            }

        System.out.println("La Suma de la Matriz es " + suma);

    }
}
