import java.util.Scanner;

/*
1. ¡Adiviná el número! Genera un número aleatorio entre 1 y 100 y pedí
al usuario que adivine el número generado. Si el usuario adivina
correctamente, se mostrará un mensaje de felicitación. Si no adivina, se
le indicará si el número que ingresó es mayor o menor al número
generado. Desarrollar diagrama y luego escribir en Java.

###############################################################
2. Cálculo de promedio: Pedí al usuario que ingrese una serie de
números (uno por uno) hasta que ingrese un número negativo. Utiliza un
ciclo while o do-while para calcular el promedio de los números
ingresados (sin incluir el número negativo) y mostrarlo en pantalla.
Desarrollá el diagrama y luego escribí en Java.

###############################################################
3. Se tiene la nota de un grupo de estudiantes. Te pedimos determinar
cuántos aprobaron (nota > 4), de éstos cuántos deben presentar TP
(nota >= 7) y cuántos rinden escrito (nota <7) y cuántos desaprobaron.
Para finalizar ingresar una nota negativa. */

public class S9_ds {
    public static void main(String[] args) {

        System.out.println("Desafio Semanal (Semana 9)");
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
                System.out.println("Desafio 1 [Adivina el numero]");
                int randomNumber = (int) (Math.random() * 101);
                int numUsuario;
                System.out.println("Adivina el numero aleatorio entre 0 y 100!");

                do {
                    System.out.println("Ingrese su adivinanza ");

                    while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                        System.out.println("Por favor, ingrese un número valido.");
                        sc.next(); // limpiar
                    }
                    numUsuario = sc.nextInt();

                    // mostar si es mayor o menor al numero aleatorio
                    if (numUsuario < randomNumber) {
                        System.out.println("##El numero ingresado es menor que el numero aleatorio");

                    } else if (numUsuario > randomNumber) {
                        System.out.println("##El numero ingresado es mayor que el numero aleatorio");
                    } else {
                        System.out.println("Ha Adivinado correctamente!!");
                    }

                } while (randomNumber != numUsuario);

                break;
            case 2:
                System.out.println("Desafio 2 [Promedio]");
                int numero;
                int cantNumeros = 0;
                int acumulador = 0;
                double promedio;

                do {
                    System.out.println("Ingrese un numero: ");
                    numero = sc.nextInt();
                    if (numero < 0) {
                        System.out.println("Finalizamos el bucle.");
                        break;

                    } else {

                        cantNumeros = cantNumeros + 1;
                        acumulador = acumulador + numero;

                    }

                } while (true);

                promedio = (double) (acumulador / cantNumeros);
                System.out.println("el promedio es:" + promedio);

                break;
            case 3:
                System.out.println("Desafio 3 [Estudiantes]");
                int cantEstudiantes = 0,
                        acumuladorAprobados = 0,
                        acumuladorDesaprobados = 0,
                        acumuladorTp = 0,
                        acumuladorEscritos =0,
                        nota = 0;

                while (nota > 0) {
                    System.out.println("Ingrese la nota del estudiante:");
                    while (!sc.hasNextInt()) { // validacion es por si el usuario NO ingresa un INT
                        System.out.println("Por favor, ingrese un número valido.");
                        sc.next(); // limpiar
                    }
                    nota = sc.nextInt();
                    if (nota < 0) {
                        System.out.println("Ha ingresado un valor negativo.");

                    } else if(nota > 4){
                        System.out.println("El estudiante ha aprobado!");
                        acumuladorAprobados++;
                    }
                    else if(nota >= 7)  {
                        System.out.println("El estudiante debe presentar el TP");
                        acumuladorTp++;
                    }else if(nota <7){
                        System.out.println("El estudiante debe presentar el escrito");
                        acumuladorEscritos++;
                    }else{
                        System.out.println("El estudiante ha desaprobado");
                        acumuladorDesaprobados++;
                    }
                    cantEstudiantes++;

                }
                System.out.println("Cantidad de estudiantes:" + cantEstudiantes);
                System.out.println("Cantidad de desaprobados: " + acumuladorDesaprobados);
                System.out.println("Cantidad de aprobados: " + acumuladorAprobados);
                System.out.println("Cantidad que deben rendir escrito: " + acumuladorEscritos);
                System.out.println("Cantidad que deben presentar el tp: " + acumuladorTp);

                break;
            default:
                // Codigo por este caso
        }

    }

}
