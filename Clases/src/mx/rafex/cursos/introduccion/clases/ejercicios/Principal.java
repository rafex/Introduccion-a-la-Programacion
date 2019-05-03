package mx.rafex.cursos.introduccion.clases.ejercicios;

public class Principal {

    public static void main(String[] lalla) {

        System.out.println("La suma de 4.0 + 9.0 es: " + Operacion.suma(4.0, 9.0));
        System.out.println("La resta de 9.0 - 4.0 es: " + Operacion.resta(9.0,4.0));
        System.out.println("El valor de PI es: " + Math.PI);
        System.out.println("El valor de IVA es: " + Operacion.IVA);
        System.out.println("El de IVA 70 es: " + Operacion.calcularIva(70.0));

    }

}
