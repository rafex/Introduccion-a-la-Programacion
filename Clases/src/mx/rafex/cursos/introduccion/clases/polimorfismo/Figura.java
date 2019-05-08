package mx.rafex.cursos.introduccion.clases.polimorfismo;

public abstract class Figura {

    private final String color;
    private final String nombre;

    public Figura(final String nombre, final String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public String getNombre() {
        return this.nombre;
    }

}
