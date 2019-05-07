package mx.rafex.cursos.introduccion.clases.polimorfismo;

public abstract class Figura {

    private final String color;

    public Figura(final String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

}
