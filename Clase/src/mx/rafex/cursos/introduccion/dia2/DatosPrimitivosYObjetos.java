package mx.rafex.cursos.introduccion.dia2;

public class DatosPrimitivosYObjetos {

    public static void main(String[] args) {

        // datos primitivos;

        // de tipo entero
        final int numero1 = 2147483647;
        // de tipo long o sea mayor que un entero
        final long long1 = 9223372036854775807l;
        // de tipo flotante;
        final float flotante1 = 9223372036854775807.1f;
        // de tipo double
        final double double1 = 9223372036854775807.44444;
        // de tipo booleano solo tiene dos valores verdadero (true) o falso (false)
        final boolean boolean1 = true;
        // de tipo caracter
        final char char1 = 'H';

        // objetos

        final Integer integer1 = 2147483647;
        final Integer integer2 = new Integer(2147483647);

        final Long longObjeto1 = 9223372036854775807l;
        final Long longObjeto2 = new Long(9223372036854775807l);

        final Float floatObjeto1 = 9223372036854775807.1f;
        final Float floatObjeto2 = new Float(9223372036854775807.1f);

        final Double doubleObjeto1 = 9223372036854775807.44444;
        final Double doubleObjeto2 = new Double(9223372036854775807.44444);

        final Boolean booleanObjeto1 = false;
        final Boolean booleanObjeto2 = new Boolean(true);

        final Character characterObjet1 = 'C';
        final Character characterObjet2 = new Character('C');

        final String cadenaDeCaracteres = "esto es una cadena";
        final String cadenaDeCaracteres2 = new String("esto es una cadena");

        System.out.println("texto " + integer1);

        String nuevaCadena = "nueva cadena";
        System.out.println(nuevaCadena);

        final String complementoCadena = "complemento de cadena";
        System.out.println(complementoCadena);

        String cadenaCompleta = nuevaCadena + complementoCadena;
        System.out.println(cadenaCompleta);

        nuevaCadena = "valor modificado";
        System.out.println(nuevaCadena);

        cadenaCompleta = nuevaCadena + complementoCadena;
        System.out.println(cadenaCompleta);
        
        

    }

}
