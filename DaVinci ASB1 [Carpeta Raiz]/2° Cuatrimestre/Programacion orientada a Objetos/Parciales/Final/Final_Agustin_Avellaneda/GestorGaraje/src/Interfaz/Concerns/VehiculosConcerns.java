package Interfaz.Concerns;

import Vehiculos.Vehiculo;
import java.util.List;
import java.util.Scanner;
import utilities.ValidadorNumeros;

//clase para llevar las

public class VehiculosConcerns {

    // calculamos valores validos para cantidadDeRuedasTrabajadas y
    // cantidadDeRuedasATrabajar se gun la cantidad de ruedas que tiene el vehiculo
    public static boolean validarRuedasVehiculo(Vehiculo vehiculo, int cantidadDeRuedasTrabajadas,
            int cantidadDeRuedasATrabajar) {

        // se calcula el total de ruedas trabajadas y a trabajar
        int totalRuedas = cantidadDeRuedasTrabajadas + cantidadDeRuedasATrabajar;

        // #1 - No pueden ser valores negativos
        if (cantidadDeRuedasTrabajadas < 0 || cantidadDeRuedasATrabajar < 0) {
            System.out.println("#Error en carga de datos: Los valores de ruedas no pueden ser negativos.");
            return false;
        }

        // #2 - El total de ruedas no puede exceder el límite de un coche
        if (totalRuedas > vehiculo.getCantidadRuedas()) {
            System.out.println(
                    "#Error en carga de datos: El total de ruedas a trabajar/trabajadas no puede exceder "
                            + vehiculo.getCantidadRuedas() + ".");
            return false;
        }

        // #3 - Si todas las ruedas ya fueron trabajadas, no puede haber
        // ruedas a trabajar
        if (cantidadDeRuedasTrabajadas == vehiculo.getCantidadRuedas() && cantidadDeRuedasATrabajar > 0) {
            System.out.println(
                    "#Error en carga de datos: No puede haber ruedas a trabajar si todas ya fueron trabajadas.");
            return false;
        }

        // #4 - No puede haber mas ruedas a trabajar que las restantes
        int ruedasRestantes = vehiculo.getCantidadRuedas() - cantidadDeRuedasTrabajadas;
        if (cantidadDeRuedasATrabajar > ruedasRestantes) {
            System.out.println("#Error en carga de datos: No puede haber mas ruedas a trabajar que las restantes ("
                    + ruedasRestantes + ").");
            return false;
        }

        // Si pasa todas las validaciones, es valido
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

    // busqueda avanzada - se reutiliza este codigo para el update, delete
    public static Vehiculo busquedaAvanzada(List<Vehiculo> vehiculos, Scanner sc) {

        // iniciamos busqueda por patente
        while (true) {
            String patente = sc.nextLine().trim();

            // iteramos hasta encotnrar la patente
            Vehiculo vehiculoEncontrado = null;
            for (Vehiculo v : vehiculos) {
                if (v.getPatente().equalsIgnoreCase(patente)) {
                    vehiculoEncontrado = v;
                    break;
                }
            }

            // Evaluamos si se encuentra el vehiculo o no
            if (vehiculoEncontrado != null) {
                //mostramos el to string en la llamada
                return vehiculoEncontrado;
            } else {
                // No se encontró el vehículo
                System.out
                        .print("No se encuentra un Vehiculo con esa patente. ¿Desea buscar nuevamente? [si | no]\n> ");
                String busquedaNueva = sc.nextLine().trim().toLowerCase();

                if (busquedaNueva.contains("n")) {
                    System.out.println("Volviendo al menú Vehiculo...");
                    return null; // retornamos null si no se desea continuar
                } else {
                    System.out.print("Ingrese otra patente a buscar\n> ");
                }
            }
        }
    }

    // aca evaluamos cuantas ruedas el titular del vehiculo pago, si fue parcial o
    // no y setteamos todo
    public static void cantidadDeRuedasPagas(Vehiculo vehiculo, Scanner sc, Double precioDiario, boolean pagoCliente) {

        while (true && pagoCliente) {
            // mostramos el mensaje segun el estado de las ruedas a trabajar y trabajadas
            String mensajeATrabajar = vehiculo.getCantidadRuedasATrabajar() != 0
                    ? "## Las ruedas a trabajar son: " + vehiculo.getCantidadRuedasATrabajar()
                    : "## El vehículo no tiene ruedas a trabajar.";
            System.out.println(mensajeATrabajar);

            String mensajeTrabajadas = vehiculo.getCantidadRuedasTrabajadas() != 0
                    ? " ## Las ruedas trabajadas son: " + vehiculo.getCantidadRuedasTrabajadas()
                    : "## El vehículo no tiene ruedas trabajadas.";
            System.out.println(mensajeTrabajadas);

            // Obtenemos la cantidad de ruedas que abono el cliente
            System.out.print("Cuantas ruedas abono el cliente?\n> ");
            int ruedasPagas = ValidadorNumeros.validarEntero(sc);

            // Validamos las ruedas pagas
            int totalRuedasPosibles = vehiculo.getCantidadRuedasATrabajar() + vehiculo.getCantidadRuedasTrabajadas();

            if (ruedasPagas < 0) {
                System.out.println(
                        "#Error en carga de datos: La cantidad de ruedas pagas no puede ser un valor negativo.");

            } else if (ruedasPagas > totalRuedasPosibles) {
                System.out.println(
                        "##Error en carga de datos: Las ruedas pagas no pueden exceder el total de ruedas trabajadas/a trabajar ("
                                + totalRuedasPosibles + ").");
            } else {

                // setteamos cantidadRuedasPagas y llamamos al metodo interno para calcular:
                // el monto a cobrar + el monto cobrado
                vehiculo.setCantidadRuedasPagas(ruedasPagas);
                if (ruedasPagas < totalRuedasPosibles) {
                    // pago parcialmente las ruedas, calculamos el monto cobrado y monto a cobrar
                    vehiculo.setFueParcialmenteCobrado(true);
                    vehiculo.setFueTotalmenteCobrado(false);

                    return;

                } else if (ruedasPagas == totalRuedasPosibles) {
                    // pago todas las ruedas a trabajar/trabajadas
                    vehiculo.setFueParcialmenteCobrado(false);
                    vehiculo.setFueTotalmenteCobrado(true);

                    return;

                }

            }

        }
        // si no abono totalmente o parcial
        vehiculo.setFueParcialmenteCobrado(false);
        vehiculo.setFueTotalmenteCobrado(false);

    }

}
