package Interfaz;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.Utilities;

import Vehiculos.Vehiculo;
import sistemaGaraje.Garaje;
import utilities.ValidadorNumeros;
import utilities.popularVehiculos;

public class InterfazGaraje {

    public static Garaje creacionGaraje(Scanner sc) {
        Garaje garaje = menuGaraje(sc);

        return garaje;

    }

    // menu inicial, comenzamos con este menu para ver como se desea gestionar
    // garaje.
    private static void mostrarOpcionesGaraje() {
        // output basico
        System.out.println("*******************************************");
        System.out.println("--- \tGestion Garaje\t---");
        System.out.println("#1 - \tContinuar ultima sesion [popular datos aleatorios]");
        System.out.println("#2 - \tComenzar nueva sesion [Desde 0]");
        System.out.println("#3 - \tCerrar session [Cantidad maxima de vechiculos alcanzado]");
        System.out.println("#4 - \tSalir");

    }

    // input de user
    private static Garaje menuGaraje(Scanner sc) {
        Garaje garaje = new Garaje();

        // mostramos menu inicial

        boolean salida = true;
        int opcionUser;
        while (salida) {
            mostrarOpcionesGaraje();
            opcionUser = ValidadorNumeros.validarEntero(sc);

            // switch para menu
            switch (opcionUser) {
                case 1:
                    //populamos el garaje con valores prestablecidos hardcodeado
                    garaje = popularGaraje();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Por Favor ingrese una opcion correcta");
            }

        }

        return garaje;
    }

    private static Garaje popularGaraje() {
        // populamos la lista de vehiculos en garaje 
        List<Vehiculo> vehiculos_actuales = utilities.popularVehiculos.popularCoches();
        vehiculos_actuales.addAll(utilities.popularVehiculos.popularMotos());
        //populamos la informacion de garaje
        Garaje garaje = new Garaje();
        garaje.setPrecio_cambio_rueda(100.0);
        garaje.setCapacidad_maxima(21);
        garaje.setVehiculos(vehiculos_actuales);
        // capacidad actual es cantidad maxima - autos actuales. (1)
        garaje.setCapacidad_actual(garaje.getCapacidad_maxima()- vehiculos_actuales.size());
        return garaje;
    }

    private static Garaje sessionNuevaGaraje(Scanner sc){
        System.out.println("\nIniciando session....");
        boolean salida = true;
        while (salida) {
            mostrarOpcionesGaraje();
            opcionUser = ValidadorNumeros.validarEntero(sc);

            // switch para menu
            switch (opcionUser) {

            }
        
        
        }



        return null;
    }


}
