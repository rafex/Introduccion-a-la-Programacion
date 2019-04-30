package mx.rafex.cursos.introduccion.clases.carlos;

public class Trailers extends Automovil{
		
	
	
		private String tipoCamion;
		private String tipoSeguro;
		
		//CONSTRUCTOR
		public Trailers() {
			tipoCamion = "doble caja";
		}
		
		// llamamos los atributos de la clase automovil y agregamos los atributos de trailers 
		// con su respectivo tipo de dato
		
		public Trailers(final String color, String marca, Float kilometraje, String tipoCamion,String tipoSeguro) {
			
			// super palabra reservada que manda a llamar a la clase padre
			super(color, marca, kilometraje);
			
			// inicializamos los valores de la clase trailers
			
			this.tipoCamion = tipoCamion;
			this.tipoSeguro = tipoSeguro;
		}
		
		
		//getter
		public String getTipoCamion(){
			return tipoCamion;	
		}
		
		public String getTipoSeguro() {
			return tipoSeguro;
		}
		
		//setter
		public void setTipoCamion(String tipoCamion) {
			this.tipoCamion = tipoCamion;
		}
		
	
		public void setTipoSeguro(String tipoSeguro) {
			this.tipoSeguro = tipoSeguro;
		}
	}


