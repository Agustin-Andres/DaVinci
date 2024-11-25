package models;

// La clase Directivo extiende de Empleado, agregando una categoría

public class Directivo extends Empleado {

    private String categoria;

    // Constructor vacio
    public Directivo() {
    }

    // Constructor
    public Directivo(String nombre, int edad, String datosPersonales, double sueldoBruto, String categoria) {
        super(nombre, edad, datosPersonales, sueldoBruto);
        this.categoria = categoria;
    }

    // Getter para la categoría
    public String getCategoria() {
        return categoria;
    }

    // Setter para la categoría
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // toString
    @Override
    public String toString() {
        return "Directivo{" +
               "nombre='" + getNombre() + '\'' +
               ", edad=" + getEdad() +
               ", datosPersonales='" + getDatosPersonales() + '\'' +
               ", sueldoBruto=" + getSueldoBruto() +
               ", categoria='" + categoria + '\'' +
               '}';
    }
}
