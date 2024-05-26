import java.util.Scanner;

public class Clase13_1 {

    // algoritmo de ordenamiento

    public static void main(String[] args) {
        double[] montoGasto = new double[4];
        String[] tipoGasto = { "Comida", "Hospedaje", "Transporte", "Ropa" };
        boolean swapping = true;

        Scanner sc = new Scanner(System.in);

        // input of scanner
        for (int i = 0; i < montoGasto.length; i++) {

            System.out.println("Ingrese el monto gastado en " + tipoGasto[i] + ": ");
            montoGasto[i] = sc.nextDouble();
        }

        // BUBBLE SORT
        // bucle para revisar si se hizo algun cambio
        while (swapping) {
            swapping = false;

            // bucle para recorrer el array y comparar datos
            for (int i = 0; i < montoGasto.length - 1; i++) {

                if (montoGasto[i] > montoGasto[i + 1]) {
                    // si se cumple la condicion se hace el cambio
                    // cambio del monto
                    double tempMonto = montoGasto[i];
                    montoGasto[i] = montoGasto[i + 1];
                    montoGasto[i + 1] = tempMonto;

                    // cambio de categoria
                    String tempCategoria = tipoGasto[i];
                    tipoGasto[i] = tipoGasto[i + 1];
                    tipoGasto[i + 1] = tempCategoria;
                    // aclaramos que si se hizo el cambio para que se revise el array nuevamente
                    swapping = true;
                }

            }

        }

        // mostramos por pantalla el output
        for (int i = 0; i < montoGasto.length; i++) {
            System.out.println("Para la categoria " + tipoGasto[i] + " se gasto $" + montoGasto[i]);

        }

        sc.close();

    }

}
