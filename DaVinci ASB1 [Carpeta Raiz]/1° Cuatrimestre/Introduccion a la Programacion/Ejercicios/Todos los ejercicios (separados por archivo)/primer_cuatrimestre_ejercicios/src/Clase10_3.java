import java.util.Scanner;

public class Clase10_3 {
    public static void main(String[] args) {

        int[] edadUser = new int[5];
        String[] nombreUser = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nombreUser.length; i++) {
            //pedimos el nombre del usuario
            System.out.print("Ingrese el nombre del usuario\n> ");
            nombreUser[i] = sc.next();
            System.out.print("Que edad tiene " + nombreUser[i] + " ?\n> ");

            while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                System.out.print("Por favor, ingrese un número valido.\n> ");
                sc.next(); // limpiar
            }
            //solicitamos la edad
            edadUser[i] = sc.nextInt(); // populamos con la edad del usuario

        }

        // for para output de los que son mayores de 18
        for (int i = 0; i < edadUser.length; i++) {
            if (edadUser[i] >= 18) {
                System.out.println(nombreUser[i] + " es mayor de edad, tiene " + edadUser[i] + " años");
            }
        }

    }

}
