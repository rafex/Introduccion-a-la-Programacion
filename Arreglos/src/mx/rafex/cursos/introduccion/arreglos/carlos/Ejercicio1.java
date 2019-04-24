package mx.rafex.cursos.introduccion.arreglos.carlos;

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String [] args) {
		
		int suma ;
		suma = 0;
		
		try (final Scanner entrada = new Scanner(System.in)) {

            System.out.println("Insertar la dimensión del arreglo");
            final int dimensionArreglo = entrada.nextInt();

            final int[] arregloNumeros = new int[dimensionArreglo];

            for (int indice = 0; indice < arregloNumeros.length; indice++) {
                System.out.println("Insertar número en la posición [" + indice + "]");
                arregloNumeros[indice] = entrada.nextInt();
                
                suma = suma + arregloNumeros[indice];
            }

            System.out.println("Mostrando valores del arreglo");
            for (int indice = 0; indice < arregloNumeros.length; indice++)
                System.out.println("Valor del arreglo 'arregloNumeros' en la posición [" + indice + "] : "
                        + arregloNumeros[indice]);
            
            System.out.println("la suma del arrego es " + suma  );
        }
	}

}
