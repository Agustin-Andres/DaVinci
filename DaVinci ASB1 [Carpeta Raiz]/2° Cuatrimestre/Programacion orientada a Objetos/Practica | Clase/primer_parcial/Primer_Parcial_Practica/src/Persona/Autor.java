package Persona;

//clase hija de Persona, es un autor
public class Autor extends Persona {

    // Constructores
    public Autor(String nombre, String apellido, String fecha_nacimiento, String sexo, String email) {
        super(nombre, apellido, fecha_nacimiento, sexo, email);
    }

    public Autor() {
        super();
    }

    // metodos
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\n" +
                "Apellido: " + this.getApellido() + "\n" +
                "Fecha nacimiento: " + this.getFecha_nacimiento() + "\n" +
                "Sexo: " + this.getSexo() + "\n" +
                "Email: " + this.getEmail();
    }

    @Override
    public String nombreCompleto(){
        return this.getNombre() + " " + this.getApellido();
    }

}
