package Interfaz;

import Libro.LibroConEditorial;
import Organizacion.Editorial;
import Persona.Autor;

/*La idea de esta clase es un intermedio entre el main y las clases que seran instanciadas. */

public class Interfaz {

    /*
     * Arreglos como constrantes con su tipo de dato para almacenar la informacion
     * enduro para cada entidad.
     */

    // Libro
    final static String[] LIBRO_NOMBRES = { "Cien años de soledad", "El gran Gatsby" };
    final static String[] LIBRO_ANIO_PUBLICACION = { "1967-06-05", "1925-04-10" };
    final static int[] LIBRO_CANTIDAD_EJEMPLARES = { 3, 10 };
    final static float[] LIBRO_COSTOS = { 32000, 27000 };

    // Editorial
    final static String[] EDITORIAL_NOMBRES = { "Editorial Sudamericana", "editorial Scribner" };
    final static String[] EDITORIAL_TELEFONOS = { "+5491125144426", "+190350892367" };
    final static String[] EDITORIAL_DIRECCIONES = { "Humberto Primo 555, Capital Federal",
            "Nueva York, Nueva York, Estados Unidos" };
    final static String[] EDITORIAL_LOCALIDADES = { "Localidad generica", "Localidad Genercia x2" };
    final static String[] EDITORIAL_EMAILS = { "libreriasudestada@gmail.com", "Support@Scribner.com" };
    final static String[] EDITORIAL_CUITS = { "20363802148", "20364784218" };

    // Autor
    final static String[] AUTOR_NOMBRES = { "Gabriel", "Francis Scott" };
    final static String[] AUTOR_APELLIDOS = { "García Márquez", "Fitzgerald" };
    final static String[] AUTOR_FECHAS_NACIMIENTO = { "1927-04-06", "1896-09-24" };
    final static String[] AUTOR_SEXOS = { "Masculino", "Masculino" };
    final static String[] AUTOR_EMAILS = { "sin_email", "sin_email" };

    // metodo 'Principal'
    public static void menuInicial() {

        // 2 autores, un arreglo conteniendo variables de referencias
        Autor[] autores = new Autor[2];
        autores[0] = crearAutor(0);

        // 2 editoriales, un arreglo conteniendo variables de referencias
        Editorial[] editoriales = new Editorial[2];
        editoriales[0] = crearEditorial(0);

        // 2 libros, un arreglo conteniendo variables de referencias
        LibroConEditorial[] libros = new LibroConEditorial[2];
        // pasamos por parametro el indice, autores y editoriales
        libros[0] = crearLibroConEditorial(0, autores[0], editoriales[0]);

        // output de la informacion
        System.out.println("\n###### Libros en el sistema ######\n");
        System.out.println(libros[0].toString());
        System.out.println("\t - - - - - - - - - -");

        System.out.println("\n###### Autores presentes en el sistema ######\n");
        System.out.println(autores[0].toString());
        System.out.println("\t - - - - - - - - - -");

        System.out.println("\n###### Editoriales presentes en el sistema ######\n");
        System.out.println(editoriales[0].toString());
        System.out.println("\t - - - - - - - - - -");

    }

    // Metodos privados para crear los distintos objetos
    // Autor
    private static Autor crearAutor(int index) {

        Autor autor = new Autor();
        autor.setNombre(AUTOR_NOMBRES[index]);
        autor.setApellido(AUTOR_APELLIDOS[index]);
        autor.setFechaNacimiento(AUTOR_FECHAS_NACIMIENTO[index]);
        autor.setSexo(AUTOR_SEXOS[index]);
        autor.setEmail(AUTOR_EMAILS[index]);

        return autor;
    };

    // Metodo privado para crear los editoriales
    private static Editorial crearEditorial(int index) {
        Editorial editorial = new Editorial();
        editorial.setNombre(EDITORIAL_NOMBRES[index]);
        editorial.setTelefono(EDITORIAL_TELEFONOS[index]);
        editorial.setDireccion(EDITORIAL_DIRECCIONES[index]);
        editorial.setLocalidad(EDITORIAL_LOCALIDADES[index]);
        editorial.setEmail(EDITORIAL_EMAILS[index]);
        editorial.setCuit(EDITORIAL_CUITS[index]);

        return editorial;
    };

    // Creacion de Libros - para la consigna, los dejamos con editorial
    private static LibroConEditorial crearLibroConEditorial(int index, Autor autor, Editorial editorial) {
        LibroConEditorial libro = new LibroConEditorial();

        libro.setNombre(LIBRO_NOMBRES[index]);
        libro.setAutor(autor);
        libro.setAnio_publicacion(LIBRO_ANIO_PUBLICACION[index]);
        libro.setCantidad_ejemplares(LIBRO_CANTIDAD_EJEMPLARES[index]);
        libro.setCosto(LIBRO_COSTOS[index]);
        libro.setEditorial(editorial); // Específico de LibroConEditorial

        return libro;

    };
}
