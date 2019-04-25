package gustavo;

import java.util.Scanner;
public class Cadena {
	public static void main(String[] args) {
		//Scanner entrada; variable
		Scanner entrada =new Scanner(System.in);//creo mi objeto
		String cadtex="";//creo mi variable
		int posicion;
		System.out.println("ingrese un texto");
		cadtex = entrada.nextLine();//lo que escriba se va a guarddar en cadtex
		System.out.println("que posicion quiere que se muestre");
		posicion = entrada.nextInt();//lo que escriba se va a guarddar en cadtex
		System.out.println("la cadena es" +" "+ cadtex);
		System.out.println("la letra que esta en la posiciones"+" "+posicion+" "+cadtex.charAt(posicion));
	}
	
	/////

}
