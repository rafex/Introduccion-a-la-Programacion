package mx.rafex.cursos.introduccion.examen.ultimo.pregunta25;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner escaner;
        Double inicioRango = 0.0;
        Double finRango = 0.0;

        System.out.println("**************************************************************************");
        System.out.println("**************************************************************************");
        System.out.println("Bienvenidos al programa final del curso de\nIntroducción a la programación");
        System.out.println("**************************************************************************");
        System.out.println("**************************************************************************");

        final Operacion miObjetoOperacion = new Operacion();

        System.out.println("**************************************************************************");
        System.out.println("**************************************************************************");
        System.out.println("Listado de nones de un rango determinado de números");
        System.out.println("**************************************************************************");
        System.out.println("**************************************************************************");

        boolean ejecutar = false;
        do
            try {
                System.out.println("Inserte inicio del rango:");
                escaner = new Scanner(System.in);
                inicioRango = escaner.nextDouble();
                ejecutar = false;
            } catch (final Exception e) {
                ejecutar = true;
            }
        while (ejecutar);
        ejecutar = false;
        do
            try {
                System.out.println("Inserte fin del rango:");
                escaner = new Scanner(System.in);
                finRango = escaner.nextDouble();
                ejecutar = false;
            } catch (final Exception e) {
                ejecutar = true;
            }
        while (ejecutar);

        miObjetoOperacion.mostrarNone(inicioRango, finRango);

        System.out.println("**************************************************************************");
        System.out.println("**************************************************************************");
        System.out.println("Suma de pares de un rango determinado de números");
        System.out.println("**************************************************************************");
        System.out.println("**************************************************************************");

        do
            try {
                System.out.println("Inserte inicio del rango:");
                escaner = new Scanner(System.in);
                inicioRango = escaner.nextDouble();
                ejecutar = false;
            } catch (final Exception e) {
                ejecutar = true;
            }
        while (ejecutar);
        ejecutar = false;
        do
            try {
                System.out.println("Inserte fin del rango:");
                escaner = new Scanner(System.in);
                finRango = escaner.nextDouble();
                ejecutar = false;
            } catch (final Exception e) {
                ejecutar = true;
            }
        while (ejecutar);
        final Double resultadoSumaPares = miObjetoOperacion.sumaPares(inicioRango, finRango);

        System.out.println("La suma de los pares es: [" + resultadoSumaPares + "] del rango [" + inicioRango + "] al ["
                + finRango + "]");
    }

}

class Operacion {

    public Double sumaPares(Double inicio, Double fin) {

        System.out.println("Inicio rango: [" + inicio + "]");
        System.out.println("Fin rango: [" + fin + "]");
        Double sumaPares = new Double(0);

        for (Double indice = inicio; indice <= fin; indice = indice + 0.1)
            // System.out.println("Indice: " + indice);
            if (indice % 2 == 0) {
                System.out.println("Es par: " + indice);
                sumaPares += indice;
            }
        return sumaPares;
    }

    public void mostrarNone(Double inicio, Double fin) {

        System.out.println("Lista de números nones del rango: [" + inicio + "] al [" + fin + "]");
        Double indice = inicio;
        int cantidadDeNumeros = 0;
        while (indice <= fin) {
            cantidadDeNumeros++;
            if (indice % 2 != 0)
                if (indice == inicio)
                    System.out.print("Nones: [" + indice);
                else
                    System.out.print("," + indice);
            indice = indice + 0.1;
        }
        System.out.print("]");
        System.out.println(
                "\nCantidad de números " + cantidadDeNumeros + " del rango: [" + inicio + "] al [" + fin + "]");

    }

}