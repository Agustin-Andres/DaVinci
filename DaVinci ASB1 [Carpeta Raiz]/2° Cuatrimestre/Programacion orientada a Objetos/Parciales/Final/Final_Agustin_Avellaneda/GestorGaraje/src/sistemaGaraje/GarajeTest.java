package sistemaGaraje;

import java.util.List;
import java.util.Scanner;

import Interfaz.InterfazGaraje;
import Interfaz.InterfazVehiculo;
import Vehiculos.Vehiculo;
import utilities.ValidadorNumeros;

public class GarajeTest {

   // creacion de gajare
   public static void iniciarSession() {
      Scanner sc = new Scanner(System.in);

      // aca retorna el garaje coin sus atributos.
      Garaje garaje = InterfazGaraje.creacionGaraje(sc);

      // mostramos el mensaje de aviso por si la session tiene la capacidad maxima
      // alcanzada
      InterfazGaraje.mensajeCapacidadAlcanzada(garaje);

      menuGestionGaraje(garaje, sc);

      sc.close();
   }

   private static void mostrarMenuGestionGaraje() {
      System.out.println("*******************************************");
      System.out.println("               Gestion Garaje               ");
      System.out.println("*******************************************");
      System.out.printf("%-5s %-50s\n", "ID", "Descripción");
      System.out.println("-------------------------------------------");
      System.out.printf("%-5s %-50s\n", "#1", "Menu Gestion de vehiculos dentro del garaje");
      System.out.printf("%-5s %-50s\n", "#2", "Mostrar informacion financiera de Garaje");
      System.out.printf("%-5s %-50s\n", "#3", "Ver informacion actual del garaje");
      System.out.printf("%-5s %-50s\n", "#4", "Mostrar todos los vehiculos actuales en garaje");
      System.out.printf("%-5s %-50s\n", "#5", "Cerrar session.");
      System.out.println("-------------------------------------------");
      System.out.print("[#]> ");
   }

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
               // Gestion de vehiculos
               garaje = gestionVehiculos(sc, garaje);
               break;
            case 2:
               break;
            case 3:
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

   // mandamos a la interfaz de vehiculos
   private static Garaje gestionVehiculos(Scanner sc, Garaje garaje) {

      // sacamos la lista de objetos de los vehiculos para enviar a interfaz vehiculos
      // la interfaz tiene su propia gestion de una lista de vehiculos, segun la
      // disponibilidad adel garaje
      garaje.setVehiculos(InterfazVehiculo.gestionVehiculos(garaje.getVehiculos(), sc, garaje.isCapacidadAlcanzada(),
            garaje.getCapacidadDisponible()));

      return garaje;
   }

}