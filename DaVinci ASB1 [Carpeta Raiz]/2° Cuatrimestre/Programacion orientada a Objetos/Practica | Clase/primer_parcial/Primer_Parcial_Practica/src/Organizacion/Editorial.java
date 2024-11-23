package Organizacion;

// Editorial, clase hija de Organizacion
public class Editorial extends Organizacion {

    // constructores, uno vacio y otro con toda la info
    public Editorial(String nombre, String teléfono, String dirección, String localidad, String email, String cuit) {
        super(nombre, teléfono, dirección, localidad, email, cuit);
    }

    public Editorial() {
        super();
    }

    @Override
    public String toString() {
        return "Nombre Editorial: " + this.getNombre() + "\n" +
               "Teléfono: " + this.getTelefono() + "\n" +
               "Dirección: " + this.getDireccion() + "\n" +
               "Localidad: " + this.getLocalidad() + "\n" +
               "Email: " + this.getEmail() + "\n" +
               "CUIT: " + this.getCuit();
    }

}
