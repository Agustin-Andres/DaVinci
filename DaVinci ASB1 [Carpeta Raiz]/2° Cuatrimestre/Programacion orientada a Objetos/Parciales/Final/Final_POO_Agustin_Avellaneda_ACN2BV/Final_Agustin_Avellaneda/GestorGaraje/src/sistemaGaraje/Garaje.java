package sistemaGaraje;

import Vehiculos.Coche;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class Garaje {
    private Double precioCambioRueda;
    private int capacidadMaxima;

    // capacidadActual muestra la diferencia entre la cantidad de vehiculos y la
    // capacidad maxima
    private int capacidadActual;
    private int capacidadDisponible;
    private boolean capacidadAlcanzada;

    private List<Vehiculo> vehiculos;
    private List<Vehiculo> vehiculosRetirados;




    // constructor para opcion por defecto populado por el sistema
    public Garaje(Double precioCambioRueda, int capacidadMaxima, int capacidadActual, int capacidadDisponible) {

        this.precioCambioRueda = precioCambioRueda;
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual; // vemos cuanta disponibiliada hay

        // lo populamos en el main pero la dejamos empty
        this.vehiculos = new ArrayList<>();
        this.vehiculosRetirados = new ArrayList<>();
    }

    // constructor para opcion de nueva sesion por el user
    public Garaje(Double precioCambioRueda, int capacidadMaxima) {

        this.precioCambioRueda = precioCambioRueda;
        this.capacidadMaxima = capacidadMaxima;

        // lo populamos desde la interfaz
        this.vehiculos = new ArrayList<>();
        this.vehiculosRetirados = new ArrayList<>();
    }

    // por defecto, no tiene la capacidad alcanzada
    public Garaje() {
        this.vehiculos = new ArrayList<>();
        this.vehiculosRetirados = new ArrayList<>();
        this.setCapacidadAlcanzada(false);
    }

    public Double getPrecioCambioRueda() {
        return this.precioCambioRueda;
    }

    public void setPrecioCambioRueda(Double precioCambioRueda) {
        this.precioCambioRueda = precioCambioRueda;
    }

    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return this.capacidadActual;
    }

    public int getCapacidadDisponible() {
        return this.capacidadDisponible;
    }

    public void setCapacidadDisponible(int capacidadDisponible) {
        this.capacidadDisponible = capacidadDisponible;
    }

    public boolean isCapacidadAlcanzada() {
        return this.capacidadAlcanzada;
    }

    public void setCapacidadAlcanzada(boolean capacidadAlcanzada) {
        this.capacidadAlcanzada = capacidadAlcanzada;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public List<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Vehiculo> getVehiculosRetirados() {
        return this.vehiculosRetirados;
    }

    public void setVehiculosRetirados(List<Vehiculo> vehiculosRetirados) {
        this.vehiculosRetirados = vehiculosRetirados;
    }

    // toString
    @Override
    public String toString() {
        return "-----------------------------------------------\n" +
                "Informacion de Garaje\n" +
                "\nPrecio del Cambio de rueda:\t$" + this.getPrecioCambioRueda() +
                "\nCapacidad Maxima de garaje:\t" + this.getCapacidadMaxima() +
                "\nCapacidad Actual:   \t" + this.getCapacidadActual() +
                "\nCapacidad Disponible    :\t" + this.getCapacidadDisponible() +
                "\nCapacidad Maxima alcanzada?\t" + this.isCapacidadAlcanzada() +
                "\nVehiculos almacenados: \n " + (vehiculos != null ? this.vehiculos.toString() : "[]");
    }

    // output estetic xd
    public String toStringCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append(  "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        sb.append("                                               Informacion de Garaje                                                                             \n");
        sb.append(  "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        sb.append(String.format("%-30s: $%.2f\n", "Precio del Cambio de rueda", this.getPrecioCambioRueda()));
        sb.append(String.format("%-30s: %d\n", "Capacidad Maxima de garaje", this.getCapacidadMaxima()));
        sb.append(String.format("%-30s: %d\n", "Capacidad Actual", this.getCapacidadActual()));
        sb.append(String.format("%-30s: %d\n", "Capacidad Disponible", this.getCapacidadDisponible()));
        sb.append(String.format("%-30s: %b\n", "Capacidad Maxima alcanzada?", this.isCapacidadAlcanzada()));
        sb.append(  "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        sb.append(hayCapacidadDisponible());
      
        return sb.toString();
    }

    // calculamos la disponibilidad, si capacidad max = capacidad disponible no hay
    // capacidad.
    public void calcularDisponibilidad() {

        this.setCapacidadDisponible(this.getCapacidadMaxima() - this.vehiculos.size());
        this.setCapacidadActual(this.getCapacidadMaxima() - this.getCapacidadDisponible());

        if (this.getCapacidadDisponible() == this.getCapacidadMaxima()) {
            this.setCapacidadAlcanzada(true);
        }

    }

    private String hayCapacidadDisponible() {
        if (this.isCapacidadAlcanzada()) {
            return " >> Capacidad de garaje alcanzada. No se podra ingresar mas vehiculos";
        } else {
            return" >> Se pueden almacenar " + this.getCapacidadDisponible() + " vehiculos";
        }
    }

    public void informacionVehiculos(List<Vehiculo> vehiculos) {

        StringBuilder sb = new StringBuilder();

            if (vehiculos != null && !vehiculos.isEmpty()) {

            // Cabecera
            sb.append(String.format("%-10s %-15s %-10s %-13s %-19s %-19s %-17s %-15s\n",
                    "Tipo", "Marca", "Patente", "Kilometraje", "Ruedas Trabajadas", "Ruedas a Trabajar",
                    "Monto Cobrado", "Monto a Cobrar"));
            sb.append(
                    "-----------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Filas
            for (Vehiculo v : vehiculos) {
                String tipo = v instanceof Coche ? "Coche" : "Moto";
                sb.append(String.format("%-10s %-15s %-12s %-19.2f %-19d %-15d %-15.2f %-15.2f\n",
                        tipo,
                        v.getMarca(),
                        v.getPatente(),
                        v.getKilometraje(),
                        v.getCantidadRuedasTrabajadas(),
                        v.getCantidadRuedasATrabajar(),
                        v.getMontoCobrado(),
                        v.getMontoACobrar()));
            }
        } else {
            sb.append("No hay vehiculos para mostrar.\n");
        }
        sb.append(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

}