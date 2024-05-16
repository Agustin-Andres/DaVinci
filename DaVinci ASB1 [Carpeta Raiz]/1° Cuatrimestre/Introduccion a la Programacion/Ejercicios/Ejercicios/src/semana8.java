import java.util.Scanner;

public class semana8 {

    /*
     * Máximos y mínimos
     * Dado el sueldo de n personas, te pedimos obtener:
     * • La cantidad de desocupados, la cantidad que cobran hasta 500$,
     * la cantidad que cobran entre 500 y 1000, la cantidad entre 1000 y
     * 2000, y los que superan los 2000
     * • El sueldo máximo y el nombre de la persona de sueldo máximo
     * • Total de sueldos pagados
     */
    public static void main(String[] args) {

        int cantPersonas, cantDesocupados, contador;
        String nombre = "";
        double sueldo = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Cuantas personas seran cargadas?");
        contador = sc.nextInt();

        do {
            System.out.println("Ingrese el nombre del empleado");
            nombre = sc.next();

            System.out.println("");
            sueldo = sc.nextDouble();

            if () {
                
            } else {
            }

        } while (contador != 0);
    }
}
