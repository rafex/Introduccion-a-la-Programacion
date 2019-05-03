package mx.rafex.cursos.introduccion.tareas.primera.gustavo;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada;// variables
        int numero1;
        int numero2;
        int operacion;
        int resultado;
        System.out.println("ingrese el primer numero");
        entrada = new Scanner(System.in);
        numero1 = entrada.nextInt();

        System.out.println("selecione el numero de la operación a realizar");
        System.out.println("1suma");
        System.out.println("2resta");
        System.out.println("3multiplicacion");
        System.out.println("4division");
        entrada = new Scanner(System.in);
        operacion = entrada.nextInt();

        switch (operacion) {

        case 1:
            System.out.println("ingrese el segundo numero");
            entrada = new Scanner(System.in);
            numero2 = entrada.nextInt();
            resultado = numero1 + numero2;
            System.out.println("el resultado de la suma es" + resultado);
            break;

        case 2:
            System.out.println("ingrese el segundo numero");
            entrada = new Scanner(System.in);
            numero2 = entrada.nextInt();
            resultado = numero1 - numero2;
            System.out.println("el resultado de la suma es" + resultado);
            break;

        case 3:
            System.out.println("ingrese el segundo numero");
            entrada = new Scanner(System.in);
            numero2 = entrada.nextInt();
            resultado = numero1 * numero2;
            System.out.println("el resultado de la suma es" + resultado);
            break;

        case 4:
            System.out.println("ingrese el segundo numero");
            entrada = new Scanner(System.in);
            numero2 = entrada.nextInt();
            resultado = numero1 / numero2;
            System.out.println("el resultado de la suma es" + resultado);
            break;

        default:
            System.out.println("error");
            break;

        }
    }
}
