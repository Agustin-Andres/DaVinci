package Vehiculos;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(int cantidadRuedas, Double montoCobrar, Double kilometraje, String patente, String marca,
            int cilindrada) {
        // herencia
        super(cantidadRuedas, montoCobrar, kilometraje, patente, marca);
        this.cilindrada = cilindrada;
    }

    // constructor vacio
    public Moto() {

    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca=' " + this.getMarca() + '\'' +
                ", cantidad_puertas=" + this.getCilindrada() +
                ", cantidadRuedas=" + this.getCantidadRuedas() +
                ", montoCobrar=" + this.getMontoCobrar() +
                ", kilometraje=" + this.getKilometraje() +
                ", patente='" + this.getPatente() + '\'' +
                '}';
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}