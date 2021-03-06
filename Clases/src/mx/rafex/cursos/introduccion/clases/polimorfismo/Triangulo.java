package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Triangulo extends Figura2D {

    private final int base, altura;

    public Triangulo(final int base, final int altura, final String nombre, final String color) {
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
        return (this.base * this.altura) / 2;
    }

}
