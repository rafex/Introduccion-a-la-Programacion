package mx.rafex.cursos.introduccion.clases.israel;

public class Automovil {
	private Integer motor;
	private Integer llantas;
	private Integer puertas;
	private String color;
	private String marca;
	
	public Automovil() {
	motor = 4;
	llantas = 4;
	puertas = 4;
	color = "negro";
	marca = "Jeep Wrangler";
	}
		
	public Automovil(Integer motor, Integer llantas, Integer puertas,String color, String marca) {
		this.motor = motor;
		this.llantas = llantas;
		this.puertas = puertas;	
		this.color = color;
		this.marca = marca;
		}
	
	public Automovil(String color, String marca) {
		this.color = color;
		this.marca = marca;
		}
	
	
	

	//getter motor
	public Integer getMotor() {
		return motor;
	}
	//setter motor
	public void setMotor(Integer motor) {
		this.motor = motor;
	}
	//getter llantas
	public Integer getLlantas() {
		return llantas;
	}
	//setter llantas
	public void setLlantas(Integer llantas) {
		this.llantas = llantas;
	}
	//getter puertas
	public Integer getPuertas() {
		return puertas;
	}
	//setter puertas
	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	//getter color
	public String getColor() {
		return color;
	}
	//setter color
	public void setColor(String color) {
		this.color = color;
	}
	//getter marca
	public String getMarca() {
		return marca;
	}
	//setter marca
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
