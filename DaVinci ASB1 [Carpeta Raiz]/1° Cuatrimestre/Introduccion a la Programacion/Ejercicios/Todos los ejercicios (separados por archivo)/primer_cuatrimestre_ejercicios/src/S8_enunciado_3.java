
import java.util.Scanner;

public class S8_enunciado_3 {

    /*
     * Cálculo de promedio: Pedí al usuario que ingrese una serie de números
     * (no por uno) hasta que ingrese un número negativo. Utiliza un ciclo while o
     * do-while
     * para
     * calcular el promedio de los números ingresados (sin incluir el número
     * negativo) y
     * mostrarlo en pantalla.
     * Desarrolla el diagrama y luego escribí en java.
     * Contenido: Ciclos while y/o do-while, operaciones matemáticas.
     */
    public static void main(String[] args) throws Exception {
        // variables
        int numero;
        int cantNumeros = 0;
        int acumulador = 0;
        double promedio;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            if (numero < 0) {
                System.out.println("Finalizamos el bucle.");
                break;

            } else {

                cantNumeros = cantNumeros + 1;
                acumulador = acumulador + numero;

            }

        } while (true);

        promedio = (double) (acumulador / cantNumeros);
        System.out.println("el promedio es:" + promedio);

    }
}
