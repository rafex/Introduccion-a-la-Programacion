package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Piramide extends Figura3D {

    private final int areaBase, lado, altura;

    public Piramide(final int lado, final int altura, final String nombre, final String color) {
        super(nombre, color);
        this.areaBase = lado * lado;
        this.lado = lado;
        this.altura = altura;
    }

    public int getAreaBase() {
        return this.areaBase;
    }

    public int getLado() {
        return this.lado;
    }

    public int getAltura() {
        return this.altura;
    }

    @Override
    public final double volumen() {
        return (this.areaBase * this.altura) / 3;
    }

}
