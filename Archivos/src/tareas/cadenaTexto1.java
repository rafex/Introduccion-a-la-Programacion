package tareas;
import java.util.Scanner;

public class cadenaTexto1 {
    public static void main(String [] args){

        Scanner entraTexto = new Scanner(System.in);

        System.out.println("Ingresa un texto");
        String texto = entraTexto.nextLine();

        System.out.println("tu texto tiene: " + texto.length() + " letras");

        int ultimaLetra = texto.length();
       System.out.println("La ultima letra es : " + texto.charAt(ultimaLetra -1));
        
    }
}