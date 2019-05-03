package tareas;

public class Reptiles extends Mamiferos{

    private Boolean   tieneEscamas;
    private String tipoReproduccion;
   
    //constructor
  public Reptiles(){
	  tipoReproduccion = "OVIPARA";
  }
  
  
  public Reptiles(final String nombreAnimal, String tipoAlimento, String tipoHabitad, Boolean tieneEscamas, String tipoReproduccion) {
	  super (nombreAnimal, tipoAlimento, tipoHabitad );
	  
	  this.tieneEscamas = tieneEscamas;
	  this.tipoReproduccion = tipoReproduccion;
	  
  }
  
    //get obtiene el valor del parametro

    public Boolean getTieneEscamas(){
        return tieneEscamas;
    }

    public String getTipoReproduccion(){
        return tipoReproduccion;
    }


    //set permite modificar el valor

    public void setTieneEscamas(final Boolean tieneEscamas){
        this.tieneEscamas = tieneEscamas;
    }

    public void setTipoReproduccion(final String tipoReproduccion){
        this.tipoReproduccion = tipoReproduccion;
    }

}
