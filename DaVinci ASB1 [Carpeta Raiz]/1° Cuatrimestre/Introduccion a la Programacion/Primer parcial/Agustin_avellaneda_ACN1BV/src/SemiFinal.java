
/**
 * Semifinal
 */
public class SemiFinal {

    public static void main(String[] args) {
        // Declaracion de variables || equipo goles y acumuladores en el caso de
        // penales.
        int argentinaGoles, argentinaAcumulador = 0;
        int croaciaGoles, croaciaAcumulador = 0;
        int marruecosGoles, marruecosAcumulador = 0;
        int franciaGoles, franciaAcumulador = 0;

        int contador = 0;
        String finalista1 = "";
        String finalista2 = "";

        // ##############################################################################################
        // Primera partida
        System.out.println("Primer partido, Argentina vs Croacia");
        argentinaGoles = (int) (Math.random() * 6) + 1;
        croaciaGoles = (int) (Math.random() * 6) + 1;
        System.out.println(" > Finalizo la partida! Argentina: " + argentinaGoles + " | Croacia: " + croaciaGoles);

        // Condicional para validar si se va a penales o no.
        if (argentinaGoles == croaciaGoles) {
            System.out.println("El primer partido fue empatado!! " + argentinaGoles + " a " + croaciaGoles + "\nSe iran a penales");

            // PENALES
            // Contador para los 5 tiros
            while (contador < 5) {
                argentinaAcumulador += (int) (Math.random() * 2);
                croaciaAcumulador += (int) (Math.random() * 2);
                contador++;
                System.out.println("Argentina: " + argentinaAcumulador + " | Croacia: " + croaciaAcumulador);
            }

            // Condicionar para evaluar si empataron o no
            if (argentinaAcumulador == croaciaAcumulador) {
                System.out.println("Han empatado los penales! El proximo a meter el gol gana!");
                // Restablecemos acumulador, asi entra en el bucle
                argentinaAcumulador = 0;
                croaciaAcumulador = 0;
                while (argentinaAcumulador == croaciaAcumulador) {
                    argentinaAcumulador += (int) (Math.random() * 2);
                    croaciaAcumulador += (int) (Math.random() * 2);
                    System.out.println(
                            " # PENALES Argentina: " + argentinaAcumulador + " | Croacia: " + croaciaAcumulador);

                }
            }
            // Mostramos el resultado y asignamos el ganador a la variable finalista1
            if (argentinaAcumulador > croaciaAcumulador) {
                System.out.println("El primer finalista es Argentina!");
                finalista1 = "Argentina";

            } else {
                System.out.println("El primer finalista es Croacia!");
                finalista1 = "Croacia";

            }

        } else {
            // else para asignar el finalista por que quien gano sin ir a penales
            if (argentinaGoles > croaciaGoles) {
                System.out.println("El primer finalista es Argentina!");
                finalista1 = "Argentina";

            } else {
                System.out.println("El primer finalista es Croacia!");
                finalista1 = "Croacia";
            }
        }

        // ##############################################################################################
        // Segunda partida
        contador = 0;
        System.out.println("\nSegundo partido, Francia vs Marruecos");
        franciaGoles = (int) (Math.random() * 6) + 1;
        marruecosGoles = (int) (Math.random() * 6) + 1;
        System.out.println(" > Finalizo la partida! Francia: " + franciaGoles + " | Marruecos: " + marruecosGoles);

        // Condicional para validar si se va a penales o no.
        if (franciaGoles == marruecosGoles) {
            System.out.println("Han empatado!!" + franciaGoles + " a " + marruecosGoles + "\nSe iran a penales");

            // PENALES
            // Contador para los 5 tiros
            while (contador < 5) {
                franciaAcumulador += (int) (Math.random() * 2);
                marruecosAcumulador += (int) (Math.random() * 2);
                contador++;
                System.out.println("Francia: " + franciaAcumulador + " | Marruecos: " + marruecosAcumulador);
            }

            // Condicionar para evaluar si empataron o no
            if (franciaAcumulador == marruecosAcumulador) {
                System.out.println("Han empatado los penales! El proximo a meter el gol gana!");
                franciaAcumulador = 0;
                marruecosAcumulador = 0;
                while (franciaAcumulador == marruecosAcumulador) {
                    franciaAcumulador += (int) (Math.random() * 2);
                    marruecosAcumulador += (int) (Math.random() * 2);
                    System.out.println(
                            " # PENALES Francia: " + franciaAcumulador + " | Marruecos: " + marruecosAcumulador);

                }
            }
            // Mostramos el resultado y asignamos el ganador a la variable finalista1
            if (franciaAcumulador > marruecosAcumulador) {
                System.out.println("El segundo finalista es Francia!");
                finalista2 = "Francia";
            } else {
                System.out.println("El segundo finalista es Marruecos!");
                finalista2 = "Marriecos";

            }

        } else {
            // else para asignar el finalista por que quien gano sin ir a penales
            if (franciaGoles > marruecosGoles) {
                System.out.println("El segundo finalista es Francia!");
                finalista2 = "Francia";

            } else {
                System.out.println("El segundo finalista es Marruecos!");
                finalista2 = "Marriecos";
            }
        }

    }
}
