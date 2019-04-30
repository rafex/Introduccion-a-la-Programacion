

package gustavo;
import java.util.Scanner;
public class DividirCadena {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		String[] cadenaSeparada;//declaro mi cadenade arreglo
		String cadenaSinSeparar="";//declaro mi variable tipo cadena
		System.out.println("ingrese un texto");
		cadenaSinSeparar = entrada.nextLine();//lo que escriba se va a guarddar en cadenasinseparar
		cadenaSeparada=cadenaSinSeparar.split(" ");//divida la cadena cada vez que encuentre un espacio
		for(int i=0; i<cadenaSeparada.length;i++)
		{
			System.out.println("el dato en la posicion "+i+"es:"+cadenaSeparada[i]);
		}
		
		
	}

}
