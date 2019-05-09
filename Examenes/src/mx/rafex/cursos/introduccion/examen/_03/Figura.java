package mx.rafex.cursos.introduccion.examen._03;

public abstract class Figura {

    private String color;
    private String nombre;

    public Figura() {

    }

    public Figura(final String nombre, final String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

}
