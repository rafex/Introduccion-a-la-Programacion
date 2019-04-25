package mx.rafex.cursos.introduccion.tareas.primera.israel;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        final Scanner numero = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;

        System.out.println("Ingrese el primer numero");
        num1 = numero.nextDouble();

        System.out.println("Elija el signo de la operacion que quiera realizar");
        System.out.println("s Para Sumar");
        System.out.println("r Para Restar");
        System.out.println("m Para Multiplicacion");
        System.out.println("d Para Division");
        System.out.println("t Para Tanto por Ciento");
        System.out.println("f Para Salir");
        final char opcion = numero.next().charAt(0);

        System.out.println("Ahora ingrese el segundo numero");
        num2 = numero.nextDouble();

        switch (opcion) {
        case 's':
            System.out.println("Sumar");
            System.out.println("El Resultado es " + (num1 + num2));

            break;

        case 'r':
            System.out.println("Restar");
            System.out.println("El Resultado es " + (num1 - num2));
            break;

        case 'm':
            System.out.println("Multiplicacion");
            System.out.println("El Resultado es " + num1 * num2);
            break;

        case 'd':
            System.out.println("Division");
            if (num2 > 0)
                System.out.println("El Resultado es " + num1 / num2);
            else
                System.out.println("No es posible dividir entre cero");

            break;

        case 't':
            System.out.println("Residuo de la division");
            System.out.println("El Resultado es " + num1 % num2);

            break;

        case 'f':
            System.out.println("Aplicacion Finalizada.");
            System.exit(0);
            break;

        default:
            System.out.println("Opcion no valida.");

            break;
        }
    }
}
