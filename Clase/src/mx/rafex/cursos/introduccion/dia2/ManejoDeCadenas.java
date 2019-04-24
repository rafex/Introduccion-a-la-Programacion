package mx.rafex.cursos.introduccion.dia2;

public class ManejoDeCadenas {

    public static void main(String[] args) {

        final String miTexto = "A mi me gustan las margaritas";

        final String nombre1 = "jose";

        final String nombre2 = "jose";

        final String nombre3 = "Pedro Gómez";

        System.out.println(miTexto);

        System.out.println("Longitud del texto: " + miTexto.length());

        System.out.println("Traer letra del espacio 2: " + miTexto.charAt(2));

        System.out.println("Dónde esta la primera aparición de la letra 'm': " + miTexto.indexOf("m"));

        System.out.println("Dónde esta la última aparición de la letra 'm': " + miTexto.lastIndexOf("m"));

        System.out.println("Remplazar las 'm' por 'z': " + miTexto.replace("m", "z"));

        System.out.println("Todo en mayusculas: " + nombre3.toUpperCase());

        System.out.println("Todo en minusculas: " + nombre3.toLowerCase());

        System.out.println("Traer texto de la posicion 2 a la 19: " + miTexto.substring(2, 20));

        System.out.println("Traer texto de la posicion 2 al final: " + miTexto.substring(2));

        System.out
                .println("Traer texto de la posicion 2 al final con length: " + miTexto.substring(2, miTexto.length()));

        if (nombre1 == nombre2)
            System.out.println("Son iguales estos objetos");

        if (nombre1.equals(nombre2))
            System.out.println("Son iguales en todo el objeto nombre1 a nombre2");

        if (miTexto.contains("m"))
            System.out.println("mi texto tiene 'm' ");

        String[] cadenasPartidas;
        cadenasPartidas = miTexto.split(" ");

        System.out.println("impresión de mi arreglo: " + cadenasPartidas);

        for (final String cadena : cadenasPartidas)
            System.out.println("Mi cadena partida: " + cadena);

        for (int i = 0; i < cadenasPartidas.length; i++)
            System.out.println("Mi cadena partida en la posicion [ " + i + " ]" + cadenasPartidas[i]);

        final Integer[] arregloNumeros = { 5, 2, 6 };
        final Object[] arregloDeObject = { 5, 2, 6, "7" };

    }
}
