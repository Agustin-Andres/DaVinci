package Organizacion;

/*
Decidi hacerlo de esta forma para la escalabilidad del sistema, en el caso de que quieramos agregar otra entidad
se puede hacer gestionar tranquilamente de la clase abstracta.
Por ejemplo, si se contrata un proveedor, podemos escalarlo con la clase Organizacion.
*/

public abstract class Organizacion {

	// variables primitivas abstractas
	private String nombre;
	private String telefono;
	private String direccion;
	private String localidad;
	private String email;
	private String cuit;

	// constructores, uno vacio y completo
	public Organizacion(String nombre, String telefono, String direccion, String localidad, String email, String cuit) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.localidad = localidad;
		this.email = email;
		this.cuit = cuit;

	}

	public Organizacion() {
	};

	// metodos
	public abstract String toString();


	// getters and setters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCuit() {
		return this.cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

}
