package mx.rafex.cursos.introduccion.dia2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada;

        int numero1 = 0;
        int numero2 = 0;

        boolean validador1 = true;
        boolean validador2 = true;

        do
            try {
                System.out.println("Inserta el primer número");
                entrada = new Scanner(System.in);
                numero1 = entrada.nextInt();
                if (numero1 <= 0)
                    throw new NumberFormatException("El número es inferior o igual a 0 del primer número");
                validador1 = false;
            } catch (final InputMismatchException e) {
                System.out.println("Este no es un número válido (primer número)");
            } catch (final NumberFormatException e) {
                System.out.println("El número es inferior o igual a 0 del primer número");
            }
        while (validador1);

        do {
            System.out.println("Inserta el segundo número");
            try {
                entrada = new Scanner(System.in);
                numero2 = entrada.nextInt();
                if (numero2 <= 0)
                    throw new NumberFormatException("El número es inferior o igual a 0 del primer número");

                validador2 = false;
            } catch (final InputMismatchException e) {
                System.out.println("Este no es un número válido (segundo número)");
            } catch (final NumberFormatException e) {
                System.out.println("El número es inferior o igual a 0 del segundo número");
            }

        } while (validador2);

        final int resultado = numero1 + numero2;

        System.out.println("El resultado de la suma es:");
        System.out.println(resultado);

        final int resta = numero1 - numero2;

        System.out.println("El resultado de la resta es:");
        System.out.println(resta);

        final int producto = numero1 * numero2;

        System.out.println("El resultado del producto es:");
        System.out.println(producto);

        final int division = numero1 / numero2;

        System.out.println("El resultado de la división es:");
        System.out.println(division);

    }

}
