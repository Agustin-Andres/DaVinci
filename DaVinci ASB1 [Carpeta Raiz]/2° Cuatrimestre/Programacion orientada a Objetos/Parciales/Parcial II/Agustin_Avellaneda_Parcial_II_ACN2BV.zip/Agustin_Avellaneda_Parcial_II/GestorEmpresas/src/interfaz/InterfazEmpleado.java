package interfaz;

import java.util.Scanner;
import models.Empleado;
import service.GestionPersona;
import utilities.*;

public class InterfazEmpleado {

    // Tipo de persona de empleado
    public static final int TIPOPERSONA = 2;

    // EMPLEADOS, menu y metodos
    // menu

    // opciones del Menu de empleados
    protected static GestionPersona menuEmpleados(Scanner sc, GestionPersona empleados) {

        int opcion;
        boolean salida = true;

        while (salida) {
            mostrarOpcionesEmpleados();
            opcion = ValidadorNumeros.validarEntero(sc);
            switch (opcion) {
                case 1:
                    // Listar empleados [Read]
                    empleados.listarPersonas(TIPOPERSONA);
                    break;
                case 2:
                    // agreagr empleado [Create]
                    empleados.agregarPersona(creacionEmpleado(sc));
                    break;
                case 3:
                    // actualizar empleado [Update]
                    Empleado empleadoActualizar = seleccionarEmpleado(empleados, sc);
                    Empleado empleadoActualizado = actualizarEmpleado(empleadoActualizar, sc);
                    empleados = empleados.actualizarPersonasActualizar(empleados, empleadoActualizar,
                            empleadoActualizado);
                    break;
                case 4:
                    // borrar empleado [Delete]
                    Empleado empleadoEliminar = seleccionarEmpleado(empleados, sc);
                    empleados = eliminarEmpleado(empleados, empleadoEliminar, sc);
                    break;

                case 5:
                    salida = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

        }

        return empleados;

    }

    // menu
    private static void mostrarOpcionesEmpleados() {
        // output basico
        System.out.println("*******************************************");
        System.out.println("--- \tMENU EMPLEADOS ---");
        System.out.println("#1 - \tMostrar todos los Empleados");
        System.out.println("#2 - \tAgregar un Empleado");
        System.out.println("#3 - \tActualizar un Empleado");
        System.out.println("#4 - \tBorrar un Empleado");
        System.out.print("#5 - \tVolver a menu principal\n > ");

    }

    // creacion de empleado
    private static Empleado creacionEmpleado(Scanner sc) {
        Empleado empleado = new Empleado();

        while (true) {

            System.out.println("\nCreación de Empleado:");

            // Nombre
            System.out.print("Ingrese el nombre del empleado\n > ");
            String nombre = sc.next().trim();
            empleado.setNombre(nombre);

            // Edad
            System.out.print("Ingrese la edad del empleado\n > ");
            empleado.setEdad(ValidadorNumeros.validarEntero(sc));

            // Datos personales
            System.out.print("Ingrese los datos personales del empleado\n > ");
            empleado.setDatosPersonales(sc.next().trim());

            // Sueldo bruto
            System.out.print("Ingrese el sueldo bruto del empleado\n > ");
            empleado.setSueldoBruto(ValidadorNumeros.validarFloat(sc));

            // Mostrar datos del empleado y confirmar
            System.out.print("Los datos del empleado son:\n" + empleado.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no]\n > ");

            String confirmacion = sc.next().trim();

            // Si el usuario confirma, se devuelve el empleado
            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Empleado \"" + empleado.getNombre() + "\" creado exitosamente.");
                return empleado;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }
    }

    // Seleccion de empleado, ##recordar castear ya que en servicio es abstracto
    private static Empleado seleccionarEmpleado(GestionPersona empleados, Scanner sc) {

        Empleado empleadoActualizar = new Empleado();

        // iteramos a buscar el empleado a actualizar, recordar casteo
        empleadoActualizar = (Empleado) empleados.busquedaPersona(empleados, sc, TIPOPERSONA);

        return empleadoActualizar;
    }

    // aca "Actualizamos" el emplado seleccionado, retornamos el empleado
    // actualizado
    private static Empleado actualizarEmpleado(Empleado empleado, Scanner sc) {
        // creamos un nuevo empleado y retornaremos los datos del nuevo para pisar los
        // del anterior
        Empleado empleadoActualizado = new Empleado();

        while (true) {
            System.out.println("*******************************************");
            System.out.println("\n\n -- Actualizacion de empleado: \n  >> " + empleado.toString());

            // Nombre
            System.out.print("\nActualice el nombre del empleado\n > ");
            String nombre = sc.nextLine().trim();
            empleadoActualizado.setNombre(nombre);

            // Edad
            System.out.print("Actualice la edad del empleado\n > ");
            empleadoActualizado.setEdad(ValidadorNumeros.validarEntero(sc));

            // Datos personales
            System.out.print("Actualice los datos personales del empleado\n > ");
            empleadoActualizado.setDatosPersonales(sc.nextLine().trim());

            // Telefono de contacto
            System.out.print("Actualice el sueldo bruto del empleado\n > ");
            empleadoActualizado.setSueldoBruto(ValidadorNumeros.validarFloat(sc));

            // Mostrar datos del empleado y confirmar
            System.out.print("Los datos actualizados del empleado son:\n" + empleadoActualizado.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no | cancelar]\n > ");

            String confirmacion = sc.nextLine().trim();

            // Si el usuario confirma, se devuelve el empleado
            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Empleado \"" + empleadoActualizado.getNombre() + "\" actualizado exitosamente.");
                return empleadoActualizado;
            } else if (confirmacion.equalsIgnoreCase("cancelar")) {
                System.out.println(" > Actualizacion cancelada, volviendo a menu de empleados < ");
                return empleado;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }

    }

    // metodo para confirmar eliminacion
    private static GestionPersona eliminarEmpleado(GestionPersona empleados, Empleado empleadoEliminar, Scanner sc) {

        System.out.print(
                "Empleado seleccionado :\n> " + empleadoEliminar.toString() + "\n > Desea eliminarlo? [si | no]\n > ");

        String confirmacion = sc.nextLine().trim();

        // Si el usuario confirma, se devuelve el empleado
        if (confirmacion.equalsIgnoreCase("si")) {

            System.out.println("Empleado \"" + empleadoEliminar.getNombre() + "\" eliminado exitosamente.");
            return empleados.actualizarPersonasEliminar(empleados, empleadoEliminar);

        } else {
            System.out.println(" > Eliminacion de empleado \"" + empleadoEliminar.getNombre() + "\" cancelada. < ");
            return empleados;
        }

    }
}
