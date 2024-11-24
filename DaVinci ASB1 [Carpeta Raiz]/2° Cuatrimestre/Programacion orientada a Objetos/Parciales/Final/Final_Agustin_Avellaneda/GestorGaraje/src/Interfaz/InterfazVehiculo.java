package Interfaz;

import java.util.List;
import java.util.Scanner;

import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import utilities.ValidadorNumeros;

public class InterfazVehiculo {

    // llega la lista de vehiculos para manipular aca, tenemos scanner y booleano en
    // caso de que se alcanzo la capacidad maxima de almacenamiento
    public static List<Vehiculo> gestionVehiculos(List<Vehiculo> vehiculos, Scanner sc, boolean isCapacidadAlcanzada,
            int capacidadDisponible) {

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
                    // Listar todos los vehiculos
                    listarCoches(vehiculos);
                    break;
                case 3:
                    // Listar todos los vehiculos
                    listarMotos(vehiculos);
                    break;
                case 4:
                    // Listar todos los vehiculos
                    Vehiculo vehiculoBuscado = busquedaAvanzada(vehiculos, sc);
                    break;

                case 8:
                    System.out.println("Volviendo a Gestion de Garaje");
                    break;

                default:
                    System.out.println("Por Favor ingrese una opcion correcta");
            }

        }

        return vehiculos;
    }

    // menu donde hacemos el CRUD de un vehiculo
    private static void mostrarMenuVehiculos() {

        System.out.println("*******************************************");
        System.out.println("               Menu Vehiculos              ");
        System.out.println("*******************************************");
        System.out.printf("%-5s %-50s\n", "ID", "Descripción");
        System.out.println("-------------------------------------------");
        System.out.printf("%-5s %-50s\n", "#1", "Listar todos los vehiculos");
        System.out.printf("%-5s %-50s\n", "#2", "Listar todos los coches");
        System.out.printf("%-5s %-50s\n", "#3", "Listar todas las motos");
        System.out.printf("%-5s %-50s\n", "#4", "Busqueda avanzada");
        System.out.printf("%-5s %-50s\n", "#5", "Ingresar un vehiculo");
        System.out.printf("%-5s %-50s\n", "#6", "Actualizar estado de un vehiculo");
        System.out.printf("%-5s %-50s\n", "#7", "Retirar un vehiculo");
        System.out.printf("%-5s %-50s\n", "#8", "Vover a menu principal");
        System.out.println("-------------------------------------------");
        System.out.print("[#]> ");

    }

    // READDDD
    // Listado de todos los vehiculos - es generico, detalla atributos de clase
    // Vehiculo nomas
    private static void listarVehiculos(List<Vehiculo> vehiculos) {

        StringBuilder sb = new StringBuilder();

        if (vehiculos != null && !vehiculos.isEmpty()) {
            System.out.println("*****************************************************************************");
            System.out.println("                          Vehiculos en Garaje                            ");
            System.out.println("*****************************************************************************");

            // Cabecera
            sb.append(String.format("%-10s %-15s %-15s %-15s %-15s\n",
                    "Tipo", "Marca", "Patente", "Kilometraje", "Ruedas Trabajadas"));
            sb.append("----------------------------------------------------------------------------------\n");

            // filas
            for (Vehiculo v : vehiculos) {
                String tipo = v instanceof Coche ? "Coche" : "Moto";
                sb.append(String.format("%-10s %-15s %-15s %-22.2f %-10d\n",
                        tipo, v.getMarca(), v.getPatente(), v.getKilometraje(), v.getCantidadRuedasTrabajadas()));
            }
        } else {
            sb.append("No hay vehículos almacenados.\n");
        }
        sb.append("----------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    // Listado de coches - agrega la cantidad de puertas
    private static void listarCoches(List<Vehiculo> vehiculos) {
        System.out.println("*****************************************************************************");
        System.out.println("                              Coches en Garaje                               ");
        System.out.println("*****************************************************************************");
        StringBuilder sb = new StringBuilder();

        if (vehiculos != null && !vehiculos.isEmpty()) {
            // Cabecera
            sb.append(String.format("%-10s %-10s %-15s %-10s %-22s %-10s\n",
                    "Marca", "Patente", "Kilometraje", "Monto", "Ruedas Trabajadas", "Puertas"));
            sb.append("----------------------------------------------------------------------------------\n");

            // gilas
            for (Vehiculo v : vehiculos) {
                if (v instanceof Coche) {
                    Coche coche = (Coche) v;
                    sb.append(String.format("%-10s %-10s %-15s %-19.2f %-15d %-10d\n",
                            coche.getMarca(), coche.getPatente(), coche.getKilometraje(),
                            coche.getMontoCobrar(), coche.getCantidadRuedasTrabajadas(), coche.getCantidadPuertas()));
                }
            }
        } else {
            sb.append("No hay coches almacenados.\n");
        }
        sb.append("----------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    // Listado de motos - agrega la cilindrada
    private static void listarMotos(List<Vehiculo> vehiculos) {

        StringBuilder sb = new StringBuilder();

        if (vehiculos != null && !vehiculos.isEmpty()) {
            System.out.println("*****************************************************************************");
            System.out.println("                         Motos en Garaje                                     ");
            System.out.println("*****************************************************************************");
            // Cabecera de la tabla
            sb.append(String.format("%-10s %-10s %-15s %-10s %-22s %-10s\n",
                    "Marca", "Patente", "Kilometraje", "Monto", "Ruedas Trabajadas", "Cilindrada"));
            sb.append("----------------------------------------------------------------------------------\n");
            System.out.println(sb.toString());

            // Filas de la tabla
            for (Vehiculo v : vehiculos) {
                if (v instanceof Moto) {
                    Moto moto = (Moto) v;
                    sb.append(String.format("%-10s %-10s %-15s %-19.2f %-15d %-10d\n",
                            moto.getMarca(), moto.getPatente(), moto.getKilometraje(),
                            moto.getMontoCobrar(), moto.getCantidadRuedasTrabajadas(), moto.getCilindrada()));
                }
            }
        } else {
            sb.append("No hay motos almacenadas.\n");
        }
        sb.append("----------------------------------------------------------------------------------\n");
        System.out.println(sb.toString());
    }

    // busqueda avanzada - se reutiliza este codigo para el update, delete
    private static Vehiculo busquedaAvanzada(List<Vehiculo> vehiculos, Scanner sc) {
        System.out.println("> La búsqueda avanzada es por PATENTE. Ingrese la patente del vehículo a buscar\n> ");

        while (true) { // Ciclo hasta que el usuario decida salir
            String patente = sc.nextLine().trim();

            // Buscar vehículo por patente
            Vehiculo vehiculoEncontrado = null;
            for (Vehiculo v : vehiculos) {
                if (v.getPatente().equalsIgnoreCase(patente)) {
                    vehiculoEncontrado = v;
                    break;
                }
            }

            // Si se encuentra el vehiculo
            if (vehiculoEncontrado != null) {
                System.out.println("Vehiculo encontrado:");

                if (vehiculoEncontrado instanceof Coche cocheEncontrado) {
                    System.out.println(cocheEncontrado);
                    return cocheEncontrado;
                } else if (vehiculoEncontrado instanceof Moto motoEncontrada) {
                    System.out.println(motoEncontrada);
                    return motoEncontrada;
                }

            } else {
                // no se encontro el vehiculo
                System.out.println("No se encuentra un Vehículo con esa patente. ¿Desea buscar nuevamente? [si | no]");
                String busquedaNueva = sc.nextLine().trim().toLowerCase();

                if (busquedaNueva.contains("n")) {
                    System.out.println("Volviendo al menú Vehículo...");
                    break;
                } else {
                    System.out.print("Ingrese otra patente a buscar\n> ");
                }
            }
        }
    }

}
