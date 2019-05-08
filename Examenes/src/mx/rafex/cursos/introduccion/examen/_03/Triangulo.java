package mx.rafex.cursos.introduccion.examen._03;

public class Triangulo extends Figura2D {

    private int base, altura;

    public Triangulo() {
        super();
    }

    public Triangulo(final int base, final int altura, final String nombre, final String color) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    public void setBase(final int base) {
        this.base = base;
    }

    public void setAltura(final int altura) {
        this.altura = altura;
    }

}
