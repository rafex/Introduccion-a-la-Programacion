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

    @Override
    public String toString() {
        return "Maestro [profesion=" + profesion + ", gradoDeEstudios=" + gradoDeEstudios + ", getNacionalidad()="
                + getNacionalidad() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellidoMaterno()
                + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + ", getFechaNacimiento()="
                + getFechaNacimiento() + "]";
    }

}
