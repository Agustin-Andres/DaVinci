import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Establecer la contrasena y el saldo inicial
        int contrasena = 1234; // contrasena de ejemplo
        double saldoDisponible = 1000;

        // Intentos de inicio de sesión
        int intentosRestantes = 3;

        boolean continuarPrograma = true;
        double cantidadRetirar = 0;

        // Bucle para la validación de la credencial (3 intentos)
        while (intentosRestantes > 0) {
            // Solicitar la contrasena al usuario
            System.out.println("Ingrese su contrasena:");
            int contrasenaIngresada = scanner.nextInt();

            // Verificar si la contrasena es válida
            intentosRestantes = ProcesamientoCajero(scanner,);
              }

        // Si se terminaron los intentos, mostrar el bloqueo de la cuenta
        if (intentosRestantes == 0) {
            System.out.println("Se han agotado los intentos. La cuenta está bloqueada.");
        }

        scanner.close();
    }
    public static double Extraccion(double saldo, double retiro){

        if (retiro <= saldo) {
            // Realizar el cálculo de extracción y mostrar el saldo que queda
            saldo -= retiro;
            MostrarSaldoDisponible(saldo);
        } else {
            System.out.println("Monto superior a su saldo. Ingrese nuevamente un saldo.");
        }

        return saldo;


    };

    public static int ProcesamientoCajero(Scanner scanner, ){
        if (contrasenaIngresada == contrasena) {

            System.out.println("contrasena válida.");
            while (continuarPrograma) { // SOLUCIONAR BUG, PENSAR EN QUE SOLUCION APLICAR
                // Mostrar opciones al usuario
                System.out.println("Opciones:");
                System.out.println("1. Consultar saldo disponible");
                System.out.println("2. Extracción");
                System.out.println("3. Salir");

                // Leer la opción elegida por el usuario
                int opcion = scanner.nextInt();

                // Procesar la opción elegida
                switch (opcion) {
                    case 1:
                        // Mostrar saldo disponible en la cuenta
                        System.out.println("Saldo disponible: " + saldoDisponible);
                        break;
                    case 2:
                        // Consultar al usuario cuanto dinero desea extraer
                        System.out.println("Ingrese la cantidad de dinero que desea extraer:");
                       cantidadRetirar = scanner.nextDouble();

                        // Validar si el dinero que quiere extraer es <= al que tiene disponible
                      saldoDisponible = Extraccion(saldoDisponible,cantidadRetirar);
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema.");
                        // flag: terminamos el programa
                        continuarPrograma = false;
                        break; // Salir del bucle
                    default:
                        System.out.println("Opción inválida. Por favor ingrese una opción válida.");
                }
            }

            // salir del bucle de inicio si el usuario cierra el programa con la opcion 3
            break;
        } else {
            // Restar al contador de intentos y mostrar la cantidad de intentos restantes
            intentosRestantes--;
            System.out.println("contrasena incorrecta. Intentos restantes: " + intentosRestantes);
        }

    }


}
