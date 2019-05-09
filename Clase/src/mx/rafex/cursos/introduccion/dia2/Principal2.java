package mx.rafex.cursos.introduccion.dia2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal2 {

    public static void main(final String[] args) {

        Scanner entrada;

        int numero = 0;
        System.out.println("Inserta el un número");
        try {
            entrada = new Scanner(System.in);
            numero = entrada.nextInt();
            System.out.println("El número que inserto es: " + numero);
        } catch (final IllegalStateException | InputMismatchException ex) {
            System.out.println("Inserto un valor inesperado, se terminara el programa.");
        }

    }

}
