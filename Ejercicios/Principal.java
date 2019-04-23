import java.util.Scanner;

public class Principal {

  public static void main (String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Inserta el primer número");
    int numero1=entrada.nextInt();
    System.out.println("Inserta el segundo número");
    int numero2=entrada.nextInt();

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
