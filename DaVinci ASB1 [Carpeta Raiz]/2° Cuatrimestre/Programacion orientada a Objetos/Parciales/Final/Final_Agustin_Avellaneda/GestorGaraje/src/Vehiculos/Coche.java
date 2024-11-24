package Vehiculos;

//clase hija de 
public class Coche extends Vehiculo {

    private int cantidad_puertas;

    public Coche(int cantidadRuedas, Double montoCobrar, Double kilometraje, String patente, String marca,
            int cantidad_puertas) {
        // herencia
        super(cantidadRuedas, montoCobrar, kilometraje, patente,marca);
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
                ", cantidadRuedas=" + this.getCantidadRuedas() +
                ", montoCobrar=" + this.getMontoCobrar() +
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
