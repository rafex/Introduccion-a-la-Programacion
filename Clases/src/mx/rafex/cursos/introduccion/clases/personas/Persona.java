package mx.rafex.cursos.introduccion.clases.personas;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import mx.rafex.cursos.introduccion.clases.utilidades.UtilidadFechas;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nacionalidad;
    private Integer edad;
    private Character sexo;
    private Date fechaNacimiento;

    public Persona() {
        nacionalidad = "mexicana";
    }

    public Persona(final String nombre) {
        this.nombre = nombre;
    }

    public Persona(final String nombre, final String apellido, final String nacionalidad, final Integer edad,
            final Character sexo, final Date fechaNacimiento) {
        this.nombre = nombre;
        apellidoMaterno = apellido;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(final String nombre, final String apellido, final Integer edad) {
        super();
        this.nombre = nombre;
        apellidoMaterno = apellido;
        this.edad = edad;
    }

    // getter
    public String getNacionalidad() {
        return nacionalidad;
    }

    // setter
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(final String apellido) {
        apellidoMaterno = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(final Integer edad) {
        this.edad = edad;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(final Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(final Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void calcularEdad() {
//        final DateTimeFormatter formatoDeFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final LocalDate fechaNacimiento = UtilidadFechas.convertirUtilDateALocalDate(this.fechaNacimiento);
        final LocalDate ahora = LocalDate.now();

        final Period periodo = Period.between(fechaNacimiento, ahora);

        edad = periodo.getYears();

//        System.out.printf("Tu edad es: %s años, %s meses y %s días\n", periodo.getYears(), periodo.getMonths(),
//                periodo.getDays());
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellidoMaterno + ", nacionalidad=" + nacionalidad
                + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
