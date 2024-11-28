package sistemaGaraje;

import Interfaz.InterfazGaraje;
import Interfaz.InterfazVehiculo;
import java.util.Scanner;
import utilities.ValidadorNumeros;

public class GarajeTest {

   // Comienza aca
   // creacion de garaje
   public static void iniciarSession() {
      Scanner sc = new Scanner(System.in);

      // aca retorna el garaje coin sus atributos.
      Garaje garaje = InterfazGaraje.creacionGaraje(sc);

      // Ya que iniciamos sesion correctamente, mostramos el menu de Gestion Garaje
      menuGestionGaraje(garaje, sc);

      sc.close();
   }

   // seleccion de menu
   private static Garaje menuGestionGaraje(Garaje garaje, Scanner sc) {

      boolean flag = true;
      int opcionUser;
      while (flag) {
         // mostramos de gestion
         mostrarMenuGestionGaraje();
         opcionUser = ValidadorNumeros.validarEntero(sc);

         // switch para menu
         switch (opcionUser) {
            case 1:
               // Menu de Gestion de vehiculos
               garaje = gestionVehiculos(sc, garaje);
               break;
            case 2:
               break;
            case 3:
               // Ver informacion actual del garaje
               System.out.println(garaje.toStringCompleto());
               break;
            case 4:
               garaje.informacionVehiculos();
               break;
            case 5:
               // cerramos sesison
               System.out.println("Cerrando session... ");
               System.out.println(garaje.toStringCompleto());
               System.out.println("Sesion cerrada. Saludos.");
               flag = false;
               break;

            default:
               System.out.println("Por Favor ingrese una opcion correcta");

         }

      }

      return garaje;
   }

   // mostramos el menu
   private static void mostrarMenuGestionGaraje() {
      System.out.println(
            "*********************************************************************************************************************************************");
      System.out.println(
            "                                               Gestion Garaje                                                                   ");
      System.out.println(
            "*********************************************************************************************************************************************");
      System.out.printf("%-5s %-50s\n", "ID", "Descripción");
      System.out.println(
            "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.printf("%-5s %-50s\n", "#1", "Menu Gestion de vehiculos dentro del garaje");
      System.out.printf("%-5s %-50s\n", "#2", "Mostrar informacion financiera de Garaje");
      System.out.printf("%-5s %-50s\n", "#3", "Ver informacion actual del garaje");
      System.out.printf("%-5s %-50s\n", "#4", "Mostrar todos los vehiculos actuales en garaje");
      System.out.printf("%-5s %-50s\n", "#5", "Cerrar session.");
      System.out.println(
            "-----------------------------------------------------------------------------------------------------------------------------------------------\n");
      System.out.print("[Opcion #]> ");
   }

   // mandamos a la interfaz de vehiculos - logica completamente aislada y
   // escalable
   private static Garaje gestionVehiculos(Scanner sc, Garaje garaje) {

      // InterfazVehiculo, le pasamos el precio lista de hoy +
      // la lista de vehiculos, capacidad maxima
      InterfazVehiculo.gestionVehiculos(garaje.getVehiculos(), sc,
            garaje.getCapacidadMaxima(), garaje.getPrecioCambioRueda());

      // una vez gestionada la lista, que fue por referencia
      // recalculamos la disponibilidad de almacenamientio
      garaje.calcularDisponibilidad();

      return garaje;
   }

}