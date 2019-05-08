package mx.rafex.cursos.introduccion.clases;

import java.time.LocalDate;
import java.util.Date;

import mx.rafex.cursos.introduccion.clases.personas.Alumno;
import mx.rafex.cursos.introduccion.clases.personas.Maestro;
import mx.rafex.cursos.introduccion.clases.personas.Persona;
import mx.rafex.cursos.introduccion.clases.utilidades.UtilidadFechas;

public class PrincipalClases {

    public static void main(final String[] args) {

        final Persona objetoPersona = new Persona();
        /// la fecha se ingresa así YYYY/MM/dd
        final LocalDate fechaNacimientoLocalDate = LocalDate.of(1992, 05, 31);
        objetoPersona.setFechaNacimiento(UtilidadFechas.convertirLocalDateAUtilDate(fechaNacimientoLocalDate));
        objetoPersona.calcularEdad();
        objetoPersona.setSexo('H');
        objetoPersona.setNombre("pepe");

        System.out.println(objetoPersona);

        System.out.println("La edad de la persona es: " + objetoPersona.getEdad());
        System.out.println("El nombre de la persona es: " + objetoPersona.getNombre());

        objetoPersona.setNombre("Tiburcio");
        objetoPersona.setEdad(20);
        objetoPersona.setSexo('I');

        System.out.println(objetoPersona);

//        final Persona jose = new Persona("Jose", "Zamora", 32);
//
//        System.out.println(jose);

//        final Persona pedro = new Persona("pedro", "ramirez", "francesa", 30, 'H',
//                UtilidadFechas.convertirLocalDateAUtilDate(LocalDate.of(1988, 10, 11)));
//
//        System.out.println(pedro);
//
        final Persona persona = new Persona();

        persona.setNombre("Rosa");
        persona.setEdad(15);
        persona.setApellidoMaterno("Lopez");
        persona.setNacionalidad("colombiana");
        persona.setSexo('M');
        Date fechaNacimientoDate = UtilidadFechas.convertirLocalDateAUtilDate(LocalDate.of(1988, 10, 11));
        persona.setFechaNacimiento(fechaNacimientoDate);
//
//        System.out.println(persona);
//
//        persona = new Persona("Pancho", "Matador", 50);
//
//        System.out.println(persona);
//
        final Persona p = new Persona();
        final Maestro objetoMaestro = new Maestro("Raúl", "Arquitecto de Software");

        fechaNacimientoDate = UtilidadFechas.convertirLocalDateAUtilDate(LocalDate.of(1988, 11, 03));
        objetoMaestro.setFechaNacimiento(fechaNacimientoDate);
        objetoMaestro.setSexo('H');
        objetoMaestro.calcularEdad();
        objetoMaestro.setGradoDeEstudios("Licenciatura");

        System.out.println(objetoMaestro);

        final Alumno objetoAlumno = new Alumno();

        objetoAlumno.setPromedio(9.5f);
        objetoAlumno.setNombre("Rogelio Gonzalez");
        objetoAlumno.setApellidoPaterno("Gonzalez");

    }

}
