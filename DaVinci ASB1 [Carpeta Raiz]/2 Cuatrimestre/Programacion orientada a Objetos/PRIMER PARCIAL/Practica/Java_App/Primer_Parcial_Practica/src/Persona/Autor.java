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
    // metodos
    @Override
    public void mostrarInformacionAutor(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Fecha nacimiento: " + this.getFecha_nacimiento());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Email: " + this.getEmail());



    };

}
