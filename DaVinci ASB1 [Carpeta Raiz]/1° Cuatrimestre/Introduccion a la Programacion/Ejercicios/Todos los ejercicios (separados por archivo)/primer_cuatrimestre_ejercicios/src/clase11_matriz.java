
public class clase11_matriz {
    public static final int FILAS = 3;
    public static final int COLUMNAS = 3;

    public static void main(String[] args) {

        int matriz[][] = new int[FILAS][COLUMNAS];
        int temp[] = new int[COLUMNAS * FILAS];
        int randomNumber = 0;
        int temp_posicion = 0;

        System.out.println("\n\nMatriz original : \n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                randomNumber = (int) (Math.random() * 101);
                matriz[i][j] = randomNumber;
                temp[temp_posicion] = randomNumber;
                temp_posicion++;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        boolean swapping = true;
        // bucle para revisar si se hizo algun cambio
        while (swapping) {
            swapping = false;

            // bucle para recorrer el array y comparar datos
            for (int i = 0; i < temp.length - 1; i++) {

                if (temp[i] > temp[i + 1]) {
                    // si se cumple la condicion se hace el cambio
                    int aux = temp[i];
                    temp[i] = temp[i + 1];
                    temp[i + 1] = aux;
                    // aclaramos que si se hizo el cambio para que se revise el array nuevamente
                    swapping = true;
                }

            }

        }

        System.out.println("\n\nMatriz tuneada : \n");
        temp_posicion = 0;
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = temp[temp_posicion];
                System.out.print(matriz[i][j] + " ");
                temp_posicion++;
            }
            System.out.println();
        }

    }



}
