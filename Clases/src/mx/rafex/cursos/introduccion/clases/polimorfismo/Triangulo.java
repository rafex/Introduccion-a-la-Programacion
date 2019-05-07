package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Triangulo extends Figura {

    private final int base, altura;

    public Triangulo(final int base, final int altura, final String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

}
