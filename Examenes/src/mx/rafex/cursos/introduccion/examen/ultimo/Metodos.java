package mx.rafex.cursos.introduccion.examen.ultimo;

public class Metodos {

    private int atributo1;
    private String atributo2;

    public void metodo1(final int parametro1, final String parametro2) {
        final int variableDeMetodo = parametro1;
        atributo1 = variableDeMetodo;
        atributo2 = parametro2;
        return;
    }

    public int getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(final int atributo1) {
        this.atributo1 = atributo1;
    }

    public String getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(final String atributo2) {
        this.atributo2 = atributo2;
    }

}
