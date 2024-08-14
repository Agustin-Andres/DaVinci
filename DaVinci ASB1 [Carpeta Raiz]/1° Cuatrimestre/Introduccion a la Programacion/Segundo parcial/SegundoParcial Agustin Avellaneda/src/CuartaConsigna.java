
import java.util.Scanner;

public class CuartaConsigna {

    // Bastante ambigua la consigna, se codifico segun el ejemplo de 3 notas por
    // alumno, se puede moficiar para que el user ingrese cuantas notas tuvieron los
    // alumnos, pero respete el ejemplo

    // seria como el "main", parte de aca y llama a las funciones de esta clase.
    static public void notasAlumnos(Scanner sc) {

        // consultamos cuantos alumnos se evaluaran
        System.out.print("Cuantos alumnos desea evaluar? \n > ");
        int largoArreglo = MenuPrincipalSegundoParcial.validadorEntero(sc);

        String[] alumnos = new String[largoArreglo];
        int[][] notasAlumnos = new int[largoArreglo][3]; // aca, se cambia el 3 por la cant de evauaciones

        // ingresamos los nombres de los alumnos
        alumnos = popularAlumnos(alumnos, sc);
        MenuPrincipalSegundoParcial.insertarLinea();

        // llenamos la matriz de notas con valores aleatorios
        notasAlumnos = popularMatriz(notasAlumnos);

        // mostramos el output final despues de procesar los datos
        mostrarMatrizDeAlumnos(alumnos, notasAlumnos);

    }

    static public String[] popularAlumnos(String alumnos[], Scanner sc) {
        // llena el array con los nombres de alumnos
        for (int i = 1; i <= alumnos.length; i++) {
            System.out.print(String.format("Ingrese el nombre del alumno [%s / %s]\n > ", i, alumnos.length));
            alumnos[i - 1] = sc.next();
        }
        return alumnos;
    }

    static public int[][] popularMatriz(int matriz[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // generamos numeros aleatorios
                int randomNumber = (int) (Math.random() * 10) + 1;
                matriz[i][j] = randomNumber;
            }
        }
        return matriz;
    }

    static public void mostrarMatrizDeAlumnos(String alumnos[], int notas[][]) {

        for (int i = 0; i < notas.length; i++) {

            // mostramos el alumno y las notas de sus evaluaciones
            System.out.println(String.format("\nNotas de %s:", alumnos[i]));
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(String.format("%s\t", notas[i][j]));
            }

            // funcion para analizar las notas de forma individual, pasamos las notas y la
            // posicion de alumno, dentro de la funcion, se evalua todo del alumno
            System.out.println("\n" + analisisNotasDeAlumno(notas, i));
            System.out.println();
        }
    }

    static public String analisisNotasDeAlumno(int notas[][], int posicion) {

        // creamos array boolean para evaluar si aprobo la evaluacio o no
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

        // llamamos a la funcion pasando el arreglo boolean y el estado para modificar
        // la informacion que le mostraremos al user
        estadoExamenes = estadoGeneralDeAlumno(notaAprobada, estadoExamenes);
        return estadoExamenes;
    }

    public static String estadoGeneralDeAlumno(boolean[] notaAprobada, String estadoExamenes) {

        // nuevo String para ver cuales evaluaciones ha desaprobado, o si aprobo la
        // cursada
        String estadoAlumno = "";
        boolean todoAprobado = true;

        // for recorriendo las notas y evaluando si estan aprobadas o no
        // adicionalmente el estado del alumno se modifica, se concatena cual examen ha
        // desaprobado
        for (int i = 0; i < notaAprobada.length; i++) {

            if (!notaAprobada[i]) {

                todoAprobado = false;
                estadoAlumno = estadoAlumno + String.format(" #%s ", i + 1);
            }
        }

        // si esta todo aprobado, el estado del alumno es que aprobo
        if (todoAprobado) {

            estadoAlumno = "El alumno aprobó la cursada.";
        } else {

            // si desaprobo alguna evaluacion, se le indica por cual evaluacion debe
            // recuperar
            estadoAlumno = "El alumno debe ir al recuperatorio por la siguiente evaluacion/es: " + estadoAlumno;
        }

        // concatenamos el estado de las evaluaciones y el estado del alumno
        estadoExamenes = String.format("%s \n  > %s", estadoExamenes, estadoAlumno);
        return estadoExamenes;
    }
}
