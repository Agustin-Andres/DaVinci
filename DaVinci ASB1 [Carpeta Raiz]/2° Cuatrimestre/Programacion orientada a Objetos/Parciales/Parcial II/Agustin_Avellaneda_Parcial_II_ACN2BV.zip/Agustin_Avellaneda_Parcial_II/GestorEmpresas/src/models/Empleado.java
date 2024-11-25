package models;

// La clase Empleado extiende de la clase abstracta Persona

public class Empleado extends Persona {

    // Atributo específico de Empleado
    private double sueldoBruto;

    // Constructor vacio
    public Empleado() {
    }


    public Empleado(String nombre, int edad, String datosPersonales, double sueldoBruto) {
        // Llamamos al constructor de la clase madre
        super(nombre, edad, datosPersonales);
        this.sueldoBruto = sueldoBruto;
    }

    // Getter para el sueldo bruto
    public double getSueldoBruto() {
        return sueldoBruto;
    }

    // Setter para el sueldo bruto
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    // toString
    @Override
    public String toString() {
        return "Empleado{" +
               "nombre='" + getNombre() + '\'' +
               ", edad=" + getEdad() +
               ", datosPersonales='" + getDatosPersonales() + '\'' +
               ", sueldoBruto=" + sueldoBruto +
               '}';
    }
}
