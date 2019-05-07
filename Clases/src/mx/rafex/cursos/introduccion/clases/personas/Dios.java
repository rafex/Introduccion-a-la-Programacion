package mx.rafex.cursos.introduccion.clases.personas;

public class Dios {

    private Boolean omnipotente;
    private Boolean omnipresente;

    public Boolean getOmnipotente() {
        return this.omnipotente;
    }

    public void setOmnipotente(final Boolean omnipotente) {
        this.omnipotente = omnipotente;
    }

    public Boolean getOmnipresente() {
        return this.omnipresente;
    }

    public void setOmnipresente(final Boolean omnipresente) {
        this.omnipresente = omnipresente;
    }

    @Override
    public String toString() {
        return "Dios [omnipotente=" + this.omnipotente + ", omnipresente=" + this.omnipresente + "]";
    }

}
