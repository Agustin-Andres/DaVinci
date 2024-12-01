package Interfaz;

import Interfaz.Concerns.*;
import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utilities.*;

public class InterfazVehiculo {

    // llega la lista de vehiculos para manipular aca, tenemos scanner y booleano en
    // caso de que se alcanzo la capacidad maxima de almacenamiento, y el precio
    // para setear el precio de cada vehiculo creado
    public static List<Vehiculo> gestionVehiculos(List<Vehiculo> vehiculos, Scanner sc,
            int capacidadMaxima, Double precioDiario) {

        List<Vehiculo> vehiculosRetirados = new ArrayList<>();
        // mostramos el menu para que el user seleccione la opcion de manipulacion
        boolean flag = true;
        int opcionUser;
        while (flag) {
            mostrarMenuVehiculos();
            opcionUser = ValidadorNumeros.validarEntero(sc);

            // switch para menu
            switch (opcionUser) {
                case 1:
                    // Listar todos los vehiculos
                    listarVehiculos(vehiculos);
                    break;

                case 2:
                    // Listar todos los Coches
                    listarCoches(vehiculos);
                    break;

                case 3:
                    // Listar todos las Motos
                    listarMotos(vehiculos);
                    break;

                case 4:
                    if (vehiculos == null || vehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehiculos en el almacen para realizar la busqueda avanzada");
                    } else {
                        System.out.print(
                                "> La búsqueda avanzada es por PATENTE. Ingrese la patente del vehiculo a buscar\n> ");
                        // Busqueda avanzada por patente READ
                        Vehiculo vehiculoBuscado = VehiculosConcerns.busquedaAvanzada(vehiculos, sc);

                        // mostramos el toString dependiendo de que es
                        if (vehiculoBuscado instanceof Coche cocheEncontrado) {
                            System.out.println("Es un Coche: " + cocheEncontrado.getMarca());
                            System.out.println((Coche) vehiculoBuscado);

                        } else if (vehiculoBuscado instanceof Moto motoEncontrada) {
                            System.out.println("Es una Moto: " + motoEncontrada.getMarca());
                            System.out.println((Moto) vehiculoBuscado);
                        }
                    }
                    break;

                case 5:
                    // si es la apertura, entra derecho
                    if (vehiculos == null || vehiculos.isEmpty()) {
                        ingresoVehiculo(vehiculos, sc, capacidadMaxima,
                                precioDiario);
                        break;
                    } else { // Ingreso de un vehiculo
                        // validamos que haya espacio para almacenar un vehiculo mas
                        if (!ValidadorVehiculo.validarDisponibilidadCapacidad(vehiculos.size(), capacidadMaxima)) {
                            ingresoVehiculo(vehiculos, sc, capacidadMaxima,
                                    precioDiario);
                            break;
                        } else {
                            System.out.println("Ya se ha alcanzado la capacidad maxima");
                        }
                    }

                    break;

                case 6:
                    if (vehiculos == null || vehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehiculos almacenados para actualizar");
                    } else {
                        System.out.print("> Ingrese la patente del vehiculo a actualizar\n> ");
                        // actualizacion de un vehiculo UPDATE - llamamos metodo privado que llama al
                        // concern de cada vehiculo correspondiente
                        Vehiculo vehiculoAcutalizar = VehiculosConcerns.busquedaAvanzada(vehiculos, sc);
                        actualizarVehiculo(vehiculos, vehiculoAcutalizar, sc, precioDiario);
                    }
                    break;

                case 7:
                    // Delete de vehiculo siempre y cuando exista un vehiculo
                    if (vehiculos == null || vehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehículos para retirar");
                    } else {
                        System.out.print("> Ingrese la patente del vehículo a dar de baja\n> ");
                        Vehiculo vehiculoRetirar = VehiculosConcerns.busquedaAvanzada(vehiculos, sc);
                        
                        //validamos que exista algun vehiculo a retirar
                        if (vehiculoRetirar != null) {
                            retirarVehiculo(vehiculos, vehiculoRetirar, sc, vehiculosRetirados);
                        }

                    }

                    break;

                case 8:
                    System.out.println("Volviendo a Gestion de Garaje");
                    flag = !flag;
                    break;

                default:
                    System.out.println("Por Favor ingrese una opcion correcta");
            }

        }

        return vehiculosRetirados;
    }

