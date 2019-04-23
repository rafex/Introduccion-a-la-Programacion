import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        int sumaPares=0;
        int sumaImpares=0;

        System.out.println ("Introduce numero");
        numero = teclado.nextInt();

        for(int indice=1; indice<=numero ; indice++) {
            if(indice%2==0) {
                sumaPares+=indice;
            }
            else {
                sumaImpares+=indice;
            }
        }
        System.out.println ("La suma de los pares es " + sumaPares);
        System.out.println ("La suma de los impares es " + sumaImpares);
    }
}
