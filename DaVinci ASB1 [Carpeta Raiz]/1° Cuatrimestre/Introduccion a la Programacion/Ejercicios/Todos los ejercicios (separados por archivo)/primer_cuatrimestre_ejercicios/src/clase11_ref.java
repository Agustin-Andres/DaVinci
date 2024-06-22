import java.util.Scanner;

public class clase11_ref {
    public static final int LARGOARREGLO = 100;

    public static void main(String[] args) {

        int array[] = new int[LARGOARREGLO];
        Scanner sc = new Scanner(System.in);
        int numBuscado = 0;

        System.out.println("Puede buscar un numero del 0 al 100");
        // popular array
        array = PopularArreglo(array);

        // MostrarArray(array);
        System.out.println("Que numero desea buscar?");
        numBuscado = sc.nextInt();

        BuscarNum(array, numBuscado);

    }

    public static int[] PopularArreglo(int array[]) {
        for (int j = 0; j < LARGOARREGLO; j++) {
            int randomNumber = (int) (Math.random() * 101);
            array[j] = randomNumber;
        }
        return array;
    }

    public static void MostrarArray(int array[]) {

        System.out.println("\n Arreglo: \n");

        for (int j = 0; j < LARGOARREGLO; j++) {
            System.out.print(array[j] + " ");
        }

    }

    public static void BuscarNum(int array[], int numBuscado) {
        boolean flag = false;
        int pos = 0;
        for (int j = 0; j < LARGOARREGLO; j++) {
            if (array[j] == numBuscado) {
                flag = !flag;
                pos = j;
                break;
            }
        }
        if (flag) {
            System.out.println("El numero " + numBuscado + " se encuentra en el arreglo, en la posicion #" + pos);
            MostrarArray(array);
        } else {
            System.out.println("El numero " + numBuscado + " no se encuentra en el arreglo");
        }
    }

}
