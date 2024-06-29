
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Escribir un programa que tome números enteros hasta que el usuario
 * ingrese 0 (cero) para finalizar el ciclo. Finalmente mostrar por pantalla
 * el mayor de los números ingresados.
 */
public class PrimeraConsinga {

    static public void mayorNumeroIngresado(Scanner sc) {
        boolean flag = true;
        int numIngresado;
        int numeroMayor = 0;

        // bucle evaluando los numeros ingresado por el usuario
        while (flag) {
            System.out.print("Ingrese un numero: \n > ");
            numIngresado = MenuPrincipalSegundoParcial.validadorEntero(sc);

            if (numIngresado == 0) {
                flag = false;
            } else if (numeroMayor < numIngresado) {
                numeroMayor = numIngresado;

            }

        }

        // por si no se respeta la cosigna
        if (numeroMayor != 0) {
            JOptionPane.showMessageDialog(null, String.format("El numero mas alto ingresado es: %s", numeroMayor));

        } else {
            JOptionPane.showMessageDialog(null, "No ha ingresado valores para evaluar el numero mas alto");
        }
    }

}
