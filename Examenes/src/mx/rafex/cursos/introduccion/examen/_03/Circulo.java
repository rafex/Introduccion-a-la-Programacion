package mx.rafex.cursos.introduccion.examen._03;

public class Circulo extends Figura2D {

    private int radio;

    public Circulo() {
        super();
    }

    public Circulo(final int radio, final String nombre, final String color) {
        super(nombre, color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(final int radio) {
        this.radio = radio;
    }

}
