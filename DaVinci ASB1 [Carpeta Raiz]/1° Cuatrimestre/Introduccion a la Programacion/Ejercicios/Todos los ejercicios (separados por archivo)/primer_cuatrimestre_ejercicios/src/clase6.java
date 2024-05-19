import java.util.Scanner;

public class clase6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    // Establecer la contraseña y el saldo inicial
    int contraseña = 1234; // Contraseña de ejemplo
    double saldoDisponible = 1000;

    // Intentos de inicio de sesión
    int intentosRestantes = 3;

    boolean continuarProgramar = true;

    // Bucle para la validación de la credencial (3 intentos)
    while (intentosRestantes > 0 && continuarProgramar) {

        // Solicitar la contraseña al usuario
        System.out.println("Ingrese su contraseña:");
        int contraseñaIngresada = scanner.nextInt();

        // Verificar si la contraseña es válida
        if (contraseñaIngresada == contraseña) {

            while(continuarProgramar){ // SOLUCIONAR BUG, PENSAR EN QUE SOLUCION APLICAR
                // Mostrar opciones al usuario
                System.out.println("Contraseña válida.");
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
                        double cantidadRetirar = scanner.nextDouble();

                        // Validar si el dinero que quiere extraer es <= al que tiene disponible
                        if (cantidadRetirar <= saldoDisponible) {
                            // Realizar el cálculo de extracción y mostrar el saldo que queda
                            saldoDisponible -= cantidadRetirar;
                            System.out.println("Extracción exitosa. Saldo restante: " + saldoDisponible);
                        } else {
                            System.out.println("Monto superior a su saldo. Ingrese nuevamente un saldo.");
                        }
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema.");
                        // flag: terminamos el programa
                        continuarProgramar = false;
                        break; // Salir del bucle
                    default:
                        System.out.println("Opción inválida. Por favor ingrese una opción válida.");
                }

            }

        } else {
            // Restar al contador de intentos y mostrar la cantidad de intentos restantes
            intentosRestantes--;
            System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
        }
    }

    // Si se terminaron los intentos, mostrar el bloqueo de la cuenta
    if (intentosRestantes == 0) {
        System.out.println("Se han agotado los intentos. La cuenta está bloqueada.");
    }

    scanner.close();
    }
}
