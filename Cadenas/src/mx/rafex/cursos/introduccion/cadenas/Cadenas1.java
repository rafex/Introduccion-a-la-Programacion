package mx.rafex.cursos.introduccion.cadenas;

public class Cadenas1 {

    public static void main(final String[] args) {

        final String texto = "mi mama me mima mucho";
        final char caracter = 'm';
        Integer vecesEncontradas = contarCaracteres(texto, caracter);

        System.out.println("[" + vecesEncontradas + "] veces que se encontro el caracter + [" + caracter
                + "] el texto: [" + texto + "]");

        System.out.println("********************************************");
        System.out.println("Segundo método");
        System.out.println("********************************************");

        vecesEncontradas = contarCaracteres2(texto, caracter);

        System.out.println("[" + vecesEncontradas + "] veces que se encontro el caracter + [" + caracter
                + "] el texto: [" + texto + "]");

    }

    public static int contarCaracteres(final String cadena, final char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) {
            contador++;
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
    }

    public static int contarCaracteres2(final String cadena, final char caracter) {

        int contador = 0;
        for (final char caracterTmp : cadena.toCharArray())
            if (caracter == caracterTmp)
                contador++;

        return contador;
    }

}
