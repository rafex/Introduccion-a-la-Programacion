package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Trapecio extends Figura2D {

    final int ladoInferior, ladoSuperior, altura;

    public Trapecio(final int ladoInferior, final int ladoSuperior, final int altura, final String nombre,
            final String color) {
        super(nombre, color);
        this.altura = altura;
        this.ladoInferior = ladoInferior;
        this.ladoSuperior = ladoSuperior;
    }

    @Override
    public double area() {
        return (((this.ladoSuperior + this.ladoInferior) * this.altura) / 2);
    }

}
