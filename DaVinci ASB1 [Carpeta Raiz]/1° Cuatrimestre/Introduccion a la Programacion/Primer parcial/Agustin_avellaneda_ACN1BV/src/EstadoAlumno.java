
/**
 * Agustin Avellaneda
 */
public class EstadoAlumno {
    public static void main(String[] args) throws Exception {

        // numero aleatorios para variable nota segun consigna:
        int nota1 = (int) (Math.random() * 10) + 1,
                nota2 = (int) (Math.random() * 10) + 1;

        System.out.println("Sus notas son: \"" + nota1 + "\" y \"" + nota2 + "\"");

        // despues de mostrar notas en consola, validamos para ver el estado del alumno
        // [0-3] desaprobado | [4-6] aprobado | [7-10] promocionado -
        // cumplir los rangos para ambas notas deben aplicar la promocion o aprobacion
        // de la materia
        if (nota1 >= 7 && nota2 >= 7) {
            System.out.println("Felicitaciones, ha promocionado la materia!");
        } else {
            // If anidado para evaluar si aprobo o desaprobo
            if (nota1 >= 4 && nota2 >= 4) {
                System.out.println("Ha aprobado la materia!");
            } else {
                System.out.println("Ha desaprobado la materia");
            }
        }

    }
}
