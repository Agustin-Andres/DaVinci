package Persona;

//clase hija de Persona, es un autor
public class Autor extends Persona {

    //Constructores
    public Autor(String nombre, String apellido, String fecha_nacimiento, String sexo, String email) {
        super(nombre, apellido, fecha_nacimiento, sexo, email);
    }

    public Autor() {
        super();
    }

    // metodos
    @Override
    public String toString(){
        return "";
    };

}
