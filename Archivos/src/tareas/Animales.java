package tareas;

public class Animales{
	   public static void main(String [] args){


	    Mamiferos  animal = new Mamiferos();
	    animal.setNombreAnimal("LEON");
	    animal.setTipoAlimento("CARNIVORO");
	    animal.setTipoHabitad("SELVA");

	    System.out.println("Nombre Animal: " + (animal.getNombreAnimal()));
	    System.out.println("Tipo de Alimentracion: " + (animal.getTipoAlimento()));
	    System.out.println("Comunmente vive en: " + (animal.getTipoHabitad())+ "\n");
	    
	    	    
	    Reptiles nuevo = new Reptiles("COCODRILO", "CARNIVORO", "SELVA", true, "OVIPARO");
	    
	    System.out.println("Nombre Animal: " + (nuevo.getNombreAnimal()));
	    System.out.println("Tipo de Alimentracion: " + (nuevo.getTipoAlimento()));
	    System.out.println("Comunmente vive en: " + (nuevo.getTipoHabitad()));
	    System.out.println("Tiene escamas: " + (nuevo.getTieneEscamas()));
	    System.out.println("Tipo de reproducción: " + (nuevo.getTipoReproduccion()));
	   }
	   
	}