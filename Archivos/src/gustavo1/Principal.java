package gustavo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import gustavo.Mensaje;
import mx.rafex.cursos.introduccion.clases.ejercicios.Operacion;

public class Principal {
	public static void main(String[] lalla) {
		int operacion;
		Double numero;// decalro varibales 
		Double numero1;//decalo varibles
		Double[] valores;
		char respuesta;
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese la operacion a realizar");
		System.out.println("1 suma");
		System.out.println("2 resta");
		System.out.println("3 multiplicación");
		System.out.println("4 división");
		System.out.println("5 Iva");
		operacion = entrada.nextInt();
		final List<Double> arrayList = new ArrayList<>();

		switch (operacion) {

		case 1:
			do {
				System.out.println("ingrese los numeros a sumar");
				numero = entrada.nextDouble();
				arrayList.add(numero);
				System.out.println("desea agregar otro numero S/N ");
				respuesta = entrada.next().charAt(0);//le menciono la direccion que quiero que tome 
			} while (respuesta == 's' || respuesta == 'S');

			valores = new Double[arrayList.size()];//tamaño del arreglo 
			for(int i = 0 ; i < valores.length ; i++) {//itera para que meta los valores al arreglo
				valores[i] = arrayList.get(i);
			}
			System.out.println("la suma es" + Operacion.suma(valores));
			break;
				
		
			/*
			para sumar dos numeros nadamas
			System.out.println("ingreso los numeros a sumar");
			numero = entrada.nextDouble();
			System.out.println("ingreso los numeros a sumar");
			numero1 = entrada.nextDouble();
			System.out.println("La suma es " + Operacion.suma(numero, numero1));
			break;
			 */
			

		case 2:
			do {
				System.out.println("ingrese los numeros a restar");
				numero = entrada.nextDouble();
				arrayList.add(numero);
				System.out.println("desea agregar otro numero S/N ");
				respuesta = entrada.next().charAt(0);//le menciono la direccion que quiero que tome 
			} while (respuesta == 's' || respuesta == 'S');

			valores = new Double[arrayList.size()];//tamaño del arreglo 
			for(int i = 0 ; i < valores.length ; i++) {//itera para que meta los valores al arreglo
				valores[i] = arrayList.get(i);
			}
			System.out.println("la resta es" + Operacion.resta(valores));
			break;

		case 3:
			do {
				System.out.println("ingrese los numeros a multiplicar");
				numero = entrada.nextDouble();
				arrayList.add(numero);
				System.out.println("desea agregar otro numero S/N ");
				respuesta = entrada.next().charAt(0);
			} while (respuesta == 's' || respuesta == 'S');

			valores = new Double[arrayList.size()];//tamaño del arreglo 
			for(int i = 0 ; i < valores.length ; i++) {
				valores[i] = arrayList.get(i);
			}
			System.out.println("la multiplicacion" + Operacion.multiplicar(valores));
			break;

		case 4:
			do {
				System.out.println("ingrese los numeros a dividir");
				numero = entrada.nextDouble();
				arrayList.add(numero);
				System.out.println("desea agregar otro numero S/N ");
				respuesta = entrada.next().charAt(0);
			} while (respuesta == 's' || respuesta == 'S');

			valores = new Double[arrayList.size()];//tamaño del arreglo 
			for(int i = 0 ; i < valores.length ; i++) {
				valores[i] = arrayList.get(i);
			}
		//System.out.println("la division" + Operacion.division(valores,valores));
			break;
			
		case 5:
			System.out.println("ingrese el numero que desea sacarle el iva");

			break;

		default:
			System.out.println("error");
			break;

		}

	}

}

