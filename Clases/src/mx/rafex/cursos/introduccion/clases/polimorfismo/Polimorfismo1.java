package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Polimorfismo1 {

    public static void main(final String[] args) {

        Figura2D f;

        f = new Triangulo(20, 40, "triangulo", "rojo");

        System.out.println("Figura: " + f.getNombre());
        System.out.println("Color: " + f.getColor());
        System.out.println("Ã�rea: " + f.area());

        f = new Circulo(30, "circulo", "verde");

        System.out.println("Figura: " + f.getNombre());
        System.out.println("Color: " + f.getColor());
        System.out.println("Ã�rea: " + f.area());

        f = new Cuadrado(4, "cuadrado", "naranja");

        System.out.println("Figura: " + f.getNombre());
        System.out.println("Color: " + f.getColor());
        System.out.println("Ã�rea: " + f.area());

        f = new Poligono(8, 5, "Poligono", "morado");
        System.out.println("Figura: " + f.getNombre());
        System.out.println("Color: " + f.getColor());
        System.out.println("Ã�rea: " + f.area());
    }

}
