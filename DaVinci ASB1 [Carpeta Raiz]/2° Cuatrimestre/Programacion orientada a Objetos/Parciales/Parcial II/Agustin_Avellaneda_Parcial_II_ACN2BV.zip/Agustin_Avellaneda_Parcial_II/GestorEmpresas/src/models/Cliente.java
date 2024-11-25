package models;

// La clase Cliente extiende de la clase abstracta Persona

public class Cliente extends Persona {

    private String telefonoContacto;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor parametrizado que inicializa todos los atributos
    public Cliente(String nombre, int edad, String datosPersonales, String telefonoContacto) {
        // Llamamos al constructor de la clase padre (Persona)
        super(nombre, edad, datosPersonales);
        this.telefonoContacto = telefonoContacto;
    }

    // Getter para el teléfono de contacto
    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    // Setter para el teléfono de contacto
    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

   // toString
   @Override
   public String toString() {
       return "Cliente{" +
              "nombre='" + getNombre() + '\'' +
              ", edad=" + getEdad() +
              ", datosPersonales='" + getDatosPersonales() + '\'' +
              ", telefonoContacto='" + telefonoContacto + '\'' +
              '}';
   }
}
