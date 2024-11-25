package Interfaz;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.Utilities;

import Interfaz.Concerns.VehiculosConcerns;
import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import utilities.*;

public class InterfazVehiculo {

    // llega la lista de vehiculos para manipular aca, tenemos scanner y booleano en
    // caso de que se alcanzo la capacidad maxima de almacenamiento, y el precio
    // para setear el precio de cada vehiculo creado
    public static List<Vehiculo> gestionVehiculos(List<Vehiculo> vehiculos, Scanner sc, boolean isCapacidadAlcanzada,
            int capacidadDisponible, Double precioDiario) {

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
                    Vehiculo vehiculoBuscado = VehiculosConcerns.busquedaAvanzada(vehiculos, sc);

                    // mostramos el toString dependiendo de que es
                    if (vehiculoBuscado instanceof Coche) {
                        Coche cocheEncontrado = (Coche) vehiculoBuscado;
                        System.out.println("Es un Coche: " + cocheEncontrado.getMarca());

                    } else if (vehiculoBuscado instanceof Moto) {
                        Moto motoEncontrada = (Moto) vehiculoBuscado;
                        System.out.println("Es una Moto: " + motoEncontrada.getMarca());
                    }
                    break;

                case 5:

                    // validamos que haya espacio para almacenar un vehiculo mas
                    if (capacidadDisponible != 0) {
                        vehiculos = ingresoVehiculo(vehiculos, sc, isCapacidadAlcanzada, capacidadDisponible,
                                precioDiario);
                        capacidadDisponible--; // restamos aca porque en metodo es local.
                    } else {
                        System.out.println("Ya se ha alcanzado la capacidad maxima");
                    }
                    break;

                case 6:
                    // actualizacion de
                    break;
                case 8:
                    System.out.println("Volviendo a Gestion de Garaje");
                    flag = !flag;

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

    // createeeeee
    // para creacion de objeto vehiculo / sea moto o coche --- llama metodos
    private static List<Vehiculo> ingresoVehiculo(List<Vehiculo> vehiculos, Scanner sc, boolean isCapacidadAlcanzada,
            int capacidadDisponible, Double precioDiario) {

        // bucle para evaluar el tipo de ingreso de vehiculo
        while (true) {
            // evaluamos primero si la capacidad esta alcanzada, retornamos el listado en
            // caso que si.

            if (capacidadDisponible == 0) {
                System.out.println(">>>Capacidad alcanzada, no es posible ingresar un vehiculo");
                return vehiculos;
            }

            boolean seIngresounVehiculo = false;
            System.out.print("Desea ingresar un coche o una moto? [Coche | Moto | Volver]\n> ");
            String vehiculoAIngresar = sc.nextLine().toLowerCase();

            // ingresamos un vehiculo a criterio del user
            if (vehiculoAIngresar.contains("m")) {

                // agregamos la moto y descontamos de la disponibilidad
                vehiculos.add(ingresoMoto(vehiculos, precioDiario, sc));
                capacidadDisponible = capacidadDisponible - 1;
                seIngresounVehiculo = !seIngresounVehiculo;

            } else if (vehiculoAIngresar.contains("c")) {

                vehiculos.add(ingresoCoche(vehiculos, precioDiario, sc));
                capacidadDisponible--;
                seIngresounVehiculo = !seIngresounVehiculo;

            } else if (vehiculoAIngresar.substring(0, 1).contains("v")) {

                System.out.println("Ingreso de vehiculo cancelado, volviendo a menu vehiculo");
                break;

            } else {
                System.out.println(">> Por favor ingrese una opcion valida.\n");
            }

        }

        return vehiculos;
    }

    // metodo de ingreso moto para ingreso de vehiculo
    private static Moto ingresoMoto(List<Vehiculo> vehiculos, Double precioDiario, Scanner sc) {

        System.out.println("\n-- Iniciando Gestion de ingreso de una Moto --");
        Moto motoAIngresar = null;

        // obtenemos los datos hasta que todos sean validos
        while (true) {

            System.out.print("\nIngrese las ruedas a trabajar \n> ");
            int cantidadDeRuedasATrabajar = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la cantidad de ruedas trabajadas \n> ");
            int cantidadDeRuedasTrabajadas = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la marca de la moto \n> ");
            String marca = sc.nextLine().trim();

            System.out.print("\nIngrese la patente de la moto \n> ");
            String patente = sc.nextLine().trim();

            System.out.print("\nIngrese el kilometraje de la moto \n> ");
            Double kilometraje = ValidadorNumeros.validarFloat(sc);

            System.out.print("\nIngrese el cilindraje de la moto \n> ");
            int cilindrada = ValidadorNumeros.validarEntero(sc);

            System.out.println("El titular ya abono de forma anticipada?");
            boolean fueCobrado = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

            // Validacionnes
            // validamos algunas restricciones logicas de ruedas
            if (!ValidadorVehiculo.validarRuedasMoto(cantidadDeRuedasTrabajadas, cantidadDeRuedasATrabajar)) {
                // dejamos vacio porque los mensajes estan en validacioRuedasMoto dentro de
                // concerns.
            } else if (kilometraje < 0) {
                System.out.println("#Error en carga de datos: El kilometraje no puede ser un numero negativo");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (cilindrada < 0) {
                System.out.println("#Error en carga de datos: El Cilindraje no puede ser un numero negativo");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (!VehiculosConcerns.validarPatente(vehiculos, patente) || patente == null || patente.equals("")) {
                System.out.println("#Error en carga de datos: La patente es invalida.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (marca == null || marca.equals("")) {
                System.out.println("#Error en carga de datos: La marca no puede estar vacia.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else {

                // creamos la instancia con los datos validos
                motoAIngresar = new Moto(cantidadDeRuedasATrabajar, cantidadDeRuedasTrabajadas, kilometraje, patente,
                        marca, cilindrada, cilindrada, fueCobrado);

                System.out.println("Los datos de la moto son:");
                System.out.println(motoAIngresar);

                // solicitamos confirmacion
                System.out.print("\n> Confirma el ingreso de la moto? [ si | no ]\n> ");

                if (ValidadorVehiculo.validadorBooleanoConfirmacion(sc)) {
                    System.out.println("Moto almacenada exitosamente");
                    break;
                } else {
                    System.out.println("Reiniciando carga de datos de moto..\n");
                }
            }

        }
        return motoAIngresar;

    };

    // metodo de ingreso de coche para ingreso de vehiculo
    private static Coche ingresoCoche(List<Vehiculo> vehiculos, Double precioDiario, Scanner sc) {

        System.out.println("\n-- Iniciando Gestion de ingreso de un Coche --");
        Coche cocheAIngresar = null;

        // obtenemos los datos hasta que todos sean validos
        while (true) {

            System.out.print("\nIngrese las ruedas a trabajar \n> ");
            int cantidadDeRuedasATrabajar = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la cantidad de ruedas trabajadas \n> ");
            int cantidadDeRuedasTrabajadas = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la marca de la moto \n> ");
            String marca = sc.nextLine().trim();

            System.out.print("\nIngrese la patente de la moto \n> ");
            String patente = sc.nextLine().trim();

            System.out.print("\nIngrese el kilometraje de la moto \n> ");
            Double kilometraje = ValidadorNumeros.validarFloat(sc);

            System.out.print("\nIngrese el cilindraje de la moto \n> ");
            int cantidadPuertas = ValidadorNumeros.validarEntero(sc);

            System.out.println("El titular ya abono de forma anticipada?");
            boolean fueCobrado = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

            // Validacionnes
            // validamos algunas restricciones logicas de ruedas
            if (!VehiculosConcerns.validarRuedasCoche(cantidadPuertas, cantidadPuertas)) {
                // dejamos vacio porque los mensajes estan en validacioRuedasMoto dentro de
                // concerns.
            } else if (kilometraje < 0) {
                System.out.println("#Error en carga de datos: El kilometraje no puede ser un numero negativo");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (cantidadPuertas < 0 || cantidadPuertas > 5) {
                System.out
                        .println("#Error en carga de datos: se ingreso una cifra erronea para la cantidad de puerdas.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (!ValidadorVehiculo.validarPatente(vehiculos, patente) || patente == null || patente.equals("")) {
                System.out.println("#Error en carga de datos: La patente es invalida.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (marca == null || marca.equals("")) {
                System.out.println("#Error en carga de datos: La marca no puede estar vacia.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else {
                // instanciamos el objeto con datos validos.
                cocheAIngresar = new Coche(cantidadDeRuedasATrabajar, cantidadDeRuedasTrabajadas, kilometraje, patente,
                        marca, cantidadPuertas, cantidadPuertas, fueCobrado);
                System.out.println("Los datos del coche son:");
                System.out.println(cocheAIngresar);

                // consultamos por confirmacion
                System.out.print("\n> Confirma el ingreso del coche? [ si | no ]\n> ");
                if (ValidadorVehiculo.validadorBooleanoConfirmacion(sc)) {
                    System.out.println("Coche almacenado exitosamente");
                    break;
                } else {
                    System.out.println("Reiniciando carga de datos de moto..\n");
                }
            }

        }
        return cocheAIngresar;

    };

    // update
    private static Vehiculo actualizarVehiculo() {

        return null;
    }

}
