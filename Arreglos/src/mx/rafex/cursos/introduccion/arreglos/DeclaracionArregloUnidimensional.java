
package mx.rafex.cursos.introduccion.arreglos;

/**
 * @author rafex Mostraremos como se declara un arreglo
 */
public class DeclaracionArregloUnidimensional {

    public static void main(String[] args) {

        // una manera es poner el tipo de dato después los [] (corchetes) a continuación
        // el nombre de nuestra variable y despues la definición del tamaño del arreglo

        final int[] arregloNumeros = new int[4];

        System.out.println("¿Así se imprime un arreglo?");
        System.out.println(arregloNumeros);

        System.out.println(
                "La respuesta es no, así solo veremos la referencia al arreglo, pero no su contenido. Hay que recorrerlo");

        System.out.println("Primera iteración de: arregloNumeros ");
        for (final int numero : arregloNumeros)
            System.out.println(numero);

        // para asignar un valor dentro de nuestro arreglo debemos colocar el indice de
        // este en los corchetes
        arregloNumeros[0] = 4;
        arregloNumeros[1] = 43;
        arregloNumeros[2] = 24;
        arregloNumeros[3] = 54;

        System.out.println("Segunda iteración de: arregloNumeros");
        for (final int numero : arregloNumeros)
            System.out.println(numero);

        final int[] arregloNumerosYaDefinido = { 3, 2, 6 };

        System.out.println("Iteración de: arregloNumerosYaDefinido");
        for (final int numero : arregloNumerosYaDefinido)
            System.out.println(numero);

        // otra manera es poner el tipo de dato a continuación el nombre de la variable
        // y despues [] (corchetes)
        final String arregloDeCadenas[] = new String[3];

        System.out.println("Primera iteración de: arregloDeCadenas ");
        for (final String cadena : arregloDeCadenas)
            System.out.println(cadena);

        arregloDeCadenas[0] = "primera cadena dentro del arreglo";
        arregloDeCadenas[1] = "segunda cadena dentro del arreglo";
        arregloDeCadenas[2] = "tercera cadena dentro del arreglo";

        System.out.println("Segunda iteración de: arregloDeCadenas ");

        // para obtener la longitud o tamaño de nuestro arreglo lo hacemos con la
        // siguiente propiedad "length" que tiene el Array

        for (final String arregloDeCadena : arregloDeCadenas)
            System.out.println(arregloDeCadena);

        System.out.println("Accediendo a la posición 1 del arreglo: arregloDeCadenas " + arregloDeCadenas[1]);

    }

}
