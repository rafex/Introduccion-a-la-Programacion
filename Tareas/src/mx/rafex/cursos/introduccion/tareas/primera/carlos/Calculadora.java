package mx.rafex.cursos.introduccion.tareas.primera.carlos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        final Scanner valorIngresado = new Scanner(System.in);

        int numeroUno = 0;
        int numeroDos = 0;
        System.out.println(" ******************************************************** ");
        System.out.println(" Ingresa el numero, de la operacion que deseas realizar : ");
        System.out.println(" ******************************************************** ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicion");
        System.out.println("4. Division");

        final char tipoOperacion = valorIngresado.next().charAt(0);

        switch (tipoOperacion) {
        case '1':
            System.out.println(" ::: SUMA ::: ");
            System.out.println("Ingresa el primer numero: ");
            numeroUno = valorIngresado.nextInt();
            System.out.println("Ingresa el segundo numero: ");
            numeroDos = valorIngresado.nextInt();
            System.out.println("El resultado de la suma es: " + (numeroUno + numeroDos));
            break;

        case '2':
            System.out.println(" ::: RESTA ::: ");
            System.out.println("Ingresa el primer numero: ");
            numeroUno = valorIngresado.nextInt();
            System.out.println("Ingresa el segundo numero: ");
            numeroDos = valorIngresado.nextInt();
            System.out.println("El resultado de la resta es: " + (numeroUno - numeroDos));
            break;

        case '3':
            System.out.println(" ::: MULTIPLICACION ::: ");
            System.out.println("Ingresa el primer numero: ");
            numeroUno = valorIngresado.nextInt();
            System.out.println("Ingresa el segundo numero: ");
            numeroDos = valorIngresado.nextInt();
            System.out.println("El resultado de la multiplicacion es: " + numeroUno * numeroDos);
            break;

        case '4':
            System.out.println(" ::: DIVISION ::: ");
            System.out.println("Ingresa el primer numero: ");
            numeroUno = valorIngresado.nextInt();
            System.out.println("Ingresa el segundo numero: ");
            numeroDos = valorIngresado.nextInt();

            if (numeroDos > 0)
                System.out.println("El resultado de la division es: " + numeroUno / numeroDos);
            else
                System.out.println(" ::: No se puede dividir ::: ");

            break;

        default:
            System.out.println("Opcion invalida, vuleve a intentar");

        }

    }
}
