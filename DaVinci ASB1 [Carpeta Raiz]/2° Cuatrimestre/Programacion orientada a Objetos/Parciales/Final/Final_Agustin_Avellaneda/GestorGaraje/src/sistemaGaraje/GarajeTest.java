package sistemaGaraje;
import java.util.Scanner;

import Controllers.*;

import Controllers.GarajeController;
import Interfaz.InterfazGaraje;

public class GarajeTest {

    //creacion de gajare
   public void iniciarSession(){
    Scanner sc = new Scanner(System.in);

    Garaje garaje = InterfazGaraje.creacionGaraje(sc);

    sc.close();
   }

    
}