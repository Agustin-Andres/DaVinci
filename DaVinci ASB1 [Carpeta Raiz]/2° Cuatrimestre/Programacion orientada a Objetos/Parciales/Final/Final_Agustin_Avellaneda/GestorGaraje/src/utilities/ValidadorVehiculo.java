package utilities;

import java.util.List;

import Vehiculos.Vehiculo;

public class ValidadorVehiculo {

    private static final int cantidadRuedasCoche = 4;
    private static final int cantidadRuedasMoto = 2;

    // metodo para validar las ruedas ingresadas, necesitamos datos validos para las
    // ruedas a trabajar y trabajadas
    public static boolean validarRuedasMoto(int cantidadDeRuedasTrabajadas, int cantidadDeRuedasATrabajar) {
        // restriccion #1: No pueden ser valores negativosss
        if (cantidadDeRuedasTrabajadas < 0 || cantidadDeRuedasATrabajar < 0) {
            System.out.println("#Error en carga de datos: Los datos de ruedas no pueden ser negativos.");
            return false;
        }

        // restriccion #2: La suma no puede exceder las 2 ruedas de una moto
        if (cantidadDeRuedasTrabajadas + cantidadDeRuedasATrabajar > cantidadRuedasMoto) {
            System.out.println(
                    "#Error en carga de datos: La suma de ruedas trabajadas y ruedas a trabajar no puede exceder "
                            + cantidadRuedasMoto + ".");
            return false;
        }

        // restriccion #2: Si todas las ruedas ya fueron trabajadas no pueden quedar
        // ruedas para trabajar
        if (cantidadDeRuedasTrabajadas == cantidadRuedasMoto && cantidadDeRuedasATrabajar > 0) {
            System.out.println(
                    "#Error en carga de datos: No puede haber ruedas a trabajar si todas ya fueron trabajadas.");
            return false;
        }

        // Restriccion #4 : coherencia
        if (cantidadDeRuedasTrabajadas == 1 && cantidadDeRuedasATrabajar > 1) {
            System.out.println(
                    "#Error en carga de datos: Solo puede quedar una rueda a trabajar si ya hay una trabajada.");
            return false;
        }

        // Si pasa todas las validaciones, es válido
        return true;
    }

    // valiudador de ruedas de auto
    public static boolean validarRuedasCoche(int cantidadDeRuedasTrabajadas, int cantidadDeRuedasATrabajar) {
        // Restriccion #1 - no pueden ser valores negativos
        if (cantidadDeRuedasTrabajadas < 0 || cantidadDeRuedasATrabajar < 0) {
            System.out.println("#Error en carga de datos: Los valores no pueden ser negativos.");
            return false;
        }

        // restriccion 2 - el total de las ruedas no puede exceder la constante ruedas de coche
        if (cantidadDeRuedasTrabajadas + cantidadDeRuedasATrabajar > cantidadRuedasCoche) {
            System.out.println(
                    "#Error en carga de datos: La suma de ruedas trabajadas y ruedas a trabajar no puede exceder "
                            + cantidadRuedasCoche + ".");
            return false;
        }

        // Restriccion#3 - Si todas las ruedas ya fueron trabajadas, no pueden quedar
        // ruedas por trabajar
        if (cantidadDeRuedasTrabajadas == cantidadRuedasCoche && cantidadDeRuedasATrabajar > 0) {
            System.out.println("#Error en carga de datos: No puede haber ruedas a trabajar si todas ya fueron trabajadas.");
            return false;
        }

        // Restriccion #4 logico
        if (cantidadDeRuedasTrabajadas + cantidadDeRuedasATrabajar != cantidadDeRuedasATrabajar
                && cantidadDeRuedasATrabajar > cantidadDeRuedasATrabajar - cantidadDeRuedasTrabajadas) {
            System.out.println("#Error en carga de datos: No puede haber mas ruedas a trabajar que las restantes.");
            return false;
        }

        // Si pasa todas las validaciones, es válido
        return true;
    }

    // validador de patente porque las patentes no se repiten
    public static boolean validarPatente(List<Vehiculo> vehiculos, String patenteEvaluar) {
        boolean patenteValida = true;
        // iteramos hasta encontrar la patente
        for (Vehiculo v : vehiculos) {
            if (v.getPatente().equalsIgnoreCase(patenteEvaluar)) {
                patenteValida = !patenteValida;
                break;
            }
        }

        return patenteValida;

    }

    // valiudador de ruedas
}
