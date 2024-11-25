package interfaz;

import models.Cliente;
import models.Directivo;
import models.Empleado;
import models.Empresa;
import service.GestionPersona;

public class PopularDatos {

    //dios bendiga excel por la agilidad aca
    protected static GestionPersona popularDirectivos() {
        // instanciamos el servicio
        GestionPersona gestionPersona = new GestionPersona();

        // unos directivos
        Directivo dire1 = new Directivo("Agustin", 23, "Dato generico 1", 20000.00, "L2");
        Directivo dire2 = new Directivo("Eduardo", 32, "Dato generico 2", 70000.00, "F2");
        Directivo dire3 = new Directivo("Miguel", 52, "Dato generico 3", 30000.00, "G2");
        Directivo dire4 = new Directivo("Abel", 34, "Dato generico 4", 24234.00, "D3");
        Directivo dire5 = new Directivo("Jorge", 61, "Dato generico 5", 12300.00, "L1");
        Directivo dire6 = new Directivo("Dario", 54, "Dato generico 6", 50000.00, "L3");
        Directivo dire7 = new Directivo("Leandro", 45, "Dato generico 7", 23000.00, "G1");
        Directivo dire8 = new Directivo("Nicolas", 43, "Dato generico 8", 90000.00, "G2");
        Directivo dire9 = new Directivo("Mariano", 64, "Dato generico 9", 12300.00, "F3");
        Directivo dire10 = new Directivo("Lucas", 46, "Dato generico 10", 43100.00, "D1");
        gestionPersona.agregarPersona(dire1);
        gestionPersona.agregarPersona(dire2);
        gestionPersona.agregarPersona(dire3);
        gestionPersona.agregarPersona(dire4);
        gestionPersona.agregarPersona(dire5);
        gestionPersona.agregarPersona(dire6);
        gestionPersona.agregarPersona(dire7);
        gestionPersona.agregarPersona(dire8);
        gestionPersona.agregarPersona(dire9);
        gestionPersona.agregarPersona(dire10);

        return gestionPersona;
    }

    // popular Empleados
    protected static GestionPersona popularEmpleados() {
        GestionPersona gestionPersona = new GestionPersona();
        Empleado empleado1 = new Empleado("Pablo", 28, "Dato empleado 1", 30000.00);
        Empleado empleado2 = new Empleado("Marta", 34, "Dato empleado 2", 32000.00);
        Empleado empleado3 = new Empleado("Javier", 45, "Dato empleado 3", 35000.00);
        Empleado empleado4 = new Empleado("Camila", 27, "Dato empleado 4", 28000.00);
        Empleado empleado5 = new Empleado("Gustavo", 40, "Dato empleado 5", 40000.00);
        Empleado empleado6 = new Empleado("Liliana", 32, "Dato empleado 6", 31000.00);
        Empleado empleado7 = new Empleado("Ramiro", 50, "Dato empleado 7", 45000.00);
        Empleado empleado8 = new Empleado("Lorena", 29, "Dato empleado 8", 29000.00);
        Empleado empleado9 = new Empleado("Sergio", 38, "Dato empleado 9", 33000.00);
        Empleado empleado10 = new Empleado("Patricia", 41, "Dato empleado 10", 37000.00);
        Empleado empleado11 = new Empleado("Hernan", 36, "Dato empleado 11", 34000.00);
        Empleado empleado12 = new Empleado("Paula", 31, "Dato empleado 12", 31500.00);
        Empleado empleado13 = new Empleado("Federico", 26, "Dato empleado 13", 27000.00);
        Empleado empleado14 = new Empleado("Claudia", 43, "Dato empleado 14", 39000.00);
        Empleado empleado15 = new Empleado("Roberto", 48, "Dato empleado 15", 41000.00);

        gestionPersona.agregarPersona(empleado1);
        gestionPersona.agregarPersona(empleado2);
        gestionPersona.agregarPersona(empleado3);
        gestionPersona.agregarPersona(empleado4);
        gestionPersona.agregarPersona(empleado5);
        gestionPersona.agregarPersona(empleado6);
        gestionPersona.agregarPersona(empleado7);
        gestionPersona.agregarPersona(empleado8);
        gestionPersona.agregarPersona(empleado9);
        gestionPersona.agregarPersona(empleado10);
        gestionPersona.agregarPersona(empleado11);
        gestionPersona.agregarPersona(empleado12);
        gestionPersona.agregarPersona(empleado13);
        gestionPersona.agregarPersona(empleado14);
        gestionPersona.agregarPersona(empleado15);
        return gestionPersona;
    }

    // popular Clientes
    protected static GestionPersona popularClientes() {
        // servicio instanciado
        GestionPersona gestionPersona = new GestionPersona();

        Cliente cliente1 = new Cliente("Miguel", 30, "Dato cliente 1", "123456789");
        Cliente cliente2 = new Cliente("Lucia", 25, "Dato cliente 2", "987654321");
        Cliente cliente3 = new Cliente("Juan", 40, "Dato cliente 3", "456123789");
        Cliente cliente4 = new Cliente("Mariana", 35, "Dato cliente 4", "321789654");
        Cliente cliente5 = new Cliente("Juan", 28, "Dato cliente 5", "654987321");
        Cliente cliente6 = new Cliente("Diego", 50, "Dato cliente 6", "159753456");
        Cliente cliente7 = new Cliente("Ana", 27, "Dato cliente 7", "753951852");
        Cliente cliente8 = new Cliente("Juan", 33, "Dato cliente 8", "852369741");
        Cliente cliente9 = new Cliente("Laura", 45, "Dato cliente 9", "147258369");
        Cliente cliente10 = new Cliente("Miguel", 29, "Dato cliente 10", "369852147");

        gestionPersona.agregarPersona(cliente1);
        gestionPersona.agregarPersona(cliente2);
        gestionPersona.agregarPersona(cliente3);
        gestionPersona.agregarPersona(cliente4);
        gestionPersona.agregarPersona(cliente5);
        gestionPersona.agregarPersona(cliente6);
        gestionPersona.agregarPersona(cliente7);
        gestionPersona.agregarPersona(cliente8);
        gestionPersona.agregarPersona(cliente9);
        gestionPersona.agregarPersona(cliente10);

        return gestionPersona;
    }

    // popular empresa
    protected static Empresa popularEmpresa() {
        // datos genericos para empresa
        Empresa empresa = new Empresa("Jetcom-SAS",  "Av. Siempre Viva 1234", "30-12345678-9");
        return empresa;
    }

}
