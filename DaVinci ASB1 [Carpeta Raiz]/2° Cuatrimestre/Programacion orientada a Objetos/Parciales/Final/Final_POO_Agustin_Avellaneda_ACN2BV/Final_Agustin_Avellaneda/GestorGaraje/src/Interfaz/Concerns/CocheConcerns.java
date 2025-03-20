package Interfaz.Concerns;

import Vehiculos.Coche;
import Vehiculos.Vehiculo;
import java.util.List;
import java.util.Scanner;
import utilities.*;

public class CocheConcerns {

    // establecemos que no ingresen un numero que nada que ver
    private static final int CANTIDAD_DE_PUERTAS_COCHE = 5;

    // metodo de ingreso de coche para ingreso de vehiculo
    public static Coche ingresoCoche(List<Vehiculo> vehiculos, Double precioDiario, Scanner sc) {

        System.out.println("\n-- Iniciando Gestion de ingreso de un Coche --");
        Coche cocheAIngresar = new Coche();

        // obtenemos los datos hasta que todos sean validos
        while (true) {

            System.out.print("\nIngrese las ruedas a trabajar \n> ");
            int cantidadDeRuedasATrabajar = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la cantidad de ruedas trabajadas \n> ");
            int cantidadDeRuedasTrabajadas = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la marca del Coche \n> ");
            String marca = sc.nextLine().trim();

            System.out.print("\nIngrese la patente del Coche \n> ");
            String patente = sc.nextLine().trim();

            System.out.print("\nIngrese el kilometraje del Coche \n> ");
            Double kilometraje = ValidadorNumeros.validarFloat(sc);

            System.out.print("\nIngrese la cantidad de puertas del Coche \n> ");
            int cantidadPuertas = ValidadorNumeros.validarEntero(sc);

            // Validacionnes
            // validamos algunas restricciones logicas de ruedas
            if (!VehiculosConcerns.validarRuedasVehiculo(cocheAIngresar, cantidadDeRuedasTrabajadas,
                    cantidadDeRuedasATrabajar)) {
                // dejamos vacio porque los mensajes estan en validacioRuedasMoto dentro de
                // concerns.
            } else if (kilometraje < 0) {
                System.out.println("#Error en carga de datos: El kilometraje no puede ser un numero negativo");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (cantidadPuertas < 0 || cantidadPuertas > CANTIDAD_DE_PUERTAS_COCHE) {
                System.out
                        .println("#Error en carga de datos: se ingreso una cifra erronea para la cantidad de puertas.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (!ValidadorVehiculo.validarPatente(vehiculos, patente) || patente == null || patente.equals("")) {
                System.out.println("#Error en carga de datos: La patente es invalida.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (marca == null || marca.equals("")) {
                System.out.println("#Error en carga de datos: La marca no puede estar vacia.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else {

                // creamos el objeto con los datos validos y luego calculamos los montos de
                // recaudo
                cocheAIngresar = new Coche(cantidadDeRuedasATrabajar, cantidadDeRuedasTrabajadas, kilometraje, patente,
                        marca, cantidadPuertas);

                // calculamos lo que se debe cobrar y las ryuedas que pago
                System.out
                        .print("\nEl titular ya ha abonado [ si | no ] ?\n> ");
                boolean fueCobrado = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

                VehiculosConcerns.cantidadDeRuedasPagas(cocheAIngresar, sc, precioDiario, fueCobrado);
                cocheAIngresar.calcularMontoACobrar(precioDiario);

                // output para confirmacion del user
                System.out.println("Los datos del coche son:");
                System.out.println(cocheAIngresar);

                // consultamos por confirmacion
                System.out.print("\n> Confirma el ingreso del coche? [ si | no ]\n> ");
                if (ValidadorVehiculo.validadorBooleanoConfirmacion(sc)) {
                    System.out.println("Coche almacenado exitosamente");
                    break;

                } else {
                    System.out.println("Reiniciando carga de datos de coche..\n");
                }
            }

        }
        return cocheAIngresar;

    };

    // update - nos limitamos a no actualizar datos enduro como marca, kilometraje,
    // patente, cantidad de puertas
    // no tiene logica actualizar esos datos debido a que se settearon en el ingreso
    // y no hay por que cambiarlos
    public static void actualizarCoche(List<Vehiculo> vehiculos, Coche cocheActualizar, Double precioDiario,
            Scanner sc) {

        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println("\n--           Iniciando Gestion de actualizacion de un Coche                --");
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(cocheActualizar);

        while (true) {

            System.out.print(
                    "\nCuantas ruedas quedan por trabajar? [Antes: " + cocheActualizar.getCantidadRuedasATrabajar()
                            + "] \n> ");
            int cantidadDeRuedasATrabajar = ValidadorNumeros.validarEntero(sc);

            System.out
                    .print("\nCuantas ruedas fueron trabajadas? [Antes: "
                            + cocheActualizar.getCantidadRuedasTrabajadas()
                            + "] \n> ");
            int cantidadDeRuedasTrabajadas = ValidadorNumeros.validarEntero(sc);

            // Validacionnes
            // validamos algunas restricciones logicas de ruedas
            if (!VehiculosConcerns.validarRuedasVehiculo(cocheActualizar, cantidadDeRuedasTrabajadas,
                    cantidadDeRuedasATrabajar)) {
                // dejamos vacio porque los mensajes estan en validacioRuedasMoto dentro de
                // concerns.

            } else {

                // calculamos lo que se debe cobrar y las ruedas que pago
                System.out
                        .print("\nEl titular ya ha abonado [ si | no ] ?\n> ");
                boolean fueCobrado = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

                VehiculosConcerns.cantidadDeRuedasPagas(cocheActualizar, sc, precioDiario, fueCobrado);
                cocheActualizar.calcularMontoACobrar(precioDiario);

                // output para confirmacion del user
                System.out.println("Los datos actualizados del coche son:");
                System.out.println(cocheActualizar);

                // consultamos por confirmacion
                System.out.print("\n> Confirma la actualizacion del coche? [ si | no ]\n> ");
                if (ValidadorVehiculo.validadorBooleanoConfirmacion(sc)) {
                    System.out.println("Coche actualizado exitosamente");
                    break;

                } else {
                    System.out.println("Reiniciando carga de datos de coche..\n");
                }

            }

        }
    }

}
