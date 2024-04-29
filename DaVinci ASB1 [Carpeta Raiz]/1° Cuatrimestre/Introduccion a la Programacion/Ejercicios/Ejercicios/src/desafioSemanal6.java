import java.util.Scanner;

public class desafioSemanal6 {

    /*
     * . Actividad de conectivos:
     * Hacer un programa para calcular el precio de un billete de ida y vuelta
     * en tren conociendo la distancia de ida y el tiempo de estancia.
     *
     * Se sabe además que, si el número de días de estancia es superior a 7 y la
     * distancia total a recorrer es superior a 800 km, el billete tiene un
     * descuento del 30%. El precio por km es de $3.70.
     * Indicá cuánto debeabonar.
     *
     * Objetivo: Practicar el uso de los operadores lógicos en Java y afianzar
     * los conocimientos sobre las operaciones básicas y condicionales.
     *
     *
     *
     */
    final static double billete = 3.70;

    public static void main(String[] args) {

        double montoTotal = 0;
        Scanner sc = new Scanner(System.in);

        // Validaciones de Distancia, tiempo, y dias
        // Distancia
        System.out.println("Ingrese la distancia en km: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, ingrese la distancia en km: ");
            sc.next();
        }
        double distancia = sc.nextDouble();
        // Dias
        System.out.println("Ingrese la el tiempo en dias: ");
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese una estadia valida en dias: ");
            sc.next();
        }
        int tiempo = sc.nextInt();

        // Validar el descuento
        if (tiempo > 7 && distancia > 800) {
            System.out.println("Ud tiene un descuento del 30%!");
            montoTotal = (distancia * billete);
            montoTotal = montoTotal - (montoTotal * 0.30);
            System.out.println("El monto total a pagar es de: " + montoTotal);
        } else {
            montoTotal = (distancia * billete);
            System.out.println("El monto total a pagar es de: " + montoTotal);
        }

    }
}
