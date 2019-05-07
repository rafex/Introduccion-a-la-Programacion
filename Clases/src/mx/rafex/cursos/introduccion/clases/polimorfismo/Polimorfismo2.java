package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Polimorfismo2 {

    public static void main(final String[] args) {

        mostrar(new Triangulo(4, 6, "triangulo", "amarillo"));
        mostrar(new Circulo(4, "cuadrado", "azul"));
        mostrar(new Poligono(8, 5, "Poligono", "morado"));

    }

    public static void mostrar(final Figura2D f) {
        System.out.println("Figura: " + f.getNombre());
        System.out.println("El color de la figura es: " + f.getColor());
        System.out.println("El área de la figura es: " + f.area());
    }

}
