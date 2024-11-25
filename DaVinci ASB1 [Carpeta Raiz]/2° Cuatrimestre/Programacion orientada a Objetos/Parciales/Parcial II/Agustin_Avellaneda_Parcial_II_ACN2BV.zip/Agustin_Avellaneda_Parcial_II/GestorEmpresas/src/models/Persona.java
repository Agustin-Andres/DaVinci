package models;

// Clase abstracta Persona
public abstract class Persona {

    // Atributos comunes para todas las personas [heredado a empleados, clientes,
    // directivos]
    private String nombre;
    private int edad;
    private String datosPersonales;

    // Constructor vacio
    public Persona() {
    }

    // Constructor
    public Persona(String nombre, int edad, String datosPersonales) {
        this.nombre = nombre;
        this.edad = edad;
        this.datosPersonales = datosPersonales;
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para los datos personales
    public String getDatosPersonales() {
        return datosPersonales;
    }

    // Setter para los datos personales
    public void setDatosPersonales(String datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    // Método toString para mostrar los datos de la persona - sera remplazado
    @Override
    public abstract String toString();
}
