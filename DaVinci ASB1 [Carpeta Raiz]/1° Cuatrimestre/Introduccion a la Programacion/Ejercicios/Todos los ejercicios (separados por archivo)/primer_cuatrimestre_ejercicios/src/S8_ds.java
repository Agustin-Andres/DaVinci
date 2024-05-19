import java.util.Scanner;

public class S8_ds {
    /*
     * 1. Ciclos for -
     * Generar 100 números al azar y verificar la cantidad que salieron entre 0
     * y 25, la cantidad entre 25 y 50, la cantidad entre 50 y 75 y la cantidad
     * entre 75 y 100
     * ############################################################################
     *
     * 2. Máximos y mínimos
     * Dado el sueldo de n personas, te pedimos obtener:
     * • La cantidad de desocupados, la cantidad que cobran hasta 500$,
     * la cantidad que cobran entre 500 y 1000, la cantidad entre 1000 y
     * 2000, y los que superan los 2000
     * • El sueldo máximo y el nombre de la persona de sueldo máximo
     * • Total de sueldos pagados
     * ############################################################################
     *
     * 3. Máximos y mínimos
     * Dados n números enteros ingresados (cantidad a ingresar pedida
     * previamente) calcular el rango. (Rango: es la diferencia entre el número
     * mayor y el menor)
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Desafio Semanal (Semana 8)");
        System.out.println("Cual ejercicio desea realizar?");

        int desafioElegido;
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
            System.out.println("Por favor, ingrese un número valido.");
            sc.next(); // limpiar
        }
        desafioElegido = sc.nextInt();

        switch (desafioElegido) {
            case 1:
                // variables para ejercicio 1
                int acumulador25 = 0, acumulador50 = 0, acumulador75 = 0, acumulador100 = 0;
                for (int i = 0; i < 100; i++) {
                    int numAleatorio = (int) (Math.random() * 101);

                    // validador para acumular los numeros:
                    if (numAleatorio < 25) {
                        acumulador25++;
                    } else if (numAleatorio < 50) {
                        acumulador50++;
                    } else if (numAleatorio < 75) {
                        acumulador75++;
                    } else {
                        acumulador100++;
                    }

                }
                System.out.println("100 numero generados aleatoriamente.");
                System.out.println("Numeros entre 0 y 24: " + acumulador25);
                System.out.println("Numeros entre 25 y 49: " + acumulador50);
                System.out.println("Numeros entre 50 y 74: " + acumulador75);
                System.out.println("Numeros entre 75 y 100 : " + acumulador100);
                break;
            case 2:
                int desocupados = 0;
                int primerRango = 0;
                int segundoRango = 0;
                int tercerRango = 0;
                int cuartoRango = 0;

                double sueldoMaximo = -999999.0;
                String nombreSueldoMaximo = null;

                int totalSueldosPagados = 0;

                // Obtener las n personas
                System.out.println("Ingrese la cantidad de personas: ");
                int cantidadPersonas = sc.nextInt();

                sc.next();

                for (int i = 0; i < cantidadPersonas; i++) {
                    System.out.println("Ingrese el nombre de la persona " + (i + 1) + ": ");
                    String nombre = sc.next();

                    System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ": ");
                    Double sueldo = sc.nextDouble();

                    if (sueldo == 0) {
                        desocupados++;
                    } else if (sueldo < 500) {
                        primerRango++; // hasta 500
                    } else if (sueldo < 1000) {
                        segundoRango++; // entre 500 y 1000
                    } else if (sueldo <= 2000) {
                        tercerRango++; // entre 1000 y 2000
                    } else {
                        cuartoRango++; // mayor a 2000
                    }

                    // El sueldo máximo y el nombre de la persona de sueldo máximo
                    if (sueldo > sueldoMaximo && sueldo > 0) {
                        sueldoMaximo = sueldo;
                        nombreSueldoMaximo = nombre;
                    }

                    // • Total de sueldos pagados - OPCION 1
                    if (sueldo > 0) {
                        totalSueldosPagados++;
                    }
                }
                break;
            case 3:
                // variables ejercicio 3
                int minimo = 0, maximo = 0;
                int num = 0;

                System.out.println("Cuantos numeros seran ingresados? ");
                while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                    System.out.println("Por favor, ingrese un número valido.");
                    sc.next(); // limpiar
                }

                int numerosIngresados = sc.nextInt();

                for (int i = 0; i < numerosIngresados; i++) {

                    System.out.print("Ingrese un numero: ");
                    while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                        System.out.println("Por favor, ingrese un número valido.");
                        sc.next(); // limpiar
                    }
                    num = sc.nextInt();
                    if (i == 0) {
                        minimo = num;
                        maximo = num;
                    } else {
                        if (num < minimo) {
                            minimo = num;
                        }
                        if (maximo < num) {
                            maximo = num;
                        }
                    }

                }
                int rango = maximo - minimo;
                System.out.println("El minimo es: " + minimo + " y el maximo es: " + maximo);
                System.out.println("El rango es: " + rango);
                break;
            default:
                // code block
        }
    }
}
