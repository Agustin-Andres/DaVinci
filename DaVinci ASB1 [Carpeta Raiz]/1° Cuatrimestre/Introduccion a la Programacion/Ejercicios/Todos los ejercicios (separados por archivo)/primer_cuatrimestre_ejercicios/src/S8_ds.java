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
                // code block
                break;
            default:
                // code block
        }
    }
}
