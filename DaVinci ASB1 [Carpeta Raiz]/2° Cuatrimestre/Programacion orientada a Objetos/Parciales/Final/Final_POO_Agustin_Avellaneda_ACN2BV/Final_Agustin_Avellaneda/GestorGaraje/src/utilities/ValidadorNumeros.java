package utilities;

import java.util.Scanner;

public class ValidadorNumeros {

    // utilidad para validacion de enteros
    public static int validarEntero(Scanner sc) {
        int num;
        while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
            System.out.print("Por favor, ingrese un número valido:\n > ");
            sc.next(); // limpiar
        }
        num = sc.nextInt();
        sc.nextLine();// bug aca con el buffer de scanner al llamar este metodo para opcion de x menu

        return num;
    }

    // utilidad para validacion de doubles
    public static Double validarFloat(Scanner sc) {
        Double num;
        while (!sc.hasNextDouble()) { // validacion es por si el usuario NO ingresa un Double
            System.out.print("Por favor, ingrese un número valido:\n > ");
            sc.next(); // limpiar
        }
        num = sc.nextDouble();
        sc.nextLine();// bug aca con el buffer de scanner al llamar este metodo para opcion de x menu
        return num;
    }



}