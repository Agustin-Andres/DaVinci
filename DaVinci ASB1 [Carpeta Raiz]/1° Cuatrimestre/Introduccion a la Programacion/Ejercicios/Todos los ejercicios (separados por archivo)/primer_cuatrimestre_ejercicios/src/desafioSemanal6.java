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

        int option;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        // Variables Ejercicio 1
        double montoTotal = 0;

        // Variable ejercicio 2
        int numAleatorio, adivinanza, cantAdivinanzas = 0;

        while (flag) {
            System.out.println("Que ejercicio te gustaria hacer? (1 / 2 /3 para salir)");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    // Validaciones de Distancia, tiempo, y dias
                    // Distancia
                    System.out.println("\t >Ejercicio de billetes");
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
                    montoTotal = (distancia * billete);

                    // Validar el descuento
                    if (tiempo > 7 && distancia > 800) {
                        System.out.println("Ud tiene un descuento del 30%!");
                        montoTotal = montoTotal - (montoTotal * 0.30);
                        System.out.println("El monto total a pagar es de: " + montoTotal);
                    } else {
                        System.out.println("El monto total a pagar es de: " + montoTotal);
                    }

                    break;
                case 2:
                    System.out.println("\t >>>Ejercicio de numero aleatorio");
                    numAleatorio = (int) (Math.random() * 5) + 1;
                    System.out.println("numero aletorio :" + numAleatorio);

                    while (true) {
                        System.out.println("Adinivine el numero entre 1 y 5");
                        adivinanza = sc.nextInt();
                        // if para ver si el numero es correcto
                        if (adivinanza == numAleatorio) {
                            System.out.println("Adivino correctamente! Le tomo: " + cantAdivinanzas);
                            break;
                        } else {
                            cantAdivinanzas++;
                            if (adivinanza < numAleatorio) {
                                System.out.println("su adivinanza es menor que el numero aleatorio");
                            } else {
                                System.out.println("su adivinanza es mayo que el numero aleatorio");

                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ha decidido finalizar! Saludos.");
                    flag = !flag;
                    break;
                default:
                    System.out.println("debe elegir una opcion correcta");

            }

        }

    }
}
