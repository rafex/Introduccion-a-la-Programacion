package mx.rafex.cursos.introduccion.examen._03;

public class Persona {

    private String nombre;
    private String nacionalidad;
    private Integer edad;

    public Persona() {
    }

    public Persona(final String nombre) {
        this.nombre = nombre;
    }

    public Persona(final String nombre, final Integer edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(final String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(final Integer edad) {
        this.edad = edad;
    }

}
