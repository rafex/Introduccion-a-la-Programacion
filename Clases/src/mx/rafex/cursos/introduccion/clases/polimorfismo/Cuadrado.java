package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Cuadrado extends Figura {

    private final int lado;

    public Cuadrado(final int lado, final String color) {
        super(color);
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
