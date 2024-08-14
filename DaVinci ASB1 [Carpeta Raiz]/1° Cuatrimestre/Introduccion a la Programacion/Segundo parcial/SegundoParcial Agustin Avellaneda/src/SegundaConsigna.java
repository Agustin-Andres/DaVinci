
import java.util.Scanner;

public class SegundaConsigna {

    static public void tablaDeNumero(Scanner sc) {

        System.out.print("Ingrese un numero para ver su tabla \n > ");
        int numeroIngresado = MenuPrincipalSegundoParcial.validadorEntero(sc);

        System.out.println(String.format("La tabla del numero %s del 1 al 12:", numeroIngresado));

        // mostramos el Output por consola
        for (int i = 1; i <= 12; i++) {

            int resultado = numeroIngresado * i;
            System.out.println(String.format("%s x %s = %s", numeroIngresado, i, resultado));

        }
    }

}
