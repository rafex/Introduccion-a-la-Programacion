package mx.rafex.cursos.introduccion.ejercicios;

public class Calculadora {

    public static void main(final String[] args) {

        double indice, radicando;
        System.out.println("Ingrese el radicando ");
        radicando = 80;
        System.out.println("Ingrese el indice");
        indice = 2;
        float resultado2 = (float) Math.pow(radicando, 1 / indice);
        System.out.println("La raíz " + indice + " de " + radicando + " es " + resultado2);

        resultado2 = (float) Math.sqrt(radicando);
        System.out.println("La raíz " + indice + " de " + radicando + " es " + resultado2);

        System.out.println("2^15 " + Math.pow(2, 15));

    }

}
