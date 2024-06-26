import java.util.Scanner;

public class MenuPrincipalDivisas {

    // Constantes, las divisas de los meses correspondientes
    public static final double[][] TIPOS_DE_CAMBIO = {
            { 660.75, 720.80, 805.90, 851.20, 981.21, 1150.00, 1064.71, 1125.50, 1030.00, 1230.50
            },
            { 117.94, 120.48, 122.82, 121.54, 128.99, 131.23, 134.12, 139.51,
                    144.34, 155.05 },
            { 213.84, 231.94, 237.60, 257.55, 280.77, 300.84, 325.86, 353.28,
                    429.61, 428.63 },
            { 16.50, 17.01, 17.50, 17.44, 18.01, 18.68, 19.46, 20.12, 20.69,
                    21.47 },
            { 19.79, 20.81, 23.41, 23.18, 25.38, 23.81, 25.36, 26.75, 27.19,
                    30.28 }
    };
    public static final String[] DIVISAS = { "Dólar", "Euro", "Libra", "Yuan", "Real" };

    public static final String[] MESES = { "Ago", "Sep", "Oct", "Nov", "Dic", "Ene", "Feb",
            "Mar", "Abr", "May" };

    public static void main(String[] args) throws Exception {
        // variables
        boolean salida = true;
        Scanner sc = new Scanner(System.in);
        int opcionMenuPrincipal;

        // comienzo de programa
        System.out.println("Bienvenido al Conversor de Divisas!");

        // bucle para el menu, obligado a correr una vez al menos.
        do {

            System.out.println("\n¿Qué deseas hacer?");
            mostrarMenuPrincipal();
            opcionMenuPrincipal = validarInt(sc);

            switch (opcionMenuPrincipal) {
                case 1:
                    System.out.println("Ha seleccionado comparar divisas.");
                    mostrarCambioDeDivisasMenu(sc); // enviamos a menu secundario
                    break;

                case 2:
                    System.out.println("Cambio de tipos de cambio histórico");
                    tipoDeCambioHistorico(); // display de cambio historico
                    break;

                case 3:
                    System.out.println("Ha solicitado la finalizacion del programa, saludos!");
                    salida = false;
                    break;

                default:
                    System.out.println("No ha ingresado un dato valido.");
            }

        } while (salida);
        sc.close();
    }

    // metodos
    // Menu principal
    public static void mostrarMenuPrincipal() {
        System.out.print("1. Ingrese el dinero en pesos ARG\n2. Ver tipos de cambio histórico\n3. Salir\n > ");
    }

    // Validador de entero ingresado por user
    public static int validarInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, ingrese un número valido.");
            sc.next(); // limpiar
        }
        return sc.nextInt();

    }

    // Mostrar el tipo de cambio historico, meses, divisas y valores.
    public static void tipoDeCambioHistorico() {
        // mostramos los meses primero:
        System.out.print("\nDivisa\t");
        for (int i = 0; i < MESES.length; i++) {
            System.out.print(String.format("%s\t", MESES[i]));
        }
        System.out.println();
        // mostramos los tipos de cambio con su divisa
        for (int i = 0; i < (DIVISAS.length); i++) {
            System.out.print(String.format("%s\t", DIVISAS[i]));
            for (int j = 0; j < (TIPOS_DE_CAMBIO[0].length); j++) {
                System.out.print(String.format("%.2f\t", TIPOS_DE_CAMBIO[i][j]));
            }
            System.out.println();
        }

    }

    public static void mostrarCambioDeDivisasMenu(Scanner sc) {

        boolean salida = true;

        // validamos que el usuario haya ingresado un monto correcto de pesos.
        System.out.print("Ingrese el dinero en pesos ARG\n $ ");
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número valido.");
            sc.next(); // limpiar
        }
        double pesosArg = sc.nextDouble();

        do {
            // mostramos menu de divisas disponibles
            MenuConversorDivisas.mostrarMenuDivisas();

            System.out.print("¿Qué deseas hacer?\n > ");
            int opcionMenuDivisas = validarInt(sc);

            // conversion de divis
            switch (opcionMenuDivisas) {
                // conversiones en caso de que el user elija de 1 a 5
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    MenuConversorDivisas.mostrarConversion(opcionMenuDivisas, pesosArg, TIPOS_DE_CAMBIO, MESES.length);
                    break;

                case 6:
                    tipoDeCambioHistorico(); // display de cambio historico
                    break;

                case 7: // salida de menu y vuelve al principal
                    salida = false;
                    break;
                default:
                    System.out.println("No ha ingresado un dato valido.");
            }
        } while (salida);

    }
}
