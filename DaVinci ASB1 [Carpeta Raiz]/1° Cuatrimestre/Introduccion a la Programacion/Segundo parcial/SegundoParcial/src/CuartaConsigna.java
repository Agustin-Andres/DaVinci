
import java.util.Scanner;

public class CuartaConsigna {

    static public void notasAlumnos(Scanner sc) {
        System.out.print("Cuantos alumnos desea evaluar? \n > ");
        int largoArreglo = MenuPrincipalSegundoParcial.validadorEntero(sc);

        String[] alumnos = new String[largoArreglo];
        int[][] notasAlumnos = new int[largoArreglo][3];

        // ingresamos los nombres de los alumnos
        alumnos = popularAlumnos(alumnos, sc);
        MenuPrincipalSegundoParcial.insertarLinea();
        // llenamos la matriz de notas con valores aleatorios
        notasAlumnos = popularMatriz(notasAlumnos);
        mostrarMatrizDeAlumnos(alumnos, notasAlumnos);

    }

    static public String[] popularAlumnos(String alumnos[], Scanner sc) {
        for (int i = 1; i <= alumnos.length; i++) {
            System.out.print(String.format("Ingrese el nombre del alumno [%s / %s]\n > ", i, alumnos.length));
            alumnos[i - 1] = sc.next();
        }
        return alumnos;
    }

    static public int[][] popularMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int randomNumber = (int) (Math.random() * 10) + 1;
                matriz[i][j] = randomNumber;
            }
        }
        return matriz;
    }

    static public void mostrarMatrizDeAlumnos(String alumnos[], int notas[][]) {

        for (int i = 0; i < notas.length; i++) {
            System.out.println(String.format("\nNotas de %s:", alumnos[i]));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(String.format("%s\t", notas[i][j]));
            }
            System.out.println("\n" + analisisNotasDeAlumno(notas, i));
            System.out.println();
        }
    }

    static public String analisisNotasDeAlumno(int notas[][], int posicion) {

        boolean[] notaAprobada = new boolean[notas[posicion].length];

        String estadoExamenes = " ## Estado de evaluaciones de alumno: ";

        // evaluamos cuales evaluaciones ha aprobado
        for (int i = 0; i < notaAprobada.length; i++) {
            if (notas[posicion][i] > 3) {
                notaAprobada[i] = true;
                estadoExamenes = estadoExamenes + String.format("%s° aprobada | ", i + 1);
            } else {
                notaAprobada[i] = false;
                estadoExamenes = estadoExamenes + String.format("%s° desaprobada | ", i + 1);
            }
        }
        estadoExamenes = estadoGeneralDeAlumno(notaAprobada, estadoExamenes);
        return estadoExamenes;
    }

    public static String estadoGeneralDeAlumno(boolean[] notaAprobada, String estadoExamenes) {
        String estadoAlumno = "";
        boolean todoAprobado = true;

        for (int i = 0; i < notaAprobada.length; i++) {
            if (!notaAprobada[i]) {
                todoAprobado = false;
                estadoAlumno = estadoAlumno + String.format(" #%s ", i + 1);
            }
        }
        if (todoAprobado) {
            estadoAlumno = "El alumno aprobó la cursada.";
        } else {
            estadoAlumno = "El alumno debe ir al recuperatorio por la siguiente evaluacion/es: " + estadoAlumno;
        }

        estadoExamenes = String.format("%s \n  > %s", estadoExamenes, estadoAlumno);
        return estadoExamenes;
    }
}
