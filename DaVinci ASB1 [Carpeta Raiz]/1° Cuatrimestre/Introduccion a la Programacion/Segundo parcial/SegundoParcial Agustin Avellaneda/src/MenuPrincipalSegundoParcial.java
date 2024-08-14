
import java.util.Scanner;

public class MenuPrincipalSegundoParcial {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        boolean salida = true;
        int consignaSeleccionada = 0;

        // Mostramos las consignas del segundo Parcial
        menuConsignas();

        // case para evaluar que desea evaluar el user
        do {

            System.out.print("\nPor favor ingrese la consigna que desea evaluar: \n > ");
            consignaSeleccionada = validadorEntero(sc);

            switch (consignaSeleccionada) {

                case 1:
                    // Consigna 1
                    System.out.println("Ha seleccionado la primera consigna");
                    PrimeraConsinga.mayorNumeroIngresado(sc);
                    insertarLinea();
                    break;

                case 2:
                    // Consigna 2
                    System.out.println("Ha seleccionado la segunda consigna");
                    SegundaConsigna.tablaDeNumero(sc);
                    insertarLinea();
                    break;

                case 3:
                    // Consigna 3
                    System.out.println("Ha seleccionado la Tercera consigna");
                    TerceraConsigna.sumaTotalDeArray(sc);
                    insertarLinea();
                    break;

                case 4:
                    // Consigna 3
                    System.out.println("Ha seleccionado la Cuarta consigna");
                    CuartaConsigna.notasAlumnos(sc);
                    insertarLinea();
                    break;

                case 5:

                    System.out.println("El programa finalizara, muchas gracias");
                    salida = false;
                    insertarLinea();
                    break;

                default:
                    System.out.println("No se ha seleccionado una opcion correcta.");
                    menuConsignas();
                    insertarLinea();
            }

        } while (salida);

        sc.close();

    }

    // Menu de consignas

    public static void menuConsignas() {

        System.out.println("\n1 - Escribir un programa que tome números enteros hasta que el usuario " + //
                "ingrese 0 (cero) para finalizar el ciclo. Finalmente mostrar por pantalla" + //
                "el mayor de los números ingresados.");

        System.out.println("\n2 - Escribir un programa que imprima la tabla de un número ingresado por " + //
                "el usuario.");

        System.out.println("\n3 - Escribir un programa que tome un array de enteros y devuelva la suma " + //
                "de todos los elementos del array.");

        System.out.println("\n4 - Escribir un programa que reciba un array de String con nombres de " + //
                "alumnos. Y tres arrays de tipo int con la misma cantidad de posiciones," + //
                "y en donde cada una de estas posiciones debe coincidir con la de los " + //
                "alumnos .");
        System.out.println("\n5 - Finalizar Segundo parcial");

    }

    // validador de enteros

    public static int validadorEntero(Scanner sc) {

        while (!sc.hasNextInt()) {

            // validacion es por si el usuario NO ingresa un INT
            System.out.print("Por favor, ingrese un número valido. \n > ");
            sc.next(); // limpiar
        }

        int entero = sc.nextInt();
        return entero;
    }

    // para segmentar un poco mas la consola. Hacerlo legible
    public static void insertarLinea() {

        String line = "_";
        for (int i = 0; i < 75; i++) {

            System.out.print(line);
        }

    };

}
