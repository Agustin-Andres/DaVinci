package Organizacion;

/*
Decidi hacerlo de esta forma para la escalabilidad del sistema, en el caso de que quieramos agregar otra entidad
se puede hacer gestionar tranquilamente de la clase abstracta.
Por ejemplo, si se contrata un proveedor, podemos escalarlo con la clase Organizacion.
*/

public abstract class Organizacion {

	//variables primitivas abstractas
	private String nombre;
	private int teléfono;
	private String dirección;
	private String localidad;
	private String email;
	private int cuit;


	//constructores, uno vacio y completo
	public Organizacion(String nombre, int teléfono, String dirección, String localidad, String email, int cuit){
		this.nombre = nombre;
		this.teléfono = teléfono;
		this.dirección = dirección;
		this.localidad = localidad;
		this.email = email;
		this.cuit = cuit;

	}

	public Organizacion(){};


	// metodos
	public abstract String toString();

	//getters and setters
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTeléFono() {
		return this.teléfono;
	}

	public void setTeléFono(int teléfono) {
		this.teléfono = teléfono;
	}

	public String getDireccióN() {
		return this.dirección;
	}

	public void setDireccióN(String dirección) {
		this.dirección = dirección;
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

	public int getCuit() {
		return this.cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

}
