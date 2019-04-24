package mx.rafex.cursos.introduccion.cadenas;

public class ConvertirUnaCadenaANumero {

    public static void main(String[] args) {

        final String cadenaNumerica = "6";

        final int numeroEntero = Integer.parseInt(cadenaNumerica);

        final int sumaEnteros = numeroEntero + 10;

        System.out.println("Sumando 10 al número que convertirmos: " + sumaEnteros);

        final String cadenaNumericaDos = "3.4";

        final float numeroFlotante = Float.parseFloat(cadenaNumericaDos);

        final float sumaFlotantes = numeroFlotante + 5.6f;

        System.out.println("Sumando 5.6 al número que convertirmos: " + sumaFlotantes);

    }

}
