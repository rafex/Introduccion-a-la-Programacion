package mx.rafex.cursos.introduccion.clases;

import mx.rafex.cursos.introduccion.clases.enums.TipoProducto;
import mx.rafex.cursos.introduccion.clases.productos.Producto;

public class ClasePrincipalUsoEnums {

    public static void main(final String[] args) {

        final Producto p = new Producto();
        p.setNombre("Celular");
        p.setPrecio(4000.0);
        p.setTipo(TipoProducto.GRANEL);

        final String tipoUno = "Granel";
        final String tipoDos = "granel";
        final String tipoTres = "GRANEL";

        if (tipoUno.equals(tipoDos)) {
            System.out.println("Si es igual tipoUno con tipoDos");
        } else {
            System.out.println("NO es igual tipoUno con tipoDos");
        }
        if (tipoDos.equals(tipoTres)) {
            System.out.println("Si es igual tipoDos con tipoTres");
        } else {
            System.out.println("NO es igual tipoDos con tipoTres");
        }
        if (tipoTres.equals(tipoUno)) {
            System.out.println("Si es igual tipoTres con tipoUno");
        } else {
            System.out.println("NO es igual tipoTres con tipoUno");
        }

        // tipoUno.toUpperCase()
        // EnumProducto.valueOf(tipoUno.toUpperCase())
        // p.getTipo().equals(<enum>)
        final TipoProducto enumProducto = TipoProducto.valueOf(tipoUno.toUpperCase());

        if (p.getTipo().equals(enumProducto)) {
            System.out.println("Si son iguales");
        } else {
            System.out.println("NO son iguales");
        }

        try {
            if (TipoProducto.GRANEL.equals(TipoProducto.valueOf("fskskdfjklsjlk".toUpperCase()))) {
                System.out.println("Si son iguales");
            } else {
                System.out.println("No son iguales");
            }
        } catch (final IllegalArgumentException e) {
            System.out.println("No es un valor válido");
        }

    }

}
