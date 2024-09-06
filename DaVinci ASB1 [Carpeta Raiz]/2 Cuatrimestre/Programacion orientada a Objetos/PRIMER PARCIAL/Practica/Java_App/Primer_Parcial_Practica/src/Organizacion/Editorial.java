package Organizacion;

// Editorial, clase hija de Organizacion
public class Editorial extends Organizacion {

    // constructores, uno vacio y otro con toda la info
    public Editorial(String nombre, int teléfono, String dirección, String localidad, String email, int cuit) {
        super(nombre, teléfono, dirección, localidad, email, cuit);
    }

    public Editorial() {
        super();
    }

    //metodos
    @Override
    public String toString() {
        return "";
    }
}
