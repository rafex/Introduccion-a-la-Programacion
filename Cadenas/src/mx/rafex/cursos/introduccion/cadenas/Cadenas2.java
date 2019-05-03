package mx.rafex.cursos.introduccion.cadenas;

import java.util.Scanner;

public class Cadenas2 {

    public static void main(final String[] args) {

        try (Scanner escaner = new Scanner(System.in)) {
            String texto;
            char caracter;
            int numeroDeVeces = 0;
            System.out.println("Introduce texto: ");
            texto = escaner.nextLine();
            System.out.print("Introduce un carácter: ");
            caracter = escaner.next().charAt(0);
            numeroDeVeces = contarCaracteres(texto, caracter);
            System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
        }

    }

    public static int contarCaracteres(final String cadena, final char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }

}
