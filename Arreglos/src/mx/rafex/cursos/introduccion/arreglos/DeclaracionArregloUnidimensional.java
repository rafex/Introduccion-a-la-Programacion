
package mx.rafex.cursos.introduccion.arreglos;

/**
 * @author rafex Mostraremos como se declara un arreglo bidimensional o matriz
 */
public class DeclaracionArregloUnidimensional {

    public static void main(String[] args) {

        final int[][] matriz = new int[4][2];

        int numeroAzar = 0;

        for (int x = 0; x < matriz.length; x++)
            for (int y = 0; y < matriz[x].length; y++) {
                numeroAzar = (int) (Math.random() * 1000) + 1;
                matriz[x][y] = numeroAzar;
            }

        for (int x = 0; x < matriz.length; x++)
            for (int y = 0; y < matriz[x].length; y++) {
                System.out.print("Valor de la matriz en la posición x[" + x + "],y[" + y + "] = ");
                System.out.println(matriz[x][y]);
            }

    }

}
