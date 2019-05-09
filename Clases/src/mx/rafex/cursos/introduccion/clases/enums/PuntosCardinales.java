package mx.rafex.cursos.introduccion.clases.enums;

public enum PuntosCardinales {

    NORTE("N"), SUR("S"), ESTE("E"), OESTE("O");

    private final String incialPuntoCardinal;

    PuntosCardinales(final String inicialPuntoCardinal) {
        this.incialPuntoCardinal = inicialPuntoCardinal;
    }

    public String getInicialPuntoCardinal() {
        return this.incialPuntoCardinal;
    }

}
