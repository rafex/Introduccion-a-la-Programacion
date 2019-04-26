
import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;

	public class CalculadoraColeccion {
		
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in); // declara una entrada por teclado
			int  num1 = 0 , num2 = 0  , resultado;
			
			boolean validador1=true;
		    boolean validador2=true;

		    do{		//aqui el sistema ejecutara 1 vez y evaluara con la condicion del final con el "while"
		        try{
		            System.out.println("Inserta el primer número"); //muestra la primer linea
		            
		            num1=entrada.nextInt(); //aqui usa el objeto tipo scanner "entrada" para capturar el valor
		            if(num1 <= 0){ //aqui le dice que si num1 no cumple la condicion 
		                throw new Exception("El número es inferior o igual a 0 del primer número"); //arrojara esta exepcion
		            }  // 
		            validador1=false;// Y ASIGNARA A validador1 el valor "false"
		        } catch(InputMismatchException e){
		            System.out.println("Este no es un número válido (primer número)");
		        } catch(Exception e){
		            System.out.println("El número es inferior o igual a 0 del primer número");
		        }

		    }	
		    	while (validador1);
			
		    do{
		        System.out.println("Inserta el segundo número");
		        try{
		            entrada = new Scanner(System.in);
		            num2=entrada.nextInt();
		            if(num2 <= 0){
		              throw new Exception("El número es inferior o igual a 0 del primer número");
		            }

		            validador2=false;
		        } catch(InputMismatchException e){
		            System.out.println("Este no es un número válido (segundo número)");
		        }catch(Exception e){
		            System.out.println("El número es inferior o igual a 0 del segundo número");
		        }

		    }while(validador2);
		    
		    System.out.println("que operacion deseas realizar");
	        System.out.println("1.-Sumar");
	        System.out.println("2.-Restar");
	        System.out.println("3.-Multiplicar");
	        System.out.println("4.-Dividir");
	        int opcion1 = entrada.nextInt();
		    switch (opcion1) {

	        case 1:
	            resultado = sumar(num1, num2); // cada caso llama a un metodo asignando las variablesnum1
	                                                  // y num2
	            break;

	        case 2:
	            resultado = restar(num1, num2);
	            break;

	        case 3:
	            resultado = multiplicacion(num1, num2);
	            break;

	        case 4:
	            resultado = division(num1, num2);
	            break;
	        }
		}
		
		public static int sumar(int numero1, int numero2) {
	        int c;
	        c = numero1 + numero2;
	        return c;
	    }

	    public static int restar(int numero1, int numero2) {
	        int c;
	        c = numero1 - numero2;
	        return c;
	    }

	    public static int multiplicacion(int numero1, int numero2) {
	        int c;
	        c = numero1 * numero2;
	        return c;
	    }

	    public static int division(int numero1, int numero2) {
	        int c;
	        c = numero1 / numero2;
	        return c;
	    }
		

}
