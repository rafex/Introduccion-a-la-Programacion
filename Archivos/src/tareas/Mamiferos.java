package tareas;

public class Mamiferos{

    private String   nombreAnimal;
    private String   tipoAlimento;
    private String   tipoHabitad;
 

    //constructor
    public Mamiferos(){
        tipoAlimento = "OMNIVORO";
    }
    
    public Mamiferos(final String nombreAnimal, String tipoAlimento, String tipoHabitad) {
    	this.nombreAnimal = nombreAnimal;
    	this.tipoAlimento = tipoAlimento;
    	this.tipoHabitad = tipoHabitad;
    }

    //get obtiene el valor del parametro

    public String getNombreAnimal(){
        return nombreAnimal;
    }

    public String getTipoAlimento(){
        return tipoAlimento;
    }

    public String getTipoHabitad(){
        return tipoHabitad;
    }


    //set permite modificar el valor

    public void setNombreAnimal(final String nombreAnimal){
        this.nombreAnimal = nombreAnimal;
    }

    public void setTipoAlimento(final String tipoAlimento){
        this.tipoAlimento = tipoAlimento;
    }

    public void setTipoHabitad(final String tipoHabitad){
        this.tipoHabitad = tipoHabitad;
    }

}