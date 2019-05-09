package mx.rafex.cursos.introduccion.examen._03;

public class Polimorfismo {

    public static void main(final String[] args) {

        Persona persona = new Alumno();
        persona.setNombre("Jose");
        persona.setEdad(24);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        persona = new Maestro();
        persona.setNombre("Jose");
        persona.setEdad(24);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

    }

}
