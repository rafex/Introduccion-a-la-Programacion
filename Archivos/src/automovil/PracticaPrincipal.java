package automovil;

public class PracticaPrincipal {
public static void main(String [] args){
	
		
		//CLASE AUTOMOVIL 
		Automovil auto = new Automovil();
		
		auto.setColor("plata");
	    auto.setMarca("V M W");
		auto.setKilometraje(45000f);		
		
		System.out.println("Mi auto es de la marca: " + (auto.getMarca()));
		System.out.println("Mi auto es color: " + (auto.getColor()) );
		System.out.println("Mi auto tiene " + (auto.getKilometraje() ) + " KM " );
		
		
		// CLASE TRAILERS
		Trailers camiones = new Trailers();
		
		camiones.setTipoCamion("Doble carga");
		camiones.setTipoSeguro("AXXA");
		
		System.out.println("La marca del trailer es: " + (camiones.getMarca()));
		System.out.println("El tipo de camion es :" + (camiones.getTipoCamion()));
		System.out.println("Aseguradora: " + (camiones.getTipoSeguro()));
		
		
	
		Automovil carros = new Automovil("rojo", "chevy", 85000f);
		
		System.out.println("el color es: " + carros.getColor());
		System.out.println("el modelo es: " + carros.getMarca());
		System.out.println("el kilometraje es: " + carros.getKilometraje());
		
		
		// llamamos el constructor trailers 
		
		Trailers nuevo = new Trailers("verde", "mazda", 35000f, "plataforma abierta", "GNP");
		
		System.out.println("Color : " + nuevo.getColor());
		System.out.println("Marca : " + nuevo.getMarca());
		System.out.println("kilometraje : " + nuevo.getKilometraje());
		System.out.println("Tipo de Camion : " + nuevo.getTipoCamion());
		System.out.println("Aseguradora: " + nuevo.getTipoSeguro());
		
		
	}

}
