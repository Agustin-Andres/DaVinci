package sistemaGaraje;
import java.util.Scanner;


import Interfaz.InterfazGaraje;

public class GarajeTest {

    //creacion de gajare
   public static void iniciarSession(){
    Scanner sc = new Scanner(System.in);

    //aca retorna el garaje coin sus atributos.
    Garaje garaje = InterfazGaraje.creacionGaraje(sc);

    //mostramos el mensaje de aviso por si la session tiene la capacidad maxima alcanzada
    InterfazGaraje.mensajeCapacidadAlcanzada(garaje);



    sc.close();
   }

   private void mostrarMenuGestionGaraje() {
      System.out.println("*******************************************");
      System.out.println("               Gestion Garaje               ");
      System.out.println("*******************************************");
      System.out.printf("%-5s %-50s\n", "ID", "Descripción");
      System.out.println("-------------------------------------------");
      System.out.printf("%-5s %-50s\n", "#1", "Menu Gestion de vehiculos dentro del garaje");
      System.out.printf("%-5s %-50s\n", "#2", "Mostrar informacion financiera de Garaje");
      System.out.printf("%-5s %-50s\n", "#3", "Ver informacion actual del garaje");
      System.out.printf("%-5s %-50s\n", "#4", "Salir");
      System.out.println("-------------------------------------------");
      System.out.print("[#]> ");
  }
  
   
   private Garaje menuGestionGaraje(Garaje garaje){

    return garaje;
   }
    
}