package Vehiculos;

//clase hija de 
public class Coche extends Vehiculo {

    private int cantidad_puertas;

    public Coche(int cantidad_ruedas, Double monto_cobrar, Double kilometraje, String patente, String marca,
            int cantidad_puertas) {
        // herencia
        super(cantidad_ruedas, monto_cobrar, kilometraje, patente,marca);
        this.cantidad_puertas = cantidad_puertas;
    }

    // constructor vacio
    public Coche() {

    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + this.getMarca() + '\'' +
                ", cantidad_puertas=" + this.cantidad_puertas +
                ", cantidad_ruedas=" + this.getCantidad_ruedas() +
                ", monto_cobrar=" + this.getMonto_cobrar() +
                ", kilometraje=" + this.getKilometraje() +
                ", patente='" + this.getPatente() + '\'' +
                '}';
    }
    


    public int getCantidad_puertas() {
        return this.cantidad_puertas;
    }

    public void setCantidad_puertas(int cantidad_puertas) {
        this.cantidad_puertas = cantidad_puertas;
    }

}
