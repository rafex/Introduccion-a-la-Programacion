package mx.rafex.cursos.introduccion.clases;

import mx.rafex.cursos.introduccion.clases.enums.PuntosCardinales;

public class ClasePrincipalUsoEnums2 {

    public static void main(final String[] args) {

        final PuntosCardinales puntoCardinal = PuntosCardinales.NORTE;

        switch (puntoCardinal) {
        case NORTE:
            System.out.println("Estas en el: " + PuntosCardinales.NORTE);
            System.out.println("Código del punto cardinal: " + PuntosCardinales.NORTE.getInicialPuntoCardinal());
            break;
        case SUR:
            System.out.println("Estas en el: " + PuntosCardinales.SUR);
            System.out.println("Código del punto cardinal: " + PuntosCardinales.SUR.getInicialPuntoCardinal());
            break;
        case OESTE:
            System.out.println("Estas en el: " + PuntosCardinales.OESTE);
            System.out.println("Código del punto cardinal: " + PuntosCardinales.OESTE.getInicialPuntoCardinal());
            break;
        case ESTE:
            System.out.println("Estas en el: " + PuntosCardinales.ESTE);
            System.out.println("Código del punto cardinal: " + PuntosCardinales.ESTE.getInicialPuntoCardinal());
            break;
        default:
            System.out.println("Estas perdido...");
            break;

        }

    }

}
