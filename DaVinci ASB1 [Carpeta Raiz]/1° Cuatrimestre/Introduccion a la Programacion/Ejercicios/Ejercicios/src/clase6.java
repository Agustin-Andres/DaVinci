import java.util.Scanner;

public class clase6 {
    public static void main(String[] args) throws Exception {
            // Declaracion de variables y scanner
        int pass = 1234;
        int enteredPass;
        int dineroEnCuenta = 10000;
        int intentos = 0;
        Scanner input = new Scanner(System.in);

        //Bucle para ingresar a la cuenta 
        while(intentos<3){
            System.out.print("Ingrese su contraseña :");
            enteredPass = input.nextInt();

            //Condicional para evaluar si la pass ingresada es correcta o incorrecta- si es incorrecta ingresa al true
            if (enteredPass != pass) {

                //actualizamos los intentos y le indicamos que esta erronea la contraseña
                intentos++;
                System.out.println("Ha ingresado una contraseñaa erronea, tiene " + intentos + " restantes");

                // pedimos los datos nuevamente
                System.out.print("Ingrese su contraseña :");
                enteredPass = input.nextInt();
                if (enteredPass != pass) {
                   
                //actualizamos los intentos y le indicamos que esta erronea la contraseña
                intentos++;
                System.out.println("Ha ingresado una contraseñaa erronea, tiene " + intentos + " restantes");

                // pedimos los datos nuevamente
                System.out.print("Ingrese su contraseña :");
                enteredPass = input.nextInt(); 
                }




            } else {
                
                //ingreso correctamente
                System.out.println("Se ha loggeado correctamente.");
            }


        }




    }
}
