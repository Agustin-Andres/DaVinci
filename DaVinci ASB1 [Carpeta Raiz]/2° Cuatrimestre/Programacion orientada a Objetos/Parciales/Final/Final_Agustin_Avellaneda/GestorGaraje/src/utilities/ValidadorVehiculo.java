package utilities;

import Vehiculos.Vehiculo;
import java.util.List;
import java.util.Scanner;

public class ValidadorVehiculo {

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

    // validador de booleano necesitamos un si o no [true | false]
    public static boolean validadorBooleanoConfirmacion(Scanner sc) {
        // iteramos hasta recibir un dato valido
        while (true) {
            String opcion = sc.nextLine().toLowerCase().trim();
            opcion = opcion.substring(0);
            char primeraLetra = opcion.charAt(0);
            if (primeraLetra == 's' || primeraLetra == 'n') {
                // retornamos el valor en el caso de que opcion contenga un valor valido
                return primeraLetra != 'n';
            } else {
                System.out.print("Por favor ingrese un valor valido [ si | no ]");
            }

        }
    }

    // validor si la capacidad fue alcanzada
    public static boolean validarDisponibilidadCapacidad(int capacidadActual, int capacidadMaxima) {
        return capacidadActual >= capacidadMaxima;
    }

}
