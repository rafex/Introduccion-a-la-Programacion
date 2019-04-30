package mx.rafex.cursos.introduccion.clases.ejercicios;

public class Operacion {

    public static Double IVA = 16.0;

    public static Double suma(Double... numeros) {

        Double resultado = new Double(0);

        for (final Double numero : numeros)
            resultado += numero;

        return resultado;
    }

    public static Double resta(Double... numeros) {

        Double resultado = new Double(0);

        for (final Double numero : numeros)
            resultado -= numero;

        return resultado;
    }

    public static Double multiplicar(Double... numeros) {

        Double resultado = new Double(0);

        for (final Double numero : numeros)
            resultado *= numero;

        return resultado;
    }

    public static Double division(Double divisor, Double dividendo) {

        Double resultado = new Double(0);

        resultado = dividendo / divisor;

        return resultado;
    }

    public static Double exponencial(Double numero, Integer exponencial) {
        Double resultado = new Double(0);

        resultado = Math.pow(numero, exponencial);

        return resultado;
    }

    public static Double raiz(Double numero, Double raiz) {
        Double resultado = new Double(0);

        resultado = Math.pow(numero, 1 / raiz);

        return resultado;
    }

    public static Double raizCuadrada(Double numero) {
        return raiz(numero, 2.0);
    }

    public static Double calcularIva(Double cantidad) {

        Double resultado = 0.0;

        resultado = cantidad * (IVA / 100);

        return resultado;

    }

}