    // menu donde hacemos el CRUD de un vehiculo
    private static void mostrarMenuVehiculos() {

        System.out.println(
                "*********************************************************************************************************************************************");
        System.out.println("                                               Menu Vehiculos              ");
        System.out.println(
                "*********************************************************************************************************************************************");
        System.out.printf("%-5s %-50s\n", "ID", "Descripcion");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-50s\n", "#1", "Listar todos los vehiculos");
        System.out.printf("%-5s %-50s\n", "#2", "Listar todos los coches");
        System.out.printf("%-5s %-50s\n", "#3", "Listar todas las motos");
        System.out.printf("%-5s %-50s\n", "#4", "Busqueda avanzada");
        System.out.printf("%-5s %-50s\n", "#5", "Ingresar un vehiculo");
        System.out.printf("%-5s %-50s\n", "#6", "Actualizar estado de un vehiculo");
        System.out.printf("%-5s %-50s\n", "#7", "Retirar un vehiculo");
        System.out.printf("%-5s %-50s\n", "#8", "Vover a menu principal");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("[Opcion #]> ");

    }

    // READDDD
    // Listado de todos los vehiculos - es generico, detalla atributos de clase
    // Vehiculo nomas
    private static void listarVehiculos(List<Vehiculo> vehiculos) {

        StringBuilder sb = new StringBuilder();

        System.out.println(
                "*********************************************************************************************************************************************");
        System.out.println(
                "                                               Vehículos en Garaje                                                   ");
        System.out.println(
                "*********************************************************************************************************************************************");
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
            sb.append("No hay vehiculos almacenados.\n");
        }
        sb.append(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    // Listado de coches - agrega la cantidad de puertas
    private static void listarCoches(List<Vehiculo> vehiculos) {
        System.out.println(
                "***********************************************************************************************************************************");
        System.out.println(
                "                                               Coches en Garaje                                                             ");
        System.out.println(
                "***********************************************************************************************************************************");
        StringBuilder sb = new StringBuilder();

        if (vehiculos != null && !vehiculos.isEmpty()) {
            // Cabecera
            sb.append(String.format("%-15s %-10s %-10s %-15s %-20s %-20s %-15s %-15s\n",
                    "Marca", "Patente", "Puertas", "Kilometraje", "Ruedas Trabajadas",
                    "Ruedas a Trabajar", "Monto Cobrado", "Monto a Cobrar"));
            sb.append(
                    "-----------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Filas
            for (Vehiculo v : vehiculos) {
                if (v instanceof Coche) {
                    Coche coche = (Coche) v;
                    sb.append(String.format("%-15s %-12s %-8d %-21.2f %-21d %-15d %-15.2f %-15.2f\n",
                            coche.getMarca(),
                            coche.getPatente(),
                            coche.getCantidadPuertas(),
                            coche.getKilometraje(),
                            coche.getCantidadRuedasTrabajadas(),
                            coche.getCantidadRuedasATrabajar(),
                            coche.getMontoCobrado(),
                            coche.getMontoACobrar()));
                }
            }
        } else {
            sb.append("No hay coches almacenados.\n");
        }
        sb.append(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    // Listado de motos - agrega la cilindrada
    private static void listarMotos(List<Vehiculo> vehiculos) {

        System.out.println(
                "*********************************************************************************************************************************************");
        System.out.println(
                "                                               Motos en Garaje                                                                         ");
        System.out.println(
                "*********************************************************************************************************************************************");
        StringBuilder sb = new StringBuilder();

        if (vehiculos != null && !vehiculos.isEmpty()) {

            // Cabecera de la tabla
            sb.append(String.format("%-17s %-10s %-12s %-13s %-20s %-20s %-17s %-15s\n",
                    "Marca", "Patente", "Cilindrada", "Kilometraje", "Ruedas Trabajadas",
                    "Ruedas a Trabajar", "Monto Cobrado", "Monto a Cobrar"));
            sb.append(
                    "-----------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Filas de la tabla
            for (Vehiculo v : vehiculos) {
                if (v instanceof Moto) {
                    Moto moto = (Moto) v;
                    sb.append(String.format("%-17s %-13s %-11d %-19.2f %-20d %-16d %-17.2f %-15.2f\n",
                            moto.getMarca(),
                            moto.getPatente(),
                            moto.getCilindrada(),
                            moto.getKilometraje(),
                            moto.getCantidadRuedasTrabajadas(),
                            moto.getCantidadRuedasATrabajar(),
                            moto.getMontoCobrado(),
                            moto.getMontoACobrar()));
                }
            }
        } else {
            sb.append("No hay motos almacenadas.\n");
        }
        sb.append(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    // createeeeee
    // para creacion de objeto vehiculo / sea moto o coche --- llama metodos
    private static void ingresoVehiculo(List<Vehiculo> vehiculos, Scanner sc,
            int capacidadMaxima, Double precioDiario) {

        // bucle para evaluar el tipo de ingreso de vehiculo
        while (true) {
            // evaluamos primero si la capacidad esta alcanzada, retornamos el listado en
            // caso que si.

            if (ValidadorVehiculo.validarDisponibilidadCapacidad(vehiculos.size(), capacidadMaxima)) {
                System.out.println(">>> Capacidad alcanzada, no es posible ingresar un vehiculo");
                return;
            }

            System.out.print("Desea ingresar un coche o una moto? [Coche | Moto | Volver]\n> ");
            String vehiculoAIngresar = sc.nextLine().toLowerCase();

            // ingresamos un vehiculo a criterio del user
            if (vehiculoAIngresar.contains("m")) {

                // agregamos la moto y descontamos de la disponibilidad [migrado a concerns de
                // moto]
                vehiculos.add(MotoConcerns.ingresoMoto(vehiculos, precioDiario, sc));
                return;

            } else if (vehiculoAIngresar.contains("c")) {

                // [migrado a concerns de coche]
                vehiculos.add(CocheConcerns.ingresoCoche(vehiculos, precioDiario, sc));
                return;

            } else if (vehiculoAIngresar.substring(0, 1).contains("v")) {

                System.out.println("Ingreso de vehiculo cancelado, volviendo a menu vehiculo");
                return;

            } else {
                System.out.println(">> Por favor ingrese una opcion valida.\n");
            }

        }

    }

    // updateee - NO se actualiza todo...
    private static void actualizarVehiculo(List<Vehiculo> vehiculos, Vehiculo vehiculo, Scanner sc,
            Double precioDiario) {

        // evaluamos que tipo de vehiculo es y vamos al concern del vehiculo
        if (vehiculo instanceof Coche coche) {

            CocheConcerns.actualizarCoche(vehiculos, coche, precioDiario, sc);

        } else if (vehiculo instanceof Moto moto) {

            MotoConcerns.actualizarMoto(vehiculos, moto, precioDiario, sc);

        }

    }

    private static void retirarVehiculo(List<Vehiculo> vehiculos, Vehiculo vehiculo, Scanner sc,
            List<Vehiculo> vehiculosRetirados) {
        System.out.println("-------------------------------------------");

        // solicitamos confirmacion
        System.out.println("Datos del vehiculo a retirar:\n" + vehiculo);

        System.out.print("\nEsta seguro que quiere retirar el vehiculo [ si | no ] ["
                + vehiculo.getPatente() + "] ?\n>");
        boolean confirmarRetiro = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

        if (confirmarRetiro) {

            // ya confirmado, actualizamos el monto cobrado del vehiculo y agregamos a la
            // lista de vehiculos retirados
            VehiculosConcerns.retiroDeVehiculo(vehiculo);

            vehiculosRetirados.add(vehiculo);

            // Intentamos eliminar directamente
            if (vehiculos.remove(vehiculo)) {
                System.out.println("El vehiculo fue retirado exitosamente.");
            } else {
                System.out.println("#ERROR: no se encontro el vehiculo");
            }
        } else {
            System.out.println("El retiro del vehiculo fue cancelado.");
        }

        System.out.println("-------------------------------------------");
    }

}
