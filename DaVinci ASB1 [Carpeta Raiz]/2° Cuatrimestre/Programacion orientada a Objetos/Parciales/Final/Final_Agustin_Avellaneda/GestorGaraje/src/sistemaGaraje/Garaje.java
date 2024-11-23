package sistemaGaraje;

import Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private Double precio_cambio_rueda;
    private int capacidad_maxima;
    private int capacidad_actual;
    private List<Vehiculo> vehiculos;

    public Garaje() {
    }

    public Garaje(Double precio_cambio_rueda, int capacidad_maxima, int capacidad_actual) {
        this.precio_cambio_rueda = precio_cambio_rueda;
        this.capacidad_maxima = capacidad_maxima;
        this.capacidad_actual = capacidad_actual;
        // lo populamos en el main
        this.vehiculos = new ArrayList<>();
    }

}
