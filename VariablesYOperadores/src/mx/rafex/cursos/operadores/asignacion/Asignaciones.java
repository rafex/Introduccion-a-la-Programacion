package mx.rafex.cursos.operadores.asignacion;

public class Asignaciones {

    public static void main(String[] args) {

        int a = 10;
        a %= 2;

        System.out.println("Resultado de 10%2 : " + a);

        int b = 4;
        // b = b - 2;
        b -= 2;
        System.out.println("Resultado de 4-2 == b= b - 2: " + b);

        int c = 4;
        // c = c + 10;
        c += 10;
        System.out.println("Resultado de 4 + 10: " + c);
    }

}
