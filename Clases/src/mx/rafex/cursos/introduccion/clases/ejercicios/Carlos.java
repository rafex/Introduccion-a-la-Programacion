package mx.rafex.cursos.introduccion.clases.ejercicios;

import java.util.Scanner;
public class Carlos {
  public static void main(String [] args) {
	  
	  Scanner valorIngresado = new Scanner(System.in);
	 
	  Double numeroUno ;
	  Double numeroDos ;
	  
	  System.out.println("Ingresa el tipo de operacion a realizar" );
	  System.out.println("1. suma");
	  System.out.println("2. resta");
	  System.out.println("3. multiplicacion");
	  System.out.println("4. division");
	  System.out.println("5. exponencial");
	  System.out.println("6. raiz");
	  
	  char tipoOperacion = valorIngresado.next().charAt(0);
	  

	  switch(tipoOperacion){
	  
      case '1':
      System.out.println("Ingresa el primer numero: ");
      numeroUno = valorIngresado.nextDouble();
      System.out.println("Ingresa el segundo numero: ");
      numeroDos = valorIngresado.nextDouble();
      System.out.println("El resultado de la suma es: " + Operacion.suma(numeroUno,numeroDos));
      break;  
      
      case '2':
          System.out.println("Ingresa el primer numero: ");
          numeroUno = valorIngresado.nextDouble();
          System.out.println("Ingresa el segundo numero: ");
          numeroDos = valorIngresado.nextDouble();
          System.out.println("El resultado de la resta es: " + Operacion.resta(numeroUno,numeroDos));
          break;  
          
      case '3':
          System.out.println("Ingresa el primer numero: ");
          numeroUno = valorIngresado.nextDouble();
          System.out.println("Ingresa el segundo numero: ");
          numeroDos = valorIngresado.nextDouble();
          System.out.println("El resultado de la multiplicacion es: " + Operacion.multiplicar(numeroUno,numeroDos));
          break;
          
      case '4':
          System.out.println("Ingresa el primer numero: ");
          numeroUno = valorIngresado.nextDouble();
          System.out.println("Ingresa el segundo numero: ");
          numeroDos = valorIngresado.nextDouble();
          System.out.println("El resultado de la divison es: " + Operacion.division(numeroUno,numeroDos));
          break;  
 
   } 
  }
}
