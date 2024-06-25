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

        boolean salida = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor de Divisas!");
        // bucle para el menu
        do {
            System.out.println("¿Qué deseas hacer?");
            mostrarMenuPrincipal();
            // validacion es por si el usuario NO ingresa un INT, para el menu principal
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingrese un número valido.");
                sc.next(); // limpiar
            }
            int opcionMenuPrincipal = sc.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    // Codigo por este caso
                    break;
                case 2:
                    System.out.println("Cambio de tipos de cambio histórico");
                    break;
                case 3:
                    System.out.println("Ha solicitado la finalizacion del programa, saludos!");
                    salida = false;
                    break;
                default:
                    System.out.println("No ha ingresado un dato valido.");
            }

        } while (salida);

    }

    // metodos
    public static void mostrarMenuPrincipal() {
        System.out.println("1. Ingrese el dinero en pesos ARG\n2. Ver tipos de cambio histórico\n3. Salir");
    }

    public static void tipoDeCambioHistorico(){

    }

}
