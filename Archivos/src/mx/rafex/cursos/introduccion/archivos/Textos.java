package mx.rafex.cursos.introduccion.archivos;
import java.util.Scanner;
import java.io.*;

public class Textos {
	
	public static void main(String [] args) {
		
		Scanner entradaText = new Scanner(System.in);
		PrintWriter salida = null;
		final String archivoPrueba = "archivoPrueba.txt";
		
		String cadena;
		System.out.println("Deja tu mensaje : ");
		cadena = entradaText.nextLine();
		while (!cadena.equalsIgnoreCase("fin")) {
		salida.println(cadena);
		cadena = entradaTexto.nextLine();
		}
	}

}
