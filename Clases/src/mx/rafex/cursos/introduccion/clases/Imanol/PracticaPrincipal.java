package mx.rafex.cursos.introduccion.clases.Imanol;

public class PracticaPrincipal {

	public static void main(String[] args) {

		final Automovil auto = new Automovil();

		auto.setCilindraje(12);
		auto.setColor("negro");
		auto.setDosRuedas(false);
		auto.setLitros(12.0f);
		auto.setTipo("Sedan");

		System.out.println("los cilindros del auto son");
		System.out.println(auto.getCilindraje());

		System.out.println("mi auto es de color");
		System.out.println(auto.getColor());

		if (auto.getDosRuedas() == false) {
			System.out.println(" el vehiculo es un automovil");
		} else {
			System.out.println("es una moto");

		}
		System.out.println("los consumo del auto son ");
		System.out.println(auto.getLitros());
		
		System.out.println("mi auto es tipo");
		System.out.println(auto.getTipo());
	}

}