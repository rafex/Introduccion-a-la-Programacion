package mx.rafex.cursos.introduccion.clases.productos;

import mx.rafex.cursos.introduccion.clases.enums.TipoProducto;

public class Producto {

    private String nombre;
    private Double precio;
    private TipoProducto tipo;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(final Double precio) {
        this.precio = precio;
    }

    public TipoProducto getTipo() {
        return this.tipo;
    }

    public void setTipo(final TipoProducto tipo) {
        this.tipo = tipo;
    }

}
