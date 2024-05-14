
import java.util.Scanner;

/**
 * Legajo
 */
public class Legajo {

    public static void main(String[] args) {
        // declaracion de variables
        String seguir = "Si";
        int legajo;
        int sueldo = 0;
        int cantSueldoPagado = 0;

        Scanner sc = new Scanner(System.in);

        do {
            // Legajo validacion
            System.out.print("Ingrese el legajo:");

            while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un
                System.out.println("Por favor, ingrese un número valido.");
                sc.next(); // limpiar
            }
            legajo = sc.nextInt();

            // sueldo ingresado
            System.out.print("Ingrese el sueldo del legajo #" + legajo + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un número valido.");
                sc.next(); // limpiar
            }
            sueldo = sc.nextInt();
            cantSueldoPagado++;

            while(!seguir.equalsIgnoreCase("si") || !seguir.equalsIgnoreCase("no")){

            }



        } while (!seguir.equals("no"));


    }
}
