package Vehiculos;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(int cantidad_ruedas, Double monto_cobrar, Double kilometraje, String patente, String marca,
            int cilindrada) {
        // herencia
        super(cantidad_ruedas, monto_cobrar, kilometraje, patente, marca);
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
                ", cantidad_ruedas=" + this.getCantidad_ruedas() +
                ", monto_cobrar=" + this.getMonto_cobrar() +
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