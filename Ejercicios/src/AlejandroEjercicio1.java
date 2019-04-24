import java.util.Scanner;

public class AlejandroEjercicio1{

	public static void main (String[] args) {

		Scanner entrada;
		int numero = 0;
		int par1 =  0;
		int impar1= 0;

		System.out.println("Inserta un número");
		entrada = new Scanner(System.in);
		numero=entrada.nextInt();

		for (int i=1; i<= numero; i = i+1 ){

			if  ( i % 2 == 0) {
				par1 = par1 +i ;

			} else if ( i % 2 != 0){

				impar1 = impar1 +i;

			}

		}

		System.out.println ("La suma de los pares es : " + par1);
		System.out.println ("La suma de los impares es : " + impar1 );
	}
}
