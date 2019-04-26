package mx.rafex.cursos.introduccion.clases;

import java.time.LocalDate;
import java.util.Date;

import mx.rafex.cursos.introduccion.clases.personas.Maestro;
import mx.rafex.cursos.introduccion.clases.personas.Persona;
import mx.rafex.cursos.introduccion.clases.utilidades.UtilidadFechas;

public class PrincipalClases {

    public static void main(final String[] args) {

        final Persona pepe = new Persona();
        /// la fecha se ingresa así YYYY/MM/dd
        final LocalDate fechaNacimientoLocalDate = LocalDate.of(1980, 01, 03);
        pepe.setFechaNacimiento(UtilidadFechas.convertirLocalDateAUtilDate(fechaNacimientoLocalDate));
        pepe.calcularEdad();
        pepe.setNombre("pepe");

        System.out.println(pepe);

        final Persona jose = new Persona("Jose", "Zamora", 32);

        System.out.println(jose);

        final Persona pedro = new Persona("pedro", "ramirez", "francesa", 30, 'H',
                UtilidadFechas.convertirLocalDateAUtilDate(LocalDate.of(1988, 10, 11)));

        System.out.println(pedro);

        Persona persona = new Persona();

        persona.setNombre("Rosa");
        persona.setEdad(15);
        persona.setApellido("Lopez");
        persona.setNacionalidad("colombiana");
        persona.setSexo('M');
        Date fechaNacimientoDate = UtilidadFechas.convertirLocalDateAUtilDate(LocalDate.of(1988, 10, 11));
        persona.setFechaNacimiento(fechaNacimientoDate);

        System.out.println(persona);

        persona = new Persona("Pancho", "Matador", 50);

        System.out.println(persona);

        final Maestro maestro = new Maestro("Raúl", "Arquitecto de Software");

        fechaNacimientoDate = UtilidadFechas.convertirLocalDateAUtilDate(LocalDate.of(1988, 11, 03));
        maestro.setFechaNacimiento(fechaNacimientoDate);
        maestro.setSexo('H');
        maestro.calcularEdad();
        maestro.setGradoDeEstudios("Licenciatura");

        System.out.println(maestro);

    }

}
