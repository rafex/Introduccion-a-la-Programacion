package mx.rafex.cursos.introduccion.clases.personas;

public class Alumno extends Persona {

    // atributos de clase
    private String salon;
    private String grupo;
    private Float promedio;

    public Alumno() {
        setNacionalidad(null);
        promedio = 0f;
    }

    public Alumno(String grupo) {
        this.grupo = grupo;
    }

    public Alumno(String grupo, String salon) {
        this.grupo = grupo;
        this.salon = salon;
    }

    public Alumno(String grupo, Float promedio) {
        this.grupo = grupo;
        this.promedio = promedio;
    }

    // getter
    public String getSalon() {
        return salon;
    }

    // setter
    public void setSalon(String salon) {
        this.salon = salon;
    }

    // getter
    public String getGrupo() {
        return grupo;
    }

    // setter
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public Float getPromedio() {
        return promedio;
    }

}
