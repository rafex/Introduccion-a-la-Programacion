package mx.rafex.cursos.introduccion.clases.raul;

public class EjercicioPrincipal {

    public static void main(String[] args) {

        final Automovil auto = new Automovil();

        auto.setColor("rojo");
        auto.setEncendido(false);
        auto.setMarcas("BMW");
        auto.setPuertas(2);

        System.out.println("Mi auto es del color:");
        System.out.println(auto.getColor());

        System.out.println("Mi auto es del marca:");
        System.out.println(auto.getMarca());

        System.out.println("Las puertas de mi auto son:");
        System.out.println(auto.getPuertas());

        if (auto.getEncendido() == true)
            System.out.println("Mi auto ya se fue");
        else
            System.out.println("Ahi sigue dónde lo deje");

    }

}
