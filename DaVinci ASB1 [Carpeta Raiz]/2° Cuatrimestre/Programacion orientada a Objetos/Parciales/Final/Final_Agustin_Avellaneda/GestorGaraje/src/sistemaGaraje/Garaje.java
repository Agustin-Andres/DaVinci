package sistemaGaraje;

import Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private Double precio_cambio_rueda;
    private int capacidad_maxima;
    private int capacidad_actual;
    private List<Vehiculo> vehiculos;

    public Garaje(Double precio_cambio_rueda, int capacidad_maxima, int capacidad_actual) {
        this.precio_cambio_rueda = precio_cambio_rueda;
        this.capacidad_maxima = capacidad_maxima;
        this.capacidad_actual = capacidad_actual; //vemos cuanta disponibiliada hay 
        // lo populamos en el main
        this.vehiculos = new ArrayList<>();
    }

    public Double getPrecio_cambio_rueda() {
        return this.precio_cambio_rueda;
    }

    public void setPrecio_cambio_rueda(Double precio_cambio_rueda) {
        this.precio_cambio_rueda = precio_cambio_rueda;
    }

    public int getCapacidad_maxima() {
        return this.capacidad_maxima;
    }

    public void setCapacidad_maxima(int capacidad_maxima) {
        this.capacidad_maxima = capacidad_maxima;
    }

    public int getCapacidad_actual() {
        return this.capacidad_actual;
    }

    public void setCapacidad_actual(int capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }

    public List<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    // cant vehiculos almacenados

    public Garaje() {
    }
}
