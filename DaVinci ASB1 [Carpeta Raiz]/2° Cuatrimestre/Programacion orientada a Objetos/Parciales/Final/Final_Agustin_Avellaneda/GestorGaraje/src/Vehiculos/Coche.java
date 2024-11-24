package Vehiculos;

//clase hija de vehiculo
public class Coche extends Vehiculo {

    // constante estableciendo que cada coche tiene 4 ruedas a trabajar
    private static final int cantidadRuedasCoche = 4;
    private int cantidadPuertas;

    // por defecto todo coche tiene 4 ruedas, lo podemos pasar como constante
    public Coche(int cantidadRuedasTrabajadas, Double montoCobrar, Double kilometraje, String patente, String marca,
            int cantidadPuertas) {

        // pasamos la cantidad de ruedas
        super(cantidadRuedasCoche, cantidadRuedasTrabajadas, montoCobrar, kilometraje, patente, marca);
        this.cantidadPuertas = cantidadPuertas;
    }

    // constructor estableciendo el valor defecto por cantidad de ruedas
    public Coche() {
        this.setCantidadRuedas(cantidadRuedasCoche);
    }

    public int getCantidadPuertas() {
        return this.cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Coche {" +
                "\n   Marca                : " + this.getMarca() +
                "\n   Patente              : " + this.getPatente() +
                "\n   Kilometraje          : " + String.format("%.2f", this.getKilometraje()) +
                "\n   Monto a Cobrar       : $" + String.format("%.2f", this.getMontoCobrar()) +
                "\n   Cantidad de Ruedas   : " + this.getCantidadRuedas() +
                "\n   Ruedas Trabajadas    : " + this.getCantidadRuedasTrabajadas() +
                "\n   Cantidad de Puertas  : " + this.getCantidadPuertas() +
                "\n}";
    }

}
