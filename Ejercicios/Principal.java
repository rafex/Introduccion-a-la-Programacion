import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

  public static void main (String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Inserta el primer número");

    int numero1 = 0;
    int numero2 = 0;

    try{
        numero1=entrada.nextInt();
        if(numero1 <= 0){
            System.out.println("El número es inferior o igual a 0");
            System.exit(0);
        }
    } catch(InputMismatchException e){
        System.out.println("Este no es un número válido");
        System.exit(0);
    }

    System.out.println("Inserta el segundo número");
    try{
        numero2=entrada.nextInt();
        if(numero2 <= 0){
            System.out.println("El número es inferior o igual a 0");
            System.exit(0);
        }
    } catch(InputMismatchException e){
        System.out.println("Este no es un número válido");
        System.exit(0);
    }



    int resultado=numero1+numero2;

    System.out.println("El resultado de la suma es:");
    System.out.println(resultado);

    int  resta=numero1-numero2;

    System.out.println("El resultado de la resta es:");
    System.out.println(resta);

    int producto=numero1*numero2;

    System.out.println("El resultado del producto es:");
    System.out.println(producto);

    int division=numero1/numero2;

    System.out.println("El resultado de la división es:");
    System.out.println(division);


  }

}
