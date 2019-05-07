package mx.rafex.cursos.introduccion.clases.polimorfismo;

public class Trapecio extends Figura2D {

    private final int ladoSuperior, ladoInferior, altura;

    public Trapecio(final int ladoSuperior, final int ladoInferior, final int altura, final String nombre,
            final String color) {
        super(color, nombre);
        this.ladoInferior = ladoInferior;
        this.ladoSuperior = ladoSuperior;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.altura * ((this.ladoSuperior + this.ladoInferior) / 2));
    }
}