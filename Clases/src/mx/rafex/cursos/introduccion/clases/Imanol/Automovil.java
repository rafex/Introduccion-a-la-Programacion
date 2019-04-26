package mx.rafex.cursos.introduccion.clases.Imanol;

public class Automovil {
	
	private String tipo; // Sedan-camioneta-moto
	private Boolean dosRuedas;
	private String color;
	private Float litros;
	private Integer cilindraje;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
	}
		public Boolean getDosRuedas() {
			return dosRuedas;
		}
		public void setDosRuedas(Boolean dosRuedas ) {
			this.dosRuedas = false ;
		
	}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
			
		}
		
		public Float getLitros() {
			return litros;
		}
		public void setLitros(Float litros) {
			this.litros = litros;
			
		}
		
		public Integer getCilindraje() {
			return cilindraje;
		}
		public void setCilindraje(Integer cilindraje) {
			this.cilindraje = cilindraje;
			
			
		}

}
