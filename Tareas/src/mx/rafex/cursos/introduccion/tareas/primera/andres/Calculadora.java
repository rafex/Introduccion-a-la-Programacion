package mx.rafex.cursos.introduccion.tareas.primera.andres;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] Args) {
        final Scanner entrada = new Scanner(System.in);

        int operacion = 0;
        int numUno = 0;
        int numDos = 0;

        System.out.println("Que poeracion quieres hacer");
        System.out.println("1) Suma, 2) Resta, 3) Multiplicacion, 4) Division");
        operacion = entrada.nextInt();

        System.out.println("Dame el primer numero: ");
        numUno = entrada.nextInt();

        System.out.println("Dame el segundo numero: ");
        numDos = entrada.nextInt();

        if (operacion == 1)
            System.out.println("Resultado de tu suma: " + (numUno + numDos));
        else if (operacion == 2)
            System.out.println("resultado de tu resta: " + (numUno - numDos));
        else if (operacion == 3)
            System.out.println("resultado de tu multiplicacion es: " + numUno * numDos);
        else if (operacion == 4)
            System.out.println("resultado de tu division es: " + numUno / numDos);
        else
            System.out.println("operacion no valida");
    }
}
