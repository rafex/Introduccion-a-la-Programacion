package mx.rafex.cursos.introduccion.clases.personas.copy;

public class Maestro extends Persona {

    private String profesion;
    private String gradoDeEstudios;

    public String getProfesion() {
        return this.profesion;
    }

    public void setProfesion(final String profesion) {
        this.profesion = profesion;
    }

    public String getGradoDeEstudios() {
        return this.gradoDeEstudios;
    }

    public void setGradoDeEstudios(final String gradoDeEstudios) {
        this.gradoDeEstudios = gradoDeEstudios;
    }

}
