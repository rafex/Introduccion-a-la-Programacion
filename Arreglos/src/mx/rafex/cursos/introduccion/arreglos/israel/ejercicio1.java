package mx.rafex.cursos.introduccion.arreglos.israel;

public class ejercicio1 {
public static void main (String[] args) {
	final int [][] matriz = new int[5][5];
	int suma = 0;
	System.out.println("Ingresa una fila ");
	
	System.out.println("Ingresa una columna ");
	
	for (int x = 0; x < matriz.length; x++)
			for (int y = 0; y < matriz[x].length; y++) 
				suma = matriz [x][y];
			System.out.println("La Suma de la Matriz es "+ suma);
			System.out.println("matriz");
			
	
	
	
}
}
