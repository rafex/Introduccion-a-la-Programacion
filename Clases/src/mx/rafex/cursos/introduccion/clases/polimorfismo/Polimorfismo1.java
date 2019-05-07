package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Polimorfismo1 {

    public static void main(final String[] args) {

        Figura f;

        f = new Triangulo(20, 40, "rojo");

        System.out.println("Triangulo ");
        System.out.println("Color: " + f.getColor());
        System.out.println("Área: " + f.area());

        f = new Circulo(30, "verde");

        System.out.println("Circulo ");
        System.out.println("Color: " + f.getColor());
        System.out.println("Área: " + f.area());

    }

}
