package mx.rafex.cursos.introduccion.clases;

import mx.rafex.cursos.introduccion.clases.personas.Alumno;

public class PrincipalClase2 {

    public static void main(String[] args) {

        final Alumno variableAlumno = new Alumno("C150");

        System.out.println("La nacionalidad del objeto es: " + variableAlumno.getNacionalidad());
        System.out.println("Grupo: " + variableAlumno.getGrupo());

    }

}
