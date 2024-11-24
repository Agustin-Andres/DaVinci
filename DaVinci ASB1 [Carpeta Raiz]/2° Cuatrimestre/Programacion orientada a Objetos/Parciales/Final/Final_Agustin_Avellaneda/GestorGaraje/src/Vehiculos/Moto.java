package Vehiculos;

public class Moto extends Vehiculo {

    private static final int cantidadRuedasMoto = 2;
    private int cilindrada;

    public Moto(int cantidadRuedasTrabajadas, Double montoCobrar, Double kilometraje,
            String patente, String marca,
            int cilindrada) {
        // herencia
        super(cantidadRuedasMoto, cantidadRuedasTrabajadas, montoCobrar, kilometraje, patente, marca);
        this.cilindrada = cilindrada;
    }

    // constructor vacio
    public Moto() {

    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    @Override
    public String toString() {
        return "Moto {" +
               "\n   Marca                : " + this.getMarca() +
               "\n   Patente              : " + this.getPatente() +
               "\n   Kilometraje          : " + String.format("%.2f", this.getKilometraje()) +
               "\n   Monto a Cobrar       : $" + String.format("%.2f", this.getMontoCobrar()) +
               "\n   Cantidad de Ruedas   : " + this.getCantidadRuedas() +
               "\n   Ruedas Trabajadas    : " + this.getCantidadRuedasTrabajadas() +
               "\n   Cilindrada           : " + this.getCilindrada() + " cc" +
               "\n}";
    }
  
}