package mx.rafex.cursos.introduccion.ejercicios;

public class Calculadora {

    public static void main(final String[] args) {

        double indice, radicando;
        System.out.println("Ingrese el radicando ");
        radicando = 80;
        System.out.println("Ingrese el indice");
        indice = 2;
        final float resultado2 = (float) Math.pow(radicando, 1 / indice);
        System.out.println("La raíz " + indice + " de " + radicando + " es " + resultado2);

    }

}
