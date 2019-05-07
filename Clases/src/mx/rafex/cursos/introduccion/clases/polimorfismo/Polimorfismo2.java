package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Polimorfismo2 {

    public static void main(final String[] args) {

        mostrar(new Triangulo(4, 6, "amarillo"));
        mostrar(new Circulo(4, "azul"));

    }

    public static void mostrar(final Figura f) {
        System.out.println("El color de la figura es: " + f.getColor());
        System.out.println("El área de la figura es: " + f.area());
    }

}
