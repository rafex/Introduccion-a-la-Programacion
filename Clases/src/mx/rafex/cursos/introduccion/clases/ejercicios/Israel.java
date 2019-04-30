package mx.rafex.cursos.introduccion.clases.ejercicios;
import java.util.Scanner;
public class Israel {
 
	public static void main (String[] aritmetico) {
		Scanner digitos = new Scanner(System.in);
		Operacion aritmetica = new Operacion(); 
		
		int suma;
		int resta;
		int multiplicacion;
		int division;
		int exponente;
		int raiz;
		int raizcuadrada;
		
		
		
		System.out.println ("Ingrese que operacion aritmetica quiere realizar");
		
		switch(8) {
		
		case 1: int suma; digitos.nextInt (1);
			
			System.out.println("La operacion que eligió es Suma");
				break;
		
		case 2: int resta; digitos.nextInt (2);
			
			System.out.println("La operacion que eligio es Resta");
				break;
		
		case 3: int ; digitos.nextInt (3);
			
			System.out.println("La operacion que eligio es Multiplicacion");
				break;
			
		case 4: int d; digitos.nextInt (4);
			
			System.out.println("La operacion que eligio es Division");
				break;
				
		case 5: int e; digitos.nextInt (5);
			
			System.out.println("La operacion que eligio es Exponente");
				break;
				
		case 6: int f; digitos.nextInt (6);
			
			System.out.println("La operacion que eligio es Raiz");
				break;
				
		case 7: int g; digitos.nextInt (7);
			
			System.out.println("La operacion que eligio es Raiz Cuadrada");
				break;
				
		case 8: int h; digitos.nextInt (8);		
		
			System.out.println("La operacion que eligio es obtener el IVA");
				break;
				
		default: System.out.println("La opcion no es la correcta, intente de nuevo");
				break;
				}
		
		System.out.println ("Ingrese el primer digito ");
				digitos.nextInt(0);
				
		System.out.println ("Ingrese el segundo digito ");
				digitos.nextInt(0);
				
		
			
		System.out.println ("El resultado de su operacion aritmetica es");
		}
}
