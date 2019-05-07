package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Cuadrado extends Figura2D {

    private final int lado;

    public Cuadrado(final int lado, final String nombre, final String color) {
        super(nombre, color);
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

}
