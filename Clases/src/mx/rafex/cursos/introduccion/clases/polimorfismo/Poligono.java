package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Poligono extends Figura2D {

    private final int perimetro, apotema;
    

    public Poligono(final int perimetro, final int apotema, final String nombre, final String color) {
        super(nombre, color);
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    public int getBase() {
        return this.perimetro;
    }

    public int getAltura() {
        return this.apotema;
    }

    @Override
    public double area() {
    return this.perimetro * this.apotema / 2;
    }

}
