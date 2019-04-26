package mx.rafex.cursos.introduccion.basededatos.productos;

public class Producto {

    private Integer identificadorInterno;
    private Integer identificadorExterno;
    private String nombre;
    private Double precio;
    private Integer cantidad;

    public Integer getIdentificadorInterno() {
        return identificadorInterno;
    }

    public void setIdentificadorInterno(final Integer identificadorInterno) {
        this.identificadorInterno = identificadorInterno;
    }

    public Integer getIdentificadorExterno() {
        return identificadorExterno;
    }

    public void setIdentificadorExterno(final Integer identificadorExterno) {
        this.identificadorExterno = identificadorExterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(final Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(final Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto [identificadorInterno=" + identificadorInterno + ", identificadorExterno="
                + identificadorExterno + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }

}
