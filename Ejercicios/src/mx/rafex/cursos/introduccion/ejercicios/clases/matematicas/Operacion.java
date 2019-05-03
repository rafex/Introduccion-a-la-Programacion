package mx.rafex.cursos.introduccion.ejercicios.clases.matematicas;

public interface Operacion {

    Double sumar(Double... numeros);

    Double restar(Double... numeros);

    Double multiplicacion(Double... numeros);

    Double division(Double numerosUno, Double numerosDos);

    Double exponencial(Double numero, Double exponencial);

    Double raiz(Double numero, Integer raiz);
    
    Double raizCuadrada(Double numero);

}
