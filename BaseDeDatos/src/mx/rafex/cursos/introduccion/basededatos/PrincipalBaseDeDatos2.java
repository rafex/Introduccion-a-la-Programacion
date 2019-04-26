package mx.rafex.cursos.introduccion.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import mx.rafex.cursos.introduccion.basededatos.productos.Producto;

public class PrincipalBaseDeDatos2 {

    static Connection conexion;

    static {
        conectarBaseDeDatos();
    }

    public static void main(final String[] args) {

        final String nombreTabla = "producto";

        final String insertarProducto = "INSERT INTO " + nombreTabla
                + " (identificador_externo,nombre,precio,cantidad) VALUES "
                + "('{identificadorExterno}','{nombre}',{precio},{cantidad})";

        String consulta = null;

        final String crearTabla = "CREATE TABLE " + nombreTabla + " " +

                "(identificador_interno bigserial primary key," +

                " identificador_externo varchar(40) NOT NULL, " +

                " nombre text NOT NULL, " +

                " precio NUMERIC(10,4) NOT NULL, " +

                " cantidad INTEGER"

                + "); ";

        ejecutarConsultaDeActualizacion(crearTabla);

        final Producto producto = crearProducto();

        consulta = insertarProducto.replace("{identificadorExterno}", producto.getIdentificadorExterno().toString())
                .replace("{nombre}", producto.getNombre()).replace("{precio}", producto.getPrecio().toString())
                .replace("{cantidad}", producto.getCantidad().toString());

        ejecutarConsultaDeActualizacion(consulta);

        consulta = "SELECT * FROM " + nombreTabla;

        final Set<Producto> resultado = ejecutarConsulta(consulta);

        if (resultado != null && !resultado.isEmpty()) {
            System.out.println("Resultados encontrados: " + resultado.size());

            System.out.println("***************************************************");

            resultado.forEach(System.out::println);
        }

    }

    private static Producto crearProducto() {
        final Producto producto = new Producto();
        final Integer idAleatorio = (int) (Math.random() * 1000) + 1;
        producto.setIdentificadorExterno(idAleatorio);
        final Integer numeroAzar = (int) (Math.random() * 100000) + 1;
        producto.setNombre("Caja_" + numeroAzar);
        final double random = new Random().nextDouble();
        final double precioRandom = 10 + random * (5000 - 10);
        final DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        producto.setPrecio(Double.valueOf(formatoDecimal.format(precioRandom)));
        producto.setCantidad((int) (Math.random() * 100000) + 1);
        return producto;
    }

    public static void conectarBaseDeDatos() {
        try {
            Class.forName("org.postgresql.Driver");
            final String url = "jdbc:postgresql://192.168.0.8:5432/rafex";
            conexion = DriverManager.getConnection(url, "externo", "externo123");

            System.out.println("Se ha conectado a la base correctamente");
        } catch (final SQLException | ClassNotFoundException e) {
            System.err.println("No se ha podido conectar a la base de datos");
            System.err.println(e.getMessage());
        }

    }

    public static void ejecutarConsultaDeActualizacion(final String consulta) {
        Statement sentencia = null;
        try {
            sentencia = conexion.createStatement();

            sentencia.executeUpdate(consulta);

            System.out.println("Se ejecuto la consulta correctamente");

            sentencia.close();

        } catch (final SQLException e) {
            System.err.println("Hubo un error al ejecutar la consulta: " + consulta);
            System.err.println(e.getMessage());
        } finally {
            try {
                if (sentencia != null)
                    sentencia.close();
            } catch (final SQLException ex) {
                System.err.println("Error al cerrar la sentencia");
                System.err.println(ex.getMessage());
            }
        }
    }

    public static Set<Producto> ejecutarConsulta(final String consulta) {
        final Set<Producto> resultado = new HashSet<>();

        try (Statement sentencia = conexion.createStatement()) {

            ResultSet resultSet = null;
            resultSet = sentencia.executeQuery(consulta);

            if (resultSet != null) {
                System.out.println("Se ejecuto la consulta correctamente");

                while (resultSet.next()) {

                    final Producto producto = new Producto();
                    producto.setIdentificadorInterno(resultSet.getInt("identificador_interno"));
                    producto.setIdentificadorExterno(resultSet.getInt("identificador_externo"));
                    producto.setNombre(resultSet.getString("nombre"));
                    producto.setCantidad(resultSet.getInt("cantidad"));
                    producto.setPrecio(resultSet.getDouble("precio"));

//                    System.out.println(producto);

                    resultado.add(producto);

                }

                sentencia.close();
                resultSet.close();

            } else
                System.err.println("Fallo la consulta");

        } catch (final SQLException e) {
            System.err.println("Hubo un error al ejecutar la consulta: ");
            System.err.println(e.getMessage());
        }

        return resultado;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null)
                conexion.close();
        } catch (final SQLException ex) {
            System.err.println("Error al cerrar la conexion");
            System.err.println(ex.getMessage());
        }
    }

}
