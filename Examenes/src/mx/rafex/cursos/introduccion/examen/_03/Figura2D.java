package mx.rafex.cursos.introduccion.examen._03;

public abstract class Figura2D extends Figura {

    public Figura2D() {

    }

    public Figura2D(final String nombre, final String color) {
        super(nombre, color);
    }

    public abstract double area();
}
