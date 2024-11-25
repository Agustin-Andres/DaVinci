package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.Persona;
import utilities.ValidadorNumeros;

// Clase para gestionar los datos de los hijos de la clase persona.

public class GestionPersona {

    // lista que guarda los objetos Persona (Empleado, Cliente y Directivo)
    private List<Persona> personas;

    // Constructor que inicializa la lista
    public GestionPersona() {
        personas = new ArrayList<>();
    }

    // metodo para agregar una persona (Empleado o Cliente) a la lista
    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    // metodo para mostrar la información de una persona especifica [no se usa ya
    // que se puede repetir los nombres, mismo con eliminar]
    public void mostrarInformacionPersona(Persona persona) {
        System.out.println(persona.toString() + "\n");
    }

    // metodo para listar todas las personas almacenadas en la lista
    public void listarPersonas(int tipo) {
        System.out.println("*******************************************");
        switch (tipo) {

            case 1:
                System.out.println("\t## Listado de Clientes:");
                break;
            case 2:
                System.out.println("\t## Listado de Empleados:");
                break;
            case 3:
                System.out.println("\t## Listado de Directivos:");
                break;
        }

        for (int i = 0; i < personas.size(); i++) {
            mostrarInformacionPersona(personas.get(i));
        }
        System.out.println("*******************************************");

    }

    // metodo para la busqueda de persona por nombre. retornara obj GestionPersona
    public Persona busquedaPersona(GestionPersona persona, Scanner sc, int tipo) {

        // nueva instancia para obtener las personas con el mismo nombre
        GestionPersona busqueda = new GestionPersona();

        // validamos que el nombre sea existente
        String nombre = validarNombrePersona(persona, sc, tipo);

        // agregamos los objetos de persona a la busqueda por nombre
        for (int i = 0; i < persona.personas.size(); i++) {
            if (persona.personas.get(i).getNombre().equalsIgnoreCase(nombre.trim())) {
                busqueda.personas.add(persona.personas.get(i));
            }
        }

        // Retornar la persona seleccionada de la lista de coincidencias
        return seleccionarPersona(busqueda, sc);
    }

    // metodo para editar una persona
    // Modificar cliente, aca modificamos el cliente de la lista de clientes
    public GestionPersona actualizarPersonasActualizar(GestionPersona persona, Persona personaActualizar,
            Persona personaActualizada) {

        // iteramos sobre la lista de personas en GestionPersona para buscar la persona
        // a actualizar
        for (int i = 0; i < persona.personas.size(); i++) {
            // ya validamos que exista
            if (persona.personas.get(i).equals(personaActualizar)) {

                // remplazamos la persona en esta ubicacion con la persona actualizada
                persona.personas.set(i, personaActualizada);

            }
        }
        return persona;
    }

    // metodo para eliminar una persona
    public GestionPersona actualizarPersonasEliminar(GestionPersona personas, Persona personaElminar) {

        // buscamos la persona a eliminar
        for (int i = 0; i < personas.personas.size(); i++) {
            if (personas.personas.get(i).equals(personaElminar)) {
                personas.personas.remove(i);
            }
        }

        return personas;
    }

    // metodo para seleccionar una persona de una lista de la busqueda de personas,
    // privado.
    // validaciones van a utilities - validar numeros
    private Persona seleccionarPersona(GestionPersona busquedaPersona, Scanner sc) {

        // Si solo hay una persona, retornamos esa.
        if (busquedaPersona.personas.size() == 1) {
            return busquedaPersona.personas.get(0);
        }

        // Listar las personas con su índice
        System.out.print("> Por favor seleccione la persona segun su indice: \n");
        for (int i = 0; i < busquedaPersona.personas.size(); i++) {
            System.out.println("[ " + (i + 1) + " ] - " + busquedaPersona.personas.get(i).toString());
        }

        // Bucle para validar el índice ingresado por el usuario
        while (true) {
            System.out.print("Ingrese el índice de la persona deseada: ");
            int indice = ValidadorNumeros.validarEntero(sc) - 1; // restamos 1 para que el indice coincida con la lista

            // Verificar que el indicie este en el rango correcto
            if (indice >= 0 && indice < busquedaPersona.personas.size()) {
                System.out.println("Seleccionamos: " + busquedaPersona.personas.get(indice).toString());
                return busquedaPersona.personas.get(indice);
            } else {
                System.out.println(">>>> Error: indice fuera de rango. Por favor, ingrese un indice válido.");
            }
        }
    }

    private String validarNombrePersona(GestionPersona personas, Scanner sc, int tipo) {
        String nombreCliente;

        // iteramos hasta encontrar un nombre valido de la lista
        while (true) {

            // el nombre segun el tipo de persona son constantes, siempre existen
            switch (tipo) {
                case 1:
                    System.out.print("> Ingrese el nombre del Cliente:\n > ");
                    break;
                case 2:
                    System.out.print("> Ingrese el nombre del Empleado:\n > ");
                    break;
                case 3:
                    System.out.print("> Ingrese el nombre del Directivo:\n > ");
                    break;
            }

            // asignacion de nombre de cliente y lo almacenamos con Uppercase
            nombreCliente = sc.nextLine().trim().toLowerCase();
            nombreCliente = nombreCliente.substring(0, 1).toUpperCase() + nombreCliente.substring(1).toLowerCase();

            // buscamos el nombre en la lista de personas
            boolean encontrado = false;
            for (int i = 0; i < personas.personas.size(); i++) {
                if (personas.personas.get(i).getNombre().equals(nombreCliente)) {
                    encontrado = true;
                    break; // salimos del bucle si al menos hay 1 persona con dicho nombre
                }
            }

            if (encontrado) {
                return nombreCliente; // Retorna el nombre si se encuentra en la lista
            } else {
                System.out.println("Persona no encontrada, por favor ingrese un nombre valido.");
            }
        }
    }

}
