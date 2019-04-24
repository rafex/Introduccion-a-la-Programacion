import java.util.Scanner;

public class SumaParesEImparesWhile {

    public static void main (String[] args) {

        Scanner entrada;
        int topeFinal = 0;
        int sumaPares =  0;
        int sumaImpares= 0;

        System.out.println("Inserta un número");
        entrada = new Scanner(System.in);
        topeFinal=entrada.nextInt();

        int indice = 1;
        while(indice <= topeFinal){

            if(indice%2==0){
                sumaPares = sumaPares + indice;

            } else {
                sumaImpares= sumaImpares + indice;
            }

            indice++;
        }

        System.out.println ("La suma de los pares es : " + sumaPares);
        System.out.println ("La suma de los impares es : " + sumaImpares );
    }
}
