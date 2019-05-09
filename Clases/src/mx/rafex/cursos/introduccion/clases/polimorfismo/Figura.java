package mx.rafex.cursos.introduccion.clases.polimorfismo;

/*
 * @autor rafe
 */
public abstract class Figura {

    private final String color;
    private final String nombre;

    public Figura(final String nombre, final String color) {
        this.nombre = nombre;
        this.color = color;
    }

    /**
     * Constructs a new <code>Scanner</code> that produces values scanned from the
     * specified input stream. Bytes from the stream are converted into characters
     * using the specified charset.
     *
     * @param pedro An input stream to be scanned
     * @param jose  The encoding type used to convert bytes from the stream into
     *              characters to be scanned
     * @throws IllegalArgumentException if the specified character set does not
     *                                  exist
     */
    public String getColor() {
        return this.color;
    }

    public String getNombre() {
        return this.nombre;
    }

}
