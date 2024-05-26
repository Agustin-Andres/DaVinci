import java.util.Scanner;

public class Clase13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean swapping = true;

        System.out.print("Ingrese la cantidad de numero que desea ingresar\n> ");
        while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
            System.out.println("Por favor, ingrese un número valido.");
            sc.next(); // limpiar
        }
        int largoArray = sc.nextInt();

        int[] arrayDesordenado = new int[largoArray];
        int[] arrayOrdenado = new int[largoArray];
        for (int i = 0; i < largoArray; i++) {
            System.out.print("Ingrese el numero #" + i + "\n>");
            while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                System.out.println("Por favor, ingrese un número valido.");
                sc.next(); // limpiar
            }
            arrayDesordenado[i] = sc.nextInt();
            arrayOrdenado[i] = arrayDesordenado[i];
        }

        //

        while (swapping) {
            swapping = false;

            // bucle para recorrer el array y comparar datos
            for (int i = 0; i < largoArray - 1; i++) {

                if (arrayOrdenado[i] > arrayOrdenado[i + 1]) {
                    // si se cumple la condicion se hace el cambio
                    int temp = arrayOrdenado[i];
                    arrayOrdenado[i] = arrayOrdenado[i + 1];
                    arrayOrdenado[i + 1] = temp;
                    // aclaramos que si se hizo el cambio para que se revise el array nuevamente
                    swapping = true;
                }

            }

        }

        // mostramos el array
        System.out.println("######array desordenado");
        for (int i = 0; i < largoArray; i++) {
            System.out.print(arrayDesordenado[i] + " | ");
        }

        System.out.println("######array ordenado");
        for (int i = 0; i < largoArray; i++) {
            System.out.print(arrayOrdenado[i] + " | ");
        }
    }
}
