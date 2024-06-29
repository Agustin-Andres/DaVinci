
import java.util.Scanner;

public class CuartaConsigna {

    static public void notasAlumnos(Scanner sc) {
        System.out.print("Cuantos alumnos desea evaluar? \n > ");
        int largoArreglo = MenuPrincipalSegundoParcial.validadorEntero(sc);

        String[] alumnos = new String[largoArreglo];
        int[][] notasAlumnos = new int[3][largoArreglo];

        //llenamos la matriz con valores aleatorios
        notasAlumnos = popularMatriz(notasAlumnos);
        mostrarMatrizDeAlumnos(alumnos, notasAlumnos);

    }

    static public int[][] popularMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int randomNumber = (int) (Math.random() * 10) + 1;
                matriz[i][j] = randomNumber;
            }
        }
        return matriz;
    }

    static public void mostrarMatrizDeAlumnos(String alumnos[], int notas[][]) {

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
