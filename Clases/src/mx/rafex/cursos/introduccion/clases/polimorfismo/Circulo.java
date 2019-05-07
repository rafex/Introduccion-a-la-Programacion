package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Circulo extends Figura {

    private final int radio;

    public Circulo(final int radio, final String color) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    public int getRadio() {
        return radio;
    }

}
