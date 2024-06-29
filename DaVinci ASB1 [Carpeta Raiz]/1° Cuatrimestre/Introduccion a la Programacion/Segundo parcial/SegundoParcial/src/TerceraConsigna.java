
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TerceraConsigna {

    public static void sumaTotalDeArray(Scanner sc) {
        System.out.print("Cuantos numeros desea ingresar? \n > ");
        int largoArreglo = MenuPrincipalSegundoParcial.validadorEntero(sc);

        // validamos que el user ingrese una cantidad correcta, sino le indicamos que no
        // es posible.
        if (largoArreglo > 1) {
            int arrayEnteros[] = new int[largoArreglo];
            int acumulador = 0;

            for (int i = 1; i <= largoArreglo; i++) {
                // recorremos la cantidad de numeros que ingreso el user y le indicamos por cual
                // va.
                System.out.print(String.format("Ingrese un numero [%s / %s] \n > ", i, largoArreglo));
                arrayEnteros[i - 1] = MenuPrincipalSegundoParcial.validadorEntero(sc);
                acumulador = acumulador + arrayEnteros[i - 1];
            }

            // mostramos el resultado del acumulador
            JOptionPane.showMessageDialog(null,
                    String.format("La suma total de los numeros ingresados es: %s", acumulador));

        } else {
            JOptionPane.showMessageDialog(null, "La cantidad de numeros debe ser mayor que 1! ");
        }
    }

}
