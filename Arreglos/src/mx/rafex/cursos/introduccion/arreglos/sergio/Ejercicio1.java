package mx.rafex.cursos.introduccion.arreglos.sergio;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		final Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		final int dimensionArreglo = entrada.nextInt();
		final int[] arregloNumeros = new int[dimensionArreglo];
		
		for(int i = 0; i < arregloNumeros.length; i++) {
			System.out.println(i);
		}
		
		
		
		
	}

}
