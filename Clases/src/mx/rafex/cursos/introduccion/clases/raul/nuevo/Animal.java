package mx.rafex.cursos.introduccion.clases.raul.nuevo;

public class Animal {

    String nombre;
    Integer edad;
    private Character sexo; // <<< MIRENME!!!

    public Character getSexo() {
        return sexo;
    }

//    // miAnimal.setSexo('M');
//    public void setSexo(Character s) {
//        // sexo = 'M';
//        sexo = s;
//    }
    // miAnimal.setSexo('M');
    public void setSexo(Character sexo) {
        // sexo = 'M';
        this.sexo = sexo;
    }
}
