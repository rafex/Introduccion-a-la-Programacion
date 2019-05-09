package mx.rafex.cursos.introduccion.examen._03;

public class Alumno extends Persona {

    private String salon;
    private String grupo;
    private Float promedio;

    public Alumno() {
        promedio = 0f;
    }

    public Alumno(final String grupo) {
        this.grupo = grupo;
    }

    public Alumno(final String grupo, final String salon) {
        this.grupo = grupo;
        this.salon = salon;
    }

    public Alumno(final String grupo, final Float promedio) {
        this.grupo = grupo;
        this.promedio = promedio;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(final String salon) {
        this.salon = salon;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(final String grupo) {
        this.grupo = grupo;
    }

    public void setPromedio(final Float promedio) {
        this.promedio = promedio;
    }

    public Float getPromedio() {
        return promedio;
    }

}
