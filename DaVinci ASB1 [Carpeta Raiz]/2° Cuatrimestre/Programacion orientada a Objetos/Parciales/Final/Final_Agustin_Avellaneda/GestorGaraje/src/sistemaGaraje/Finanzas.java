package sistemaGaraje;

import Vehiculos.Vehiculo;
import java.util.List;

public class Finanzas {

    private Garaje garaje;

    private Double totalRecaudado;
    private Double totalARecaudar;

    private Double totalRecaudadoVehiculosActuales;
    private Double totalARecuadarVehiculosActuales;

    private Double totalRecaudadoVehiculosRetirados;

    public Finanzas(Garaje garaje) {

        setGaraje(garaje);
        // por defecto todo 0 y hacemos el calculo al instanciar finanzas
        setTotalRecaudado(0.0);
        setTotalARecaudar(0.0);

        setTotalRecaudadoVehiculosActuales(0.0);
        setTotalARecuadarVehiculosActuales(0.0);

        // si se retira que pase por caja
        setTotalRecaudadoVehiculosRetirados(0.0);

        calcularTotalRecaudadoDeGaraje();
        calcularTotalARecaudarDeGaraje();

    }

    public Double getTotalRecaudadoVehiculosActuales() {
        return this.totalRecaudadoVehiculosActuales;
    }

    public void setTotalRecaudadoVehiculosActuales(Double totalRecaudadoVehiculosActuales) {
        this.totalRecaudadoVehiculosActuales = totalRecaudadoVehiculosActuales;
    }

    public Double getTotalARecuadarVehiculosActuales() {
        return this.totalARecuadarVehiculosActuales;
    }

    public void setTotalARecuadarVehiculosActuales(Double totalARecuadarVehiculosActuales) {
        this.totalARecuadarVehiculosActuales = totalARecuadarVehiculosActuales;
    }

    public Double getTotalRecaudadoVehiculosRetirados() {
        return this.totalRecaudadoVehiculosRetirados;
    }

    public void setTotalRecaudadoVehiculosRetirados(Double totalRecaudadoVehiculosRetirados) {
        this.totalRecaudadoVehiculosRetirados = totalRecaudadoVehiculosRetirados;
    }

    public Double getTotalRecaudado() {
        return this.totalRecaudado;
    }

    public void setTotalRecaudado(Double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public Double getTotalARecaudar() {
        return this.totalARecaudar;
    }

    public void setTotalARecaudar(Double totalARecaudar) {
        this.totalARecaudar = totalARecaudar;
    }

    public Garaje getGaraje() {
        return this.garaje;
    }

    public void setGaraje(Garaje garaje) {
        this.garaje = garaje;
    }

    public String toString() {
        return "Resumen Financiero del Garaje:\n" +
                "Total Recaudado: $" + String.format("%.2f", this.totalRecaudado) + "\n" +
                "Total a Recaudar: $" + String.format("%.2f", this.totalARecaudar) + "\n" +
                "Total Recaudado Vehículos Actuales: $" + String.format("%.2f", this.totalRecaudadoVehiculosActuales)
                + "\n" +
                "Total a Recaudar Vehículos Actuales: $" + String.format("%.2f", this.totalARecuadarVehiculosActuales)
                + "\n" +
                "Total Recaudado Vehículos Retirados: $" + String.format("%.2f", this.totalRecaudadoVehiculosRetirados);
    }

    public String resumenFinanciero() {
        StringBuilder sb = new StringBuilder();

        sb.append(
                "*********************************************************************************************************************************************\n");
        sb.append(
                "                                               Resumen Financiero del Garaje                                                                \n");
        sb.append(
                "*********************************************************************************************************************************************\n");
        sb.append(String.format("%-50s: $%.2f\n", "Total Recaudado", this.totalRecaudado));
        sb.append(String.format("%-50s: $%.2f\n\n", "Total a Recaudar", this.totalARecaudar));
        sb.append(String.format("%-50s: $%.2f\n", "Total Recaudado Vehículos Actuales",
                this.totalRecaudadoVehiculosActuales));
        sb.append(String.format("%-50s: $%.2f\n", "Total a Recaudar Vehículos Actuales",
                this.totalARecuadarVehiculosActuales));
        sb.append(String.format("%-50s: $%.2f\n", "Total Recaudado Vehículos Retirados",
                this.totalRecaudadoVehiculosRetirados));
        sb.append(
                "*********************************************************************************************************************************************\n");

        return sb.toString();
    }

    // se calcula el total recaudado del garaje + otros atributos
    public void calcularTotalRecaudadoDeGaraje() {
        double totalRecaudado = 0.0;

        List<Vehiculo> vehiculosActuales = garaje.getVehiculos();
        List<Vehiculo> vehiculosRetirados = garaje.getVehiculosRetirados();

        // iteramos por los vehiculos en el garaje actualmente
        for (Vehiculo v : vehiculosActuales) {
            totalRecaudado += v.getMontoCobrado();
        }
        setTotalRecaudadoVehiculosActuales(totalRecaudado);
        totalRecaudado = 0.0;

        // iteramos por los vehiculos retirados del garaje
        for (Vehiculo v : vehiculosRetirados) {
            totalRecaudado += v.getMontoCobrado();
        }
        setTotalRecaudadoVehiculosRetirados(totalRecaudado);

        setTotalRecaudado(getTotalRecaudadoVehiculosActuales() + getTotalRecaudadoVehiculosRetirados());
    }

    public void calcularTotalARecaudarDeGaraje() {
        double totalARecaudar = 0.0;

        List<Vehiculo> vehiculosActuales = garaje.getVehiculos();
        List<Vehiculo> vehiculosRetirados = garaje.getVehiculosRetirados();

        // iteramos por los vehiculos en el garaje actualmente
        for (Vehiculo v : vehiculosActuales) {
            totalARecaudar += v.getMontoACobrar();
        }
        setTotalARecuadarVehiculosActuales(totalARecaudar);

        // iteramos por los vehiculos retirados del garaje
        for (Vehiculo v : vehiculosRetirados) {
            totalARecaudar +=  v.getMontoACobrar();
        }

        setTotalARecaudar(totalARecaudar);
    }

}
