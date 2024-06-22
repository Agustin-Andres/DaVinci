import java.util.Scanner;

public class clase13 {
    public static final int FILAS = 4;
    public static final int COLUMNAS = 4;

    public static void main(String[] args) {

        // Declarar variables
        int matriz[][] = new int[FILAS][COLUMNAS];
        Scanner sc = new Scanner(System.in);
        PopularMatriz(matriz, sc);

        MostrarMatriz(matriz);

        MostrarMatrizAristas(matriz);

        MostrarMatrizVertices(matriz);

        sc.close();

    }

    public static int[][] PopularMatriz(int matriz[][], Scanner sc) {
        System.out.println("\n\nMatriz original : \n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print("Ingrese el numero ubicado en la posicion: [" + i + "][" + j + "]\n>");
                matriz[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return matriz;
    }

    public static void MostrarMatriz(int matriz[][]) {

        System.out.println("\n\nMatriz original : \n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void MostrarMatrizAristas(int matriz[][]) {

        System.out.println("\n\nMatriz Tuneada : \n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {

                if (j == 0 || i == 0 || j == FILAS - 1 || i == COLUMNAS - 1) {
                    System.out.print(matriz[i][j]);

                } else {
                    System.out.print("x");
                }
                System.out.print(" ");

            }
            System.out.println();
        }

    }

    public static void MostrarMatrizVertices(int matriz[][]) {

        System.out.println("\n\nMatriz Vertices : \n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {

                if ((i == 0 && j == 0) || (i == 0 && j == COLUMNAS - 1)) {
                    System.out.print(matriz[i][j]);
                } else if ((i == FILAS - 1 && j == 0) || (i == FILAS - 1 && j == COLUMNAS - 1)) {
                    System.out.print(matriz[i][j]);
                } else {
                    System.out.print("x");
                }
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
