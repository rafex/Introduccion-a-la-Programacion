package mx.rafex.cursos.introduccion.arreglosgustavo;
import java.util.Scanner;
public class Ejercicio {

    public static void main(String[] args) {
    int suma=0;
        try (final Scanner entrada = new Scanner(System.in)) {

            System.out.println("Insertar la dimensión del arreglo");
            final int dimensionArreglo = entrada.nextInt();

            final int[] arregloNumeros = new int[dimensionArreglo];

            for (int indice = 0; indice < arregloNumeros.length; indice++) {
                System.out.println("Insertar número en la posición [" + indice + "]");
                arregloNumeros[indice] = entrada.nextInt();
                
                suma=suma+arregloNumeros[indice];
            }

            System.out.println("Mostrando valores del arreglo");
            for (int indice = 0; indice < arregloNumeros.length; indice++)
                System.out.println("Valor del arreglo 'arregloNumeros' en la posición [" + indice + "] : "
                        + arregloNumeros[indice]);
            
        }
        
        System.out.println("Mostrando suma del arreglo"+ suma);
    }

}
