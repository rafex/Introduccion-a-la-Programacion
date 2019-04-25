package mx.rafex.cursos.introduccion.tareas.primera.sergio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        final Scanner entrada1 = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        final int primerNumero = entrada1.nextInt();

        final Scanner seleccion = new Scanner(System.in);
        System.out.println("Que es lo que deseas hacer?: ");
        System.out.println("Presiona 0 para hacer una suma");
        System.out.println("Presiona 1 para hacer una resta");
        System.out.println("Presiona 2 para hacer una multiplicacion");
        System.out.println("Presiona 3 para hacer una division");

        final int elegido = seleccion.nextInt();
        Scanner entrada2;
        switch (elegido) {
        case 0:
            System.out.println("Elegiste una suma, por favor introduce el segundo numero: ");
            entrada2 = new Scanner(System.in);
            int segundoNumero = entrada2.nextInt();
            int resultado = primerNumero + segundoNumero;
            System.out.println("El resultado de tu suma es: " + resultado);
            break;
        case 1:
            System.out.println("Elegiste una resta, por favor introduce el segundo numero: ");
            entrada2 = new Scanner(System.in);
            segundoNumero = entrada2.nextInt();
            resultado = primerNumero - segundoNumero;
            System.out.println("El resultado de tu resta es: " + resultado);
            break;
        case 2:
            System.out.println("Elegiste una multiplicacion, por favor introduce el segundo numero: ");
            entrada2 = new Scanner(System.in);
            segundoNumero = entrada2.nextInt();
            resultado = primerNumero * segundoNumero;
            System.out.println("El resultado de tu multiplicacion es: " + resultado);
            break;
        case 3:
            System.out.println("Elegiste una division, por favor introduce el segundo numero: ");
            entrada2 = new Scanner(System.in);
            segundoNumero = entrada2.nextInt();
            resultado = primerNumero / segundoNumero;
            System.out.println("El resultado de tu division es: " + resultado);
            break;
        default:
            System.out.println("Error, seleccion invalida");

        }
        entrada1.close();
        seleccion.close();
    }

}
