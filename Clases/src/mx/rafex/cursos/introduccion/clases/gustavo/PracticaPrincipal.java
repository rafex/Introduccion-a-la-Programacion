package mx.rafex.cursos.introduccion.clases.gustavo;

public class PracticaPrincipal {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		auto.setMotor(3.5f);//la f es para indicar que es float
		auto.setMarca("mazda");
		auto.setTransmison("estandar");
		auto.setColor("azul");
		auto.setModelo(2019);
		System.out.println("el motor del carro es"+" "+ auto.getMotor() );//imprimes llamando al metodo auto.getMarca()
		System.out.println("la marca del carro es"+" "+ auto.getMarca() );
		System.out.println("transmision del carro es"+" "+ auto.getTransmision() );
		System.out.println("el color del carro es"+" "+ auto.getColor() );
		System.out.println("el modelo del carro es"+" "+ auto.getModelo() ); 
				
	}

}
