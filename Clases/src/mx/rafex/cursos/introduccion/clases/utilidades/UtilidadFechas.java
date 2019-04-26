package mx.rafex.cursos.introduccion.clases.utilidades;

import java.time.LocalDate;
import java.time.ZoneId;

public class UtilidadFechas {

    private UtilidadFechas() {

    }

    public static java.util.Date convertirLocalDateAUtilDate(final LocalDate fecha) {
        return java.util.Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public java.sql.Date convertirLocalDateASqlDate(final LocalDate fecha) {
        return java.sql.Date.valueOf(fecha);
    }

    public static LocalDate convertirUtilDateALocalDate(final java.util.Date fecha) {
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
