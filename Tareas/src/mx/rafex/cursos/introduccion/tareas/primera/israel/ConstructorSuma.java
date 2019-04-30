package mx.rafex.cursos.introduccion.tareas.primera.israel;

public class ConstructorSuma {

	public Integer digito1 = 8;
	public Integer digito2 = 26;
	public Integer resultado = digito1 + digito2;
	
	
	public ConstructorSuma (Integer digito1, Integer digito2, Integer resultado) {
		this.digito1 = digito1;
		this.digito2 = digito2;
		this.resultado = resultado;
		resultado = digito1+digito2;
		System.out.println("El resultado de la suma es" + resultado);
		}
		
		
			
		
}

