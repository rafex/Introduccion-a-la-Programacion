import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class SumaHashSet {
	
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Set<Integer> listanumeros = new HashSet<>();
		
		System.out.println("ingresa los valores que deseas sumar");
		listanumeros.add(entrada.nextInt());
		
		System.out.println("deseas agregar otro valor? (Si/No");
			if (entrada.next() != "No" );{
			 System.out.println("ingresa otro valor");
			 listanumeros.add(entrada.nextInt());
			  {  
				  while (((Iterator<Integer>) listanumeros).hasNext()) {
			            
			            System.out.println(((Iterator<Integer>) listanumeros).hasNext());
			 }
	}

			}
	}
}