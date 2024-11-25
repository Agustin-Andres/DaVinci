package interfaz;

import java.util.Scanner;
import models.Empresa;
import utilities.*;

public class InterfazEmpresa {

    // EMPRESA Menu y metodos
    private static void mostrarOpcionesEmpresa() {
        // output basico
        System.out.println("--- MENU EMPRESA ---");
        System.out.println("#1 - Mostrar datos de empreasa");
        System.out.println("#2 - Actualizar datos de empresa");
        System.out.print("#3 - Volver a menu principal\n > ");

    }

    // Menu empresas
    protected static Empresa menuEmpresa(Scanner sc, Empresa empresa) {

        int opcion;
        boolean salida = true;

        while (salida) {
            mostrarOpcionesEmpresa();
            opcion = ValidadorNumeros.validarEntero(sc);
            switch (opcion) {
                case 1:
                    // datos de empresa
                    System.out.println(empresa.toString());
                    break;
                case 2:
                    // actualizacion empresa
                    empresa = actualizarEmpresa(sc, empresa);
                    break;
                case 3:
                    salida = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
            }
        }

        return empresa;

    }

    // actualizacion de empresa
    // Actualización de empresa
    private static Empresa actualizarEmpresa(Scanner sc, Empresa empresa) {
        while (true) {
            System.out.println("Datos de empresa:\n" + empresa.toString());

            // Razón social
            System.out.print("Ingrese la razón social de la empresa\n > ");
            String razonSocial = sc.nextLine().trim(); // Asegúrate de usar nextLine()
            empresa.setRazonSocial(razonSocial);

            // Dirección
            System.out.print("Ingrese la dirección de la empresa\n > ");
            String direccion = sc.nextLine().trim();
            empresa.setDireccion(direccion);

            // CUIL
            System.out.print("Ingrese el CUIL de la empresa\n > ");
            String cuil = sc.nextLine().trim();
            empresa.setCuil(cuil);

            // Confirmación
            System.out.print("Los datos de la empresa se actualizarán a:\n" + empresa.toString()
                    + "\n >>> ¿Confirma estos cambios? [si | no]\n > ");
            String confirmacion = sc.nextLine().trim();

            if (confirmacion.equalsIgnoreCase("si")) {
                System.out.println("Los datos se actualizaron exitosamente.");
                return empresa;
            } else {
                System.out.println("# Reiniciando carga de datos\n\n");
            }
        }
    }


}
