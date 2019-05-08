package mx.rafex.cursos.introduccion.examen._03;

public class Maestro extends Persona {

    private String profesion;
    private String gradoDeEstudios;

    public Maestro() {
    }

    public Maestro(final String nombre, final String profesion) {
        super(nombre);
        this.profesion = profesion;
    }

    public Maestro(final String nombre, final String profesion, final String gradoDeEstudios) {
        super(nombre);
        this.profesion = profesion;
        this.gradoDeEstudios = gradoDeEstudios;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(final String profesion) {
        this.profesion = profesion;
    }

    public String getGradoDeEstudios() {
        return gradoDeEstudios;
    }

    public void setGradoDeEstudios(final String gradoDeEstudios) {
        this.gradoDeEstudios = gradoDeEstudios;
    }

}
