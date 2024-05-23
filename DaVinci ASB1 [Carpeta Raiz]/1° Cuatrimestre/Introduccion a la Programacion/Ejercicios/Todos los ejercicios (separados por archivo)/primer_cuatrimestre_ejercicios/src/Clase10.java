import java.util.Scanner;

public class Clase10 {
    public static void main(String[] args) {

        // Arrays de datos y semanas
        String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        int[] ventas = new int[7];
        int ventaMax = 0, ventaMin = 0;
        String diaMax = null, diaMin = null;

        Scanner sc = new Scanner(System.in);

        // for loop para recorrer ventas y dias
        for (int i = 0; i < dias.length; i++) {

            System.out.println("Ingrese la venta del dia " + dias[i]);

            // Validamos la informacion recibida por el user
            while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                System.out.println("Por favor, ingrese un número valido.");
                sc.next(); // limpiar
            }
            ventas[i] = sc.nextInt(); // populamos la venta del dia i

            // if para determinar minimo y maximo
            if (i == 0) {
                ventaMax = ventas[i];
                ventaMin = ventas[i];
            } else {

                // if anidado para determinar si es maximo o minimo
                if (ventas[i] < ventaMax) {
                    ventaMax = ventas[i];
                    diaMax = dias[i];
                } else if (ventas[i] > ventaMin) {
                    ventaMin = ventas[i];
                    diaMin = dias[i];
                }
            }

        }

        // notificamos la venta maxima y minimo, con el dia y las ventas semanales
        System.out.println("La venta maxima fue de : $" + ventaMax + " y fue el dia " + diaMax);
        System.out.println("La venta minuma fue de : $" + ventaMin + " y fue el dia " + diaMin + "\n\nVentas de las semana:");

        for (int i = 0; i < ventas.length; i++) {
            System.out.println(dias[i] + " -> " + ventas[i]);
        }
        sc.close();
    }

}
