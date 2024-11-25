package interfaz;

import java.util.Scanner;
import models.Empresa;
import service.GestionPersona;
import utilities.ValidadorNumeros;

public class InterfazPrincipal {

    // constantes para el tipo de persona
    public static final int[] VALORES = { 1, 2, 3 };

    public static void menuInicial() {
        // servicio para admin personas (Empleado, Cliente y Directivo)
        // use metodo privado para popular la info
        GestionPersona directivos = PopularDatos.popularDirectivos();
        GestionPersona empleados = PopularDatos.popularEmpleados();
        GestionPersona clientes = PopularDatos.popularClientes();

        // servicio para admin la empresa
        Empresa empresa = PopularDatos.popularEmpresa();
        Scanner sc = new Scanner(System.in);

        // datos primitivos para ejecucion basica de interfaz
        boolean salida = true;
        int opcion;

        // inicio de programaÖ
        System.out.println("Gestor de Empresas");
        while (salida) {
            // menu de opciones generales, despues lo derivamos a opciones mas detalladas
            mostrarOpcionesGenerales();
            opcion = ValidadorNumeros.validarEntero(sc);

            switch (opcion) {
                case 1: // LISTADO COMPLETO
                    clientes.listarPersonas(VALORES[0]);
                    empleados.listarPersonas(VALORES[1]);
                    directivos.listarPersonas(VALORES[2]);

                    break;
                case 2:
                    // menu de clientes que proviene de la interfaz de clientes para mejor admin
                    InterfazCliente.menuClientes(sc, clientes);
                    break;
                case 3:
                    // menu de empleados
                    InterfazEmpleado.menuEmpleados(sc, empleados);
                    break;
                case 4:
                    // menu de empleados
                    InterfazDirectivos.menuDirectivos(sc, directivos);
                    break;
                case 5:
                    // menu de empleados
                    InterfazEmpresa.menuEmpresa(sc, empresa);
                    break;
                case 6:
                    salida = false;
                    System.out.println("Finalizando... saludos.");
                    break;

                default:
                    System.out.println("Por Favor ingrese una opcion correcta");
            }

        }

    }

    // Metodos de Interfaz principal
    // Opciones generales.
    private static void mostrarOpcionesGenerales() {
        // output basico
        System.out.println("*******************************************");
        System.out.println("!! Ingresar solamente el numero ## de opcion seleccionada !!");
        System.out.println("--- \tMENU PRINCIPAL\t ---");
        System.out.println("#1 - \tMostrar TODOS los datos de Clientes, Empleados, Directivos y Empresa");
        System.out.println("#2 - \tOpciones de Clientes");
        System.out.println("#3 - \tOpciones de Empleados");
        System.out.println("#4 - \tOpciones de Directivos");
        System.out.println("#5 - \tOpciones de Empresa");
        System.out.print("#6 - \tSalir de programa\n > ");


    }

}
