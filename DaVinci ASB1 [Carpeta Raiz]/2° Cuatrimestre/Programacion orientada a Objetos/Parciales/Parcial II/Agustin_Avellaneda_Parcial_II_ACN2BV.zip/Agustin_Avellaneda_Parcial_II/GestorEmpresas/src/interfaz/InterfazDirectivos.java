package interfaz;

import java.util.Scanner;
import models.Directivo;
import models.Empleado;
import service.GestionPersona;
import utilities.ValidadorNumeros;

public class InterfazDirectivos {
    // Tipo de persona
    public static final int TIPOPERSONA = 3;

    // DIRECTIVOS menu y metodos
    private static void mostrarOpcionesDirectivos() {
        // output basico
        System.out.println("*******************************************");
        System.out.println("--- \tMENU DIRECTIVOS ---");
        System.out.println("#1 - \tMostrar todos los Directivos");
        System.out.println("#2 - \tAgregar un Directivo");
        System.out.println("#3 - \tActualizar un Directivo");
        System.out.println("#4 - \tEliminar un Directivos");
        System.out.print("#5 - \tVolver a menu principal\n > ");

    }

    // acciones del menu de directivos.
    protected static GestionPersona menuDirectivos(Scanner sc, GestionPersona directivos) {

        int opcion;
        boolean salida = true;

        while (salida) {
            mostrarOpcionesDirectivos();
            opcion = ValidadorNumeros.validarEntero(sc);
            switch (opcion) {
                case 1:
                    directivos.listarPersonas(TIPOPERSONA);
                    break;
                case 2:
                    directivos.agregarPersona(creacionDirectivo(sc));
                    break;

                case 3:
                    // actualizar directivo [Update]
                    Directivo directivoActualizar = seleccionarDirectivo(directivos, sc);
                    Directivo directivoActualizado = actualizarDirectivo(directivoActualizar, sc);
                    directivos = directivos.actualizarPersonasActualizar(directivos, directivoActualizar,
                            directivoActualizado);
                    break;

                case 4:
                    // eliminar directivo [Delete]
                    Directivo directivoEliminar = seleccionarDirectivo(directivos, sc);
                    directivos = eliminarDirectivo(directivos, directivoEliminar, sc);
                    break;
                case 5:
                    salida = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

        }
        return directivos;

    }

    // Creacion de directivo
    private static Empleado creacionDirectivo(Scanner sc) {
        Directivo directivo = new Directivo();

        while (true) {

            System.out.println("\nCreación de Directivo:");

            // Nombre
            System.out.print("Ingrese el nombre del directivo\n > ");
            String nombre = sc.next().trim();
            directivo.setNombre(nombre);

            // Edad
            System.out.print("Ingrese la edad del directivo\n > ");
            directivo.setEdad(ValidadorNumeros.validarEntero(sc));

            // Datos personales
            System.out.print("Ingrese los datos personales del directivo\n > ");
            directivo.setDatosPersonales(sc.next().trim());

            // Sueldo bruto
            System.out.print("Ingrese el sueldo bruto del directivo\n > ");
            directivo.setSueldoBruto(ValidadorNumeros.validarFloat(sc));

            // categoria
            System.out.print("Ingrese la categoria del directivo\n > ");
            directivo.setCategoria(sc.next().trim());

            // Mostrar datos del directivo y confirmar
            System.out.print("Los datos del directivo son:\n" + directivo.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no]\n > ");

            String confirmacion = sc.next().trim();

            // Si el usuario confirma, se devuelve el directivo
            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Directivo \"" + directivo.getNombre() + "\" creado exitosamente.");
                return directivo;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }
    }

    // Para seleccionar un directivo ###Recordar castear ya que en servicio es
    // abstracto
    private static Directivo seleccionarDirectivo(GestionPersona directivos, Scanner sc) {

        Directivo directivoActualizar = new Directivo();

        // iteramos a buscar el directivo a actualizar, recordar casteo
        directivoActualizar = (Directivo) directivos.busquedaPersona(directivos, sc, TIPOPERSONA);

        return directivoActualizar;
    }

    // aca "actualizamos" el directivo seleccionado, retornamos el directivo
    // actualizado
    private static Directivo actualizarDirectivo(Directivo directivo, Scanner sc) {
        // creamos un nuevo directivo y retornaremos los datos del nuevo para pisar los
        // del anterior
        Directivo directivoActualizado = new Directivo();

        while (true) {
            System.out.println("*******************************************");
            System.out.println("\n\n -- Actualizacion de directivo: \n  >> " + directivo.toString());

            // Nombre
            System.out.print("\nActualice el nombre del directivo\n > ");
            String nombre = sc.nextLine().trim();
            directivoActualizado.setNombre(nombre);

            // Edad
            System.out.print("Actualice la edad del directivo\n > ");
            directivoActualizado.setEdad(ValidadorNumeros.validarEntero(sc));

            // Datos personales
            System.out.print("Actualice los datos personales del directivo\n > ");
            directivoActualizado.setDatosPersonales(sc.nextLine().trim());

            // Telefono de contacto
            System.out.print("Actualice la categoria del directivo\n > ");
            directivoActualizado.setCategoria(sc.nextLine().trim());

            // Mostrar datos del directivo y confirmar
            System.out.print("Los datos actualizados del directivo son:\n" + directivoActualizado.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no | cancelar]\n > ");

            String confirmacion = sc.nextLine().trim();

            // Si el usuario confirma, se devuelve el directivo
            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Directivo \"" + directivoActualizado.getNombre() + "\" actualizado exitosamente.");
                return directivoActualizado;
            } else if (confirmacion.equalsIgnoreCase("cancelar")) {
                System.out.println(" > Actualizacion cancelada, volviendo a menu de directivos < ");
                return directivo;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }

    }

    // metodo para confirmar eliminacion.
    private static GestionPersona eliminarDirectivo(GestionPersona directivos, Directivo directivoEliminar,
            Scanner sc) {

        System.out.print("Directivo seleccionado :\n> " + directivoEliminar.toString()
                + "\n > Desea eliminarlo? [si | no]\n > ");

        String confirmacion = sc.nextLine().trim();

        // Si el usuario confirma, se devuelve el directivo
        if (confirmacion.equalsIgnoreCase("si")) {

            System.out.println("Directivo \"" + directivoEliminar.getNombre() + "\" eliminado exitosamente.");
            return directivos.actualizarPersonasEliminar(directivos, directivoEliminar);

        } else {
            System.out.println(" > Eliminacion de directivo \"" + directivoEliminar.getNombre() + "\" cancelada. < ");
            return directivos;
        }

    }

}
