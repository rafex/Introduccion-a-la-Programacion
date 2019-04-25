package mx.rafex.cursos.introduccion.archivos;

import java.util.Scanner; 
public class Tareacadena1 {

	public static void main (String [ ] args) {
	     
	      System.out.println ("Por favor introduzca una cadena por teclado:");
	      	
	      	String entradaTeclado = "";
	      	Scanner entradaEscaner = new Scanner (System.in); 
	      	entradaTeclado = entradaEscaner.nextLine (); 
	      
	      	
	      	System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
	      System.out.println("Dónde esta la primera aparición de la letra 'm': " + entradaTeclado.indexOf("m"));
	      System.out.println("Dónde esta la última aparición de la letra 'm': " + entradaTeclado.lastIndexOf("m"));
	      System.out.println("Traer texto de la posicion 2 al final: " + entradaTeclado.substring(2));
  } 
} 