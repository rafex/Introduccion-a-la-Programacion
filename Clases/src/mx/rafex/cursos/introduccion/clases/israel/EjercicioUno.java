package mx.rafex.cursos.introduccion.clases.israel;

public class EjercicioUno {
	public static void main(String[] args) {

		final Automovil auto = new Automovil();
		final Convertible objeto = new Convertible();

		auto.setMotor(8);
		auto.setLlantas(4);
		auto.setPuertas(4);
		auto.setColor("negro");
		auto.setMarca("JEEP Wrangler");
		objeto.setConvertible("convertible");
		objeto.setRinesCromados("rines cromados");

		System.out.println("Los cilindros que tiene el motor de mi auto son");
		System.out.println(auto.getMotor());

		System.out.println("Las llantas que tiene mi carro");
		System.out.println(auto.getLlantas());

		System.out.println("Las puertas de mi auto son");
		System.out.println(auto.getPuertas());

		System.out.println("El color de mi carro es");
		System.out.println(auto.getColor());

		System.out.println("La marca de mi carro es");
		System.out.println(auto.getMarca());
		
		System.out.println("Mi carro es");
		System.out.println(objeto.getConvertible());
		
		System.out.println("se agregaron");
		System.out.println(objeto.getRinesCromados());
		
		//Primer constructor
		Automovil carro = new Automovil("negro" , "Jeep");
		System.out.println(carro.getColor());
		System.out.println(carro.getMarca());
		
		//Segundo constructor
		Automovil coche = new Automovil(8, 4, 4, "negro", "Jeep Wrangler");
		System.out.println(coche.getMotor());
		System.out.println(coche.getLlantas());
		System.out.println(coche.getPuertas());
		System.out.println(coche.getColor());
		System.out.println(coche.getMarca());
			
	}

}