package mx.rafex.cursos.introduccion.tareas.primera.imanol;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        final Scanner entrada = new Scanner(System.in); // objeto de tipo que escaner que usare para la lectura de
                                                        // numero 1 y 2

        int numero1;
        final int numero2; // declaramos las variables que usaremos
        final int resultado;
        final int opcion; // la declaro entera porque usare el metodo switch para el menu

        System.out.println("ingresa el primer digito para la calculadora "); // le pedimos que ingrese el primer digito
        numero1 = entrada.nextInt(); // al obj "entrada se le asigna el valor que el usuarion ingreso

        System.out.println("que operacion deseas realizar");
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");

        final int opcion1 = entrada.nextInt(); // se pide inserte un valor de tipo entero que equivalga a la opcion

        System.out.println("ingresa el segundo digito para la calculadora "); // le pedimos que ingrese el primer digito
        numero2 = entrada.nextInt();

        int resultado1 = 0;
        switch (opcion1) {

        case 1:
            resultado1 = sumar(numero1, numero2); // cada caso llama a un metodo asignando las variablesnum1
                                                  // y num2
            break;

        case 2:
            resultado1 = restar(numero1, numero2);
            break;

        case 3:
            resultado1 = multiplicacion(numero1, numero2);
            break;

        case 4:
            resultado1 = division(numero1, numero2);
            break;
        }
        // se declara la variable que arroja el metodo y la imprime
        System.out.println("el resultado de tu operacion es: " + resultado1);

    }

    public static int sumar(int numero1, int numero2) {
        int c;
        c = numero1 + numero2;
        return c;
    }

    public static int restar(int numero1, int numero2) {
        int c;
        c = numero1 - numero2;
        return c;
    }

    public static int multiplicacion(int numero1, int numero2) {
        int c;
        c = numero1 * numero2;
        return c;
    }

    public static int division(int numero1, int numero2) {
        int c;
        c = numero1 / numero2;
        return c;
    }

}
