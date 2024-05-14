import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Agustin Avellaneda
 */
public class SemiFinal {

    public static void main(String[] args) {
        // Declaracion de variables || equipo goles y acumuladores en el caso de
        // penales.
        int argentinaGoles, argentinaAcumulador = 0;
        int croaciaGoles, croaciaAcumulador = 0;
        int marruecosGoles, marruecosAcumulador = 0;
        int franciaGoles, franciaAcumulador = 0;

        // ImageIcon para obtener la bandera de cada equipo
        ImageIcon argentina = new ImageIcon("src/banderasPaises/Argentina.png");
        ImageIcon croacia = new ImageIcon("src/banderasPaises/Croacia.png");
        ImageIcon francia = new ImageIcon("src/banderasPaises/Francia.png");
        ImageIcon marruecos = new ImageIcon("src/banderasPaises/Marruecos.png");

        int contador = 0;
        String finalista1 = "";
        String finalista2 = "";

        // ##############################################################################################

        // Primera partida
        JOptionPane.showMessageDialog(null, "Argentina vs Croacia", "Primer Partido", JOptionPane.INFORMATION_MESSAGE);
        argentinaGoles = (int) (Math.random() * 6) + 1;
        croaciaGoles = (int) (Math.random() * 6) + 1;

        // Condicional para validar si se va a penales o no.
        if (argentinaGoles == croaciaGoles) {
            JOptionPane.showMessageDialog(null,
                    "El partido fue empatado! Argentina: " + argentinaGoles + " | Croacia: " + croaciaGoles,
                    "Primer Partido", JOptionPane.INFORMATION_MESSAGE);

            // PENALES
            // Bucle para los penales
            while (contador < 5) {
                argentinaAcumulador += (int) (Math.random() * 2);
                croaciaAcumulador += (int) (Math.random() * 2);
                contador++;
                // System.out.println("Argentina: " + argentinaAcumulador + " | Croacia: " +
                // croaciaAcumulador);
            }

            // Condicionar para evaluar si empataron o no
            if (argentinaAcumulador == croaciaAcumulador) {
                //Mostramos el resultado de los penales.
                JOptionPane.showMessageDialog(null,
                        "Han empatado los penales!!\n Argentina: " + argentinaAcumulador + " | Croacia: "
                                + croaciaAcumulador + "\nEl proximo gol gana!",
                        "Primer Partido", JOptionPane.INFORMATION_MESSAGE);

                // Restablecemos acumulador, asi entra en el bucle
                argentinaAcumulador = 0;
                croaciaAcumulador = 0;

                //bucle para desempate, sigue hasta que ambos equipos sean DISINTOS
                while (argentinaAcumulador == croaciaAcumulador) {
                    argentinaAcumulador += (int) (Math.random() * 2);
                    croaciaAcumulador += (int) (Math.random() * 2);


                }
            }

            // Mostramos el resultado del ganador y asignamos el ganador a la variable finalista1
            if (argentinaAcumulador > croaciaAcumulador) {
                // mostrar la bandera del finalista y asignarlo a una variable finalista
                JOptionPane.showMessageDialog(null, "Argentina gano los penales!!\nArgentina Finalista", "Primer Finalista",
                        JOptionPane.INFORMATION_MESSAGE, argentina);
                finalista1 = "Argentina";

            } else {
                JOptionPane.showMessageDialog(null, "Croacia ha ganado los penales!\nCroacia Finalista", "Primer Finalista",
                        JOptionPane.INFORMATION_MESSAGE, croacia);
                finalista1 = "Croacia";

            }

        } else {
            // informar al usuario de quien ha ganado por goles, el resultado y luego la
            // bandera del pais
            JOptionPane.showMessageDialog(null,
                    "Ha finalizado el partido!! Argentina: " + argentinaGoles + " | Croacia: " + croaciaGoles,
                    "Primer Partido", JOptionPane.INFORMATION_MESSAGE);

            // else para asignar el finalista por que quien gano sin ir a penales
            if (argentinaGoles > croaciaGoles) {

                JOptionPane.showMessageDialog(null, "Argentina Finalista", "Primer Finalista",
                        JOptionPane.INFORMATION_MESSAGE, argentina);
                finalista1 = "Argentina";

            } else {

                JOptionPane.showMessageDialog(null, "Croacia Finalista", "Primer Finalista",
                        JOptionPane.INFORMATION_MESSAGE, croacia);
                finalista1 = "Croacia";
            }
        }

        // ########################################################################################################################

        // Segundo partido
        contador = 0;
        JOptionPane.showMessageDialog(null, "Francia vs Marruecos", "Segundo Partido", JOptionPane.INFORMATION_MESSAGE);
        franciaGoles = (int) (Math.random() * 6) + 1;
        marruecosGoles = (int) (Math.random() * 6) + 1;

        // Condicional para validar si se va a penales o no.
        if (franciaGoles == marruecosGoles) {
            JOptionPane.showMessageDialog(null,
            "El segundo partido fue empatado! Francia: " + franciaGoles + " | Marruecos: " + marruecosGoles,
            "Segundo Partido", JOptionPane.INFORMATION_MESSAGE);

            // PENALES
            // Bucle para el penal
            while (contador < 5) {
                franciaAcumulador += (int) (Math.random() * 2);
                marruecosAcumulador += (int) (Math.random() * 2);
                contador++;
                // System.out.println("Francia: " + franciaAcumulador + " | Marruecos: " +
                // marruecosAcumulador);
            }

            // Condicionar para evaluar si empataron los penales o no
            if (franciaAcumulador == marruecosAcumulador) {
                JOptionPane.showMessageDialog(null,
                        "Han empatado los penales!!\n Francia: " + franciaAcumulador + " | Marruecos: "
                                + marruecosAcumulador + "\nEl proximo gol gana!",
                        "Primer Partido", JOptionPane.INFORMATION_MESSAGE);

                franciaAcumulador = 0;
                marruecosAcumulador = 0;

                // Bucle para que se repita hasta que uno de los dos gane
                while (franciaAcumulador == marruecosAcumulador) {
                    franciaAcumulador += (int) (Math.random() * 2);
                    marruecosAcumulador += (int) (Math.random() * 2);

                }
            }

            // Mostramos el resultado y asignamos el ganador a la variable finalista2
            if (franciaAcumulador > marruecosAcumulador) {
                JOptionPane.showMessageDialog(null, "Francia ha ganado los penales !\nFrancia Finalista", "Segundo Finalista",
                        JOptionPane.INFORMATION_MESSAGE, francia);
                finalista2 = "Francia";
            } else {
                JOptionPane.showMessageDialog(null, "Marruecos ha ganado los penales!\nMarruecos Finalista", "Segundo Finalista",
                        JOptionPane.INFORMATION_MESSAGE, marruecos);
                finalista2 = "Marruecos";

            }

        } else {
          // informar al usuario de quien ha ganado por goles, el resultado y luego la
            // bandera del pais
            JOptionPane.showMessageDialog(null,
                    "Ha finalizado el partido!! Francia: " + franciaGoles + " | Marruecos: " + marruecosGoles,
                    "Segundo Partido", JOptionPane.INFORMATION_MESSAGE);

            // else para asignar el finalista por que quien gano sin ir a penales
            if (franciaGoles > marruecosGoles) {
                JOptionPane.showMessageDialog(null, "Francia Finalista", "Segundo Finalista",
                        JOptionPane.INFORMATION_MESSAGE, francia);
                finalista2 = "Francia";

            } else {
                JOptionPane.showMessageDialog(null, "Marruecos Finalista", "Segundo Finalista",
                        JOptionPane.INFORMATION_MESSAGE, marruecos);
                finalista2 = "Marruecos";
            }
        }

        JOptionPane.showMessageDialog(null,
        "La final se jugara en el proximo parcial!\nLos semifinalistas son: " + finalista1 + " y "+ finalista2,
        "Final", JOptionPane.INFORMATION_MESSAGE);

    }
}
