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

    // metodos
    @Override
    public String toString() {
        return "";
    }

    @Override
    public void mostrarInformacionEditorial() {

        System.out.println("Nombre Editorial: " + this.getNombre());
        System.out.println("Teléfono: " + this.getTelefono());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Localidad: " + this.getLocalidad());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CUIT: " + this.getCuit());

    }
}
