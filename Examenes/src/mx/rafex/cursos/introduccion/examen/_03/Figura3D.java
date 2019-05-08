package mx.rafex.cursos.introduccion.examen._03;

public abstract class Figura3D extends Figura {

    public Figura3D() {

    }

    public Figura3D(final String nombre, final String color) {
        super(nombre, color);
    }

    public abstract double volumen();

}
