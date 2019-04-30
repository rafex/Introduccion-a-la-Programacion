package gustavo;
import java.util.Scanner;
import mx.rafex.cursos.introduccion.clases.gustavo.Automovil;

public class Prueba {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in );
		System.out.println("ingrese el motor de su auto");
		float motor = entrada.nextFloat();
		
		System.out.println("ingrese la marca de su auto");
		String marca = entrada.next();
		
		System.out.println("ingrese el color de su auto");
		String color = entrada.next();
		
		System.out.println("ingrese que tipo de transmiison quiere");
		String transmision = entrada.next();
		
		//System.out.println("ingrese el año de su auto");
		//modelo = entrada.next();
		
		Automovil auto = new Automovil();
		auto.setMotor(motor);//la f es para indicar que es float
		auto.setMarca(marca);
		auto.setTransmison(transmision);
		auto.setColor(color);
		auto.setModelo(2017);
		System.out.println("el motor del carro es"+" "+ auto.getMotor() );//imprimes llamando al metodo auto.getMarca()
		System.out.println("la marca del carro es"+" "+ auto.getMarca() );
		System.out.println("transmision del carro es"+" "+ auto.getTransmision() );
		System.out.println("el color del carro es"+" "+ auto.getColor() );
		System.out.println("el modelo del carro es"+" "+ auto.getModelo() ); 
				
	}

}
