package mx.rafex.cursos.introduccion.clases.personas;

public class Maestro extends Persona {

    private String profesion;
    private String gradoDeEstudios;

    public Maestro() {
        super();
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

    @Override
    public String toString() {
        return "Maestro [profesion=" + this.profesion + ", gradoDeEstudios=" + this.gradoDeEstudios
                + ", getNacionalidad()=" + this.getNacionalidad() + ", getNombre()=" + this.getNombre()
                + ", getApellido()=" + this.getApellidoMaterno() + ", getEdad()=" + this.getEdad() + ", getSexo()="
                + this.getSexo() + ", getFechaNacimiento()=" + this.getFechaNacimiento() + "]";
    }

}
