package Interfaz;

import Vehiculos.Vehiculo;
import java.util.List;
import java.util.Scanner;
import sistemaGaraje.Garaje;
import utilities.ValidadorNumeros;

public class InterfazGaraje {

    // para iniciar las instancias de garaje necesario en caso de escabilidad
    public static Garaje creacionGaraje(Scanner sc) {

        Garaje garaje = menuGaraje(sc);
        return garaje;
    }

    // input de user
    private static Garaje menuGaraje(Scanner sc) {
        Garaje garaje = new Garaje();

        // boleano para "cerrar" sesion, ventana de aviso o popula datos
        boolean sesionfinal = false;

        boolean flag = true;
        int opcionUser;
        while (flag) {
            // mostramos menu inicial
            mostrarMenuGaraje();
            opcionUser = ValidadorNumeros.validarEntero(sc);

            // switch para menu
            switch (opcionUser) {
                case 1:
                    // Comenzar nueva sesion
                    garaje = sessionNuevaGaraje(sc);
                    flag = !flag;
                    break;

                case 2:
                    // Continuar ultima sesion disponible disponibilidad : 1
                    garaje = popularGaraje(sesionfinal);
                    flag = !flag;
                    break;

                case 3:
                // completamente lleno
                    sesionfinal = !sesionfinal; 
                    garaje = popularGaraje(sesionfinal);
                    flag = !flag;
                    break;

                case 4:
                    // cerramos session directamente al salir de programa
                    System.out.println("Sesion Finalizada. Saludos.");
                    System.exit(0);
                    garaje = null;
                    break;

                default:
                    System.out.println("Por Favor ingrese una opcion correcta");
            }

        }

        System.out.println(garaje.toStringCompleto());
        return garaje;
    }

    // menu inicial, comenzamos con este menu para ver como se desea gestionar
    // garaje.

    private static void mostrarMenuGaraje() {
        System.out.println(
                "*********************************************************************************************************************************************");
        System.out.println(
                "                                               Menu del Garaje                                                                    ");
        System.out.println(
                "*********************************************************************************************************************************************");
        System.out.printf("%-5s %-50s\n", "ID", "Descripción");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.printf("%-5s %-50s\n", "#1", "Comenzar nueva sesion [Sin vehiculos - completamente vacio]");
        System.out.printf("%-5s %-50s\n", "#2",
                "Continuar ultima sesion disponible [Garaje populado - 1 espacio disponible de almacenamiento]");
        System.out.printf("%-5s %-50s\n", "#3", "Continuar sesion [Garaje populado - completamente lleno]");
        System.out.printf("%-5s %-50s\n", "#4", "Salir de programa");
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.print("[#]> ");
    }

    // Retorna garaje ya populado completamente.
    private static Garaje popularGaraje(Boolean sesionFinal) {
        // populamos la lista de vehiculos en garaje
        List<Vehiculo> vehiculos_actuales = utilities.popularVehiculos.popularCoches();
        vehiculos_actuales.addAll(utilities.popularVehiculos.popularMotos());

        Garaje garaje = new Garaje();

        if (sesionFinal) {
            // si es la session final, queremos que muestre que la capacidad ha sido
            // alcanzada
            garaje.setPrecioCambioRueda(100.0);
            garaje.setVehiculos(vehiculos_actuales);

            // capacidadMax = CapacidadActual
            garaje.setCapacidadMaxima(vehiculos_actuales.size());
            garaje.setCapacidadActual(vehiculos_actuales.size());
            garaje.setCapacidadDisponible(0);
            garaje.setCapacidadAlcanzada(true);

        } else {
            // populamos la informacion de garaje
            garaje.setPrecioCambioRueda(100.0);
            garaje.setCapacidadMaxima(21);
            garaje.setVehiculos(vehiculos_actuales);

            // capacidad disponible es cantidad maxima - autos actuales. (1)
            garaje.calcularDisponibilidad();

        }

        return garaje;
    }

    // Retorna garaje con la capacidad maxima y el precio diario.
    private static Garaje sessionNuevaGaraje(Scanner sc) {
        Garaje garaje = new Garaje();

        System.out.println("\nIniciando session....");

        while (true) {

            // Precio diario
            System.out.print("Ingrese el precio del dia para el Cambio de rueda\n> ");
            garaje.setPrecioCambioRueda(utilities.ValidadorNumeros.validarFloat(sc));

            // capacidad maxima de almacenamiento de garaje
            System.out.print("Ingrese la capacidad maxima del dia de hoy\n> ");
            garaje.setCapacidadMaxima(utilities.ValidadorNumeros.validarEntero(sc));

            garaje.setCapacidadDisponible(garaje.getCapacidadMaxima());
            garaje.setCapacidadActual(garaje.getCapacidadMaxima());

            // nested if para validar que ambos datos esten correctos.
            if (garaje.getPrecioCambioRueda() <= 0) {
                System.out.println("##Error, por favor ingrese una cifra valida para el cambio de rueda.");
            } else if (garaje.getCapacidadMaxima() <= 0) {
                System.out.println(
                        "##Error, por favor ingrese una cifra valida el precio la cantidad maxima de almacenamiento.");
            } else {
                break;
            }
            System.out.println("\nReiniciando session....");

        }

        return garaje;
    }

    public static void informacionFinanciera(Garaje garaje) {

        System.out.println("*******************************************");
        System.out.println("--- \tInformacion Financiera\t---");
        System.out.println("Precio del cambio de rueda:\t$" + garaje.getPrecioCambioRueda());
        System.out.println("Monto acumulado por #" + garaje.getCapacidadActual() + "\t $"
                + (garaje.getCapacidadActual() * garaje.getPrecioCambioRueda()));
        System.out.println("*******************************************");

    }

}
