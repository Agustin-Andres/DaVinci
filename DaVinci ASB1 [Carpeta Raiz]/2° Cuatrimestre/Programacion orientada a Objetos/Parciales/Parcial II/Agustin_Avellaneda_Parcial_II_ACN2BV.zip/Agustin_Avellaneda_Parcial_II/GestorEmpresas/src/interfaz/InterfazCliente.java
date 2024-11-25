package interfaz;

import java.util.Scanner;
import models.Cliente;
import service.GestionPersona;
import utilities.*;

public class InterfazCliente {
    // El tipo de persona
    public static final int TIPOPERSONA = 1;

    // CLIENTES, menu y metodos
    // menu principal para acciones particulares para clientes
    private static void mostrarOpcionesClientes() {
        // output basico
        System.out.println("*******************************************");
        System.out.println("--- \tMENU CLIENTES \t---");
        System.out.println("#1 - \tMostrar todos los Clientes");
        System.out.println("#2 - \tAgregar un cliente");
        System.out.println("#3 - \tActualizar un cliente");
        System.out.println("#4 - \tBorrar un cliente");
        System.out.print("#5 - \tVolver a menu principal\n > ");


    }

    // acciones del menu de clientes

    protected static GestionPersona menuClientes(Scanner sc, GestionPersona clientes) {

        // opcion de cliente con flag
        int opcion;
        boolean salida = true;

        // metodos de menu,
        while (salida) {
            mostrarOpcionesClientes();
            opcion = ValidadorNumeros.validarEntero(sc);
            switch (opcion) {
                case 1:
                    // listar los clientes cargados [Read]
                    clientes.listarPersonas(TIPOPERSONA);
                    break;
                case 2:
                    // agregar un cliente [Create]
                    clientes.agregarPersona(creacionCliente(sc));
                    break;
                case 3:
                    // actualizar cliente [Update]
                    Cliente clienteActualizar = seleccionarCliente(clientes, sc);
                    Cliente clienteActualizado = actualizarCliente(clienteActualizar, sc);
                    clientes = clientes.actualizarPersonasActualizar(clientes, clienteActualizar, clienteActualizado);
                    break;

                case 4:
                    // eliminar cliente [Delete]
                    Cliente clienteEliminar = seleccionarCliente(clientes, sc);
                    clientes = eliminarCliente(clientes, clienteEliminar, sc);
                    break;

                // retornar al menu general
                case 5:
                    salida = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }

        }
        return clientes;

    }

    // para agregar un cliente

    private static Cliente creacionCliente(Scanner sc) {
        Cliente cliente = new Cliente();

        while (true) {

            System.out.println("\nCreación de cliente:");

            // Nombre
            System.out.print("Ingrese el nombre del cliente\n > ");
            String nombre = sc.next().trim();
            cliente.setNombre(nombre);

            // Edad
            System.out.print("Ingrese la edad del cliente\n > ");
            cliente.setEdad(ValidadorNumeros.validarEntero(sc));

            // Datos personales
            System.out.print("Ingrese los datos personales del cliente\n > ");
            cliente.setDatosPersonales(sc.next().trim());

            // Telefono de contacto
            System.out.print("Ingrese un teléfono de contacto del cliente\n > ");
            cliente.setTelefonoContacto(sc.next().trim());

            // Mostrar datos del cliente y confirmar
            System.out.print("Los datos del cliente son:\n" + cliente.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no]\n > ");

            String confirmacion = sc.next().trim();

            // Si el usuario confirma, se devuelve el cliente
            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Cliente \"" + cliente.getNombre() + "\" creado exitosamente.");
                return cliente;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }
    }

    // Para seleccionar un cliente ###Recordar castear ya que en servicio es
    // abstracto
    private static Cliente seleccionarCliente(GestionPersona clientes, Scanner sc) {

        Cliente clienteActualizar = new Cliente();

        // iteramos a buscar el cliente a actualizar, recordar casteo
        clienteActualizar = (Cliente) clientes.busquedaPersona(clientes, sc, TIPOPERSONA);

        return clienteActualizar;
    }

    // aca "actualizamos" el cliente seleccionado, retornamos el cliente actualizado
    private static Cliente actualizarCliente(Cliente cliente, Scanner sc) {
        // creamos un nuevo cliente y retornaremos los datos del nuevo para pisar los
        // del anterior
        Cliente clienteActualizado = new Cliente();

        while (true) {

            System.out.println("*******************************************");
            System.out.println("\n\n -- Actualizacion de cliente: \n  >> " + cliente.toString());

            // Nombre
            System.out.print("\nActualice el nombre del cliente\n > ");
            String nombre = sc.nextLine().trim();
            clienteActualizado.setNombre(nombre);

            // Edad
            System.out.print("Actualice la edad del cliente\n > ");
            clienteActualizado.setEdad(ValidadorNumeros.validarEntero(sc));

            // Datos personales
            System.out.print("Actualice los datos personales del cliente\n > ");
            clienteActualizado.setDatosPersonales(sc.nextLine().trim());

            // Telefono de contacto
            System.out.print("Actualice un teléfono de contacto del cliente\n > ");
            clienteActualizado.setTelefonoContacto(sc.nextLine().trim());

            // Mostrar datos del cliente y confirmar
            System.out.print("Los datos actualizados del cliente son:\n" + clienteActualizado.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no | cancelar]\n > ");

            String confirmacion = sc.nextLine().trim();

            // Si el usuario confirma, se devuelve el cliente
            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Cliente \"" + clienteActualizado.getNombre() + "\" actualizado exitosamente.");
                return clienteActualizado;
            } else if (confirmacion.equalsIgnoreCase("cancelar")) {
                System.out.println(" > Actualizacion cancelada, volviendo a menu de clientes < ");
                return cliente;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }

    }

    //metodo para confirmar eliminacion.
    private static GestionPersona eliminarCliente(GestionPersona clientes, Cliente clienteEliminar, Scanner sc) {
        System.out.println("*******************************************");
        System.out.print("Cliente seleccionado :\n> " + clienteEliminar.toString() + "\n > Desea eliminarlo? [si | no]\n > ");

        String confirmacion = sc.nextLine().trim();

        // Si el usuario confirma, se devuelve el cliente
        if (confirmacion.equalsIgnoreCase("si")) {

            System.out.println("Cliente \"" + clienteEliminar.getNombre() + "\" eliminado exitosamente.");
            return clientes.actualizarPersonasEliminar(clientes, clienteEliminar);

        } else {
            System.out.println(" > Eliminacion de cliente \"" + clienteEliminar.getNombre() + "\" cancelada. < ");
            return clientes;
        }

    }
}
