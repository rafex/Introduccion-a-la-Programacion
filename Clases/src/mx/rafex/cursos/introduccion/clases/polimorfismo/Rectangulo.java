package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Rectangulo extends Figura2D {

    private final int base, altura;

    public Rectangulo(final int base, final int altura, final String nombre, final String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }

}
