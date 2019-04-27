package mx.rafex.cursos.introduccion.clases.raul.nuevo;

public class EjercicioPricipal2 {

    public static void main(String[] args) {

        Animal miAnimal; // declaración
        miAnimal = new Animal(); // inicialización

        System.out.println("El nombre de mi animal es: " + miAnimal.nombre);

        // acceso atributo de clase directamente
        miAnimal.edad = 3;
        // acceso a metodo de clase
        miAnimal.setSexo('M');

        System.out.println(miAnimal.getSexo());
        System.out.println(miAnimal.edad);
    }

}
