package Interfaz.Concerns;

import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import java.util.List;
import java.util.Scanner;
import utilities.*;

public class MotoConcerns {

    // metodo de ingreso moto para ingreso de vehiculo
    public static Moto ingresoMoto(List<Vehiculo> vehiculos, Double precioDiario, Scanner sc) {

        System.out.println("\n-- Iniciando Gestion de ingreso de una Moto --");
        Moto motoAIngresar = new Moto();

        // obtenemos los datos hasta que todos sean validos
        while (true) {

            System.out.print("\nIngrese las ruedas a trabajar \n> ");
            int cantidadDeRuedasATrabajar = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la cantidad de ruedas trabajadas \n> ");
            int cantidadDeRuedasTrabajadas = ValidadorNumeros.validarEntero(sc);

            System.out.print("\nIngrese la marca de la moto \n> ");
            String marca = sc.nextLine().trim();

            System.out.print("\nIngrese la patente de la moto \n> ");
            String patente = sc.nextLine().trim();

            System.out.print("\nIngrese el kilometraje de la moto \n> ");
            Double kilometraje = ValidadorNumeros.validarFloat(sc);

            System.out.print("\nIngrese el cilindraje de la moto \n> ");
            int cilindrada = ValidadorNumeros.validarEntero(sc);

            // Validacionnes
            // validamos algunas restricciones logicas de ruedas
            if (!VehiculosConcerns.validarRuedasVehiculo(motoAIngresar, cantidadDeRuedasTrabajadas,
                    cantidadDeRuedasATrabajar)) {
                // dejamos vacio porque los mensajes estan en validarRuedasVehiculo dentro de
                // concerns.
            } else if (kilometraje < 0) {
                System.out.println("#Error en carga de datos: El kilometraje no puede ser un numero negativo");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (cilindrada < 0) {
                System.out.println("#Error en carga de datos: El Cilindraje no puede ser un numero negativo");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (!VehiculosConcerns.validarPatente(vehiculos, patente) || patente == null || patente.equals("")) {
                System.out.println("#Error en carga de datos: La patente es invalida.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else if (marca == null || marca.equals("")) {
                System.out.println("#Error en carga de datos: La marca no puede estar vacia.");
                System.out.println("\t> Reiniciando la carga de datos...\n");

            } else {

                // creamos el objeto con los datos validos y luego calculamos los montos de
                // recaudo
                motoAIngresar = new Moto(cantidadDeRuedasATrabajar, cantidadDeRuedasTrabajadas, kilometraje, patente,
                        marca, cilindrada, precioDiario);

                // calculamos lo que se debe cobrar y las ryuedas que pago
                System.out.print("\nEl titular ya ha abonado [ si | no ] \n> ");
                boolean fueCobrado = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

                VehiculosConcerns.cantidadDeRuedasPagas(motoAIngresar, sc, precioDiario, fueCobrado);
                motoAIngresar.calcularMontoACobrar(precioDiario);

                 // output para confirmacion del user
                System.out.println("Los datos de la moto son:");
                System.out.println(motoAIngresar);

                // solicitamos confirmacion
                System.out.print("\n> Confirma el ingreso de la moto? [ si | no ]\n> ");

                if (ValidadorVehiculo.validadorBooleanoConfirmacion(sc)) {
                    System.out.println("Moto almacenada exitosamente");
                    break;
                } else {
                    System.out.println("Reiniciando carga de datos de moto..\n");
                }
            }

        }
        return motoAIngresar;

    };

     // update - nos limitamos a no actualizar datos enduro como marca, kilometraje,
    // patente, cantidad de puertas
    // no tiene logica actualizar esos datos debido a que se settearon en el ingreso
    // y no hay por que cambiarlos
    public static void actualizarMoto(List<Vehiculo> vehiculos, Moto motoActualizar, Double precioDiario,
            Scanner sc) {

        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println("--           Iniciando Gestion de actualizacion de un Moto                --");
        System.out.println("-----------------------------------------------------------------------------\n");
        System.out.println(motoActualizar);

        while (true) {

            System.out.print(
                    "\nCuantas ruedas quedan por trabajar? [Antes: " + motoActualizar.getCantidadRuedasATrabajar()
                            + "] \n> ");
            int cantidadDeRuedasATrabajar = ValidadorNumeros.validarEntero(sc);

            System.out
                    .print("\nCuantas ruedas fueron trabajadas? [Antes: "
                            + motoActualizar.getCantidadRuedasTrabajadas()
                            + "] \n> ");
            int cantidadDeRuedasTrabajadas = ValidadorNumeros.validarEntero(sc);

            // Validacionnes
            // validamos algunas restricciones logicas de ruedas
            if (!VehiculosConcerns.validarRuedasVehiculo(motoActualizar, cantidadDeRuedasTrabajadas,
                    cantidadDeRuedasATrabajar)) {
                // dejamos vacio porque los mensajes estan en validacioRuedasMoto dentro de
                // concerns.

            } else {  
               
                // calculamos lo que se debe cobrar y las ruedas que pago
                System.out
                        .print("\nEl titular ya ha abonado [ si | no ] ?\n> ");
                boolean fueCobrado = ValidadorVehiculo.validadorBooleanoConfirmacion(sc);

                VehiculosConcerns.cantidadDeRuedasPagas(motoActualizar, sc, precioDiario, fueCobrado);
                motoActualizar.calcularMontoACobrar(precioDiario);
           


                // output para confirmacion del user
                System.out.println("Los datos actualizados del Moto son:");
                System.out.println(motoActualizar);

                // consultamos por confirmacion
                System.out.print("\n> Confirma la actualizacion del Moto? [ si | no ]\n> ");
                if (ValidadorVehiculo.validadorBooleanoConfirmacion(sc)) {
                    System.out.println("Moto actualizado exitosamente");
                    break;

                } else {
                    System.out.println("Reiniciando carga de datos de Moto..\n");
                }

            }

        }
    }
}
