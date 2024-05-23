import java.util.Scanner;

public class Clase10_2 {
    public static void main(String[] args) {

        int[] userNums = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < userNums.length; i++) {
            System.out.println("Ingrese un numero");

            // Validamos la informacion recibida por el user
            while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                System.out.println("Por favor, ingrese un número valido.");
                sc.next(); // limpiar
            }
            userNums[i] = sc.nextInt(); // populamos con el numero ingresado del usuario
        }

        System.out.println("Numeros ingresados de ultimo a primero:");
        // indice lo colocamos como el max del array, y vamos decrementando el indice
        // hasta que sea igual a 0z
        for (int i = (userNums.length - 1); i >= 0; i--) {
            System.out.print(userNums[i] + " ,");
        }

        sc.close();
    }

}
