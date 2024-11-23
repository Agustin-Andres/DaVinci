package Persona;

/*
 * A lo mismo que organizacion, para escalabilidad Gestionamos una Persona. De ahi derivamos el hijo autor
 * y en el caso de incorporar un usuario, se escala tranquilamente.
 */
public abstract class Persona {
    // cariables primitivas
    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String sexo;
    private String email;

    // constructores, deje uno sin correo en caso de que la instancia de la clase
    // abstracta no tenga email
    public Persona(String nombre, String apellido, String fecha_nacimiento, String sexo, String email) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.email = email;
    }

    public Persona(String nombre, String apellido, String fecha_nacimiento, String sexo) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.email = null;
    }

    public Persona() {
    }

    // metodos
    public abstract String toString();

    public abstract String nombreCompleto();

    // getters and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public void setFechaNacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
