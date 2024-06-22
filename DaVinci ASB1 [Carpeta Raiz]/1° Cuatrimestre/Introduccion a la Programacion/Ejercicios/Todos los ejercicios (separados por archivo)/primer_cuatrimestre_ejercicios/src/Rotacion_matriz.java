public class Rotacion_matriz {

    // modificar la Matriz a gusto en largo.
    public static final int FILAS = 5;
    public static final int COLUMNAS = 2;

    public static void main(String[] args) {
        int matriz[][] = new int[FILAS][COLUMNAS];

        // populamos matriz
        matriz = PopularMatriz(matriz);

        // mostramos la original
        MostrarMatriz(matriz);
        MostrarMatrizHorario(matriz);
        MostrarMatrizAntiHorario(matriz);
    }

    public static int[][] PopularMatriz(int matriz[][]) {
        int acumulador = 1;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = acumulador++;
                /*
                 * int randomNumber = (int) (Math.random() * 101);
                 * matriz[i][j] = randomNumber;
                 */

            }

        }
        return matriz;
    }

    public static void MostrarMatriz(int matriz[][]) {
        // imprision matriz
        System.out.println("\n\nMatriz original : \n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void MostrarMatrizHorario(int matriz[][]) {

        System.out.println("\n\nMatriz Rotada a Horario : \n");
        for (int i = 0; i < COLUMNAS; i++) {
            // Aca empezamos de la ultima fila, primera columna -> decrementando la columna
            for (int j = FILAS - 1; j >= 0; j--) {
                // imprimimos la fila y columna
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

    }

    public static void MostrarMatrizAntiHorario(int matriz[][]) {
        System.out.println("\n\nMatriz Rotada a Antihorario : \n");

        for (int j = COLUMNAS - 1; j >= 0; j--) {
            // Aca empezamos de la ultima Comuna, primera Fila -> decrementando la Columna
            for (int i = 0; i < FILAS; i++) {
                // Se imprima FILA y Columna
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
