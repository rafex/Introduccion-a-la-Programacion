package automovil;

public class Automovil {
	private  String color;
	private  String marca;
	private  Float  kilometraje;

	
	//constructor 
	public Automovil() {
		marca = "Chevrolet";
	}
	
	
	//constructor
	public Automovil(final String color) {
		this.color = color;
	}
	
	// constructor
	public Automovil(final String color, String marca, Float kilometraje) {
		this.color = color;
		this.marca = marca;
		this.kilometraje = kilometraje;
	}
	
	
	// GET obtiene el valor del parametro
	
	public String getColor() {
		return color;
	}
	
	public String getMarca() {
		return  marca;
	}
		
	public Float getKilometraje(){
		return kilometraje;
	}
	
	
	//SET permite moficar el valor
	
	public void setColor(final String color) {
		this.color = color;
	}
	
	public void setMarca(final String marca) {
		this.marca = marca ;
	}
	
	public void setKilometraje(final Float kilometraje) {
		this.kilometraje = kilometraje;
	}

}
