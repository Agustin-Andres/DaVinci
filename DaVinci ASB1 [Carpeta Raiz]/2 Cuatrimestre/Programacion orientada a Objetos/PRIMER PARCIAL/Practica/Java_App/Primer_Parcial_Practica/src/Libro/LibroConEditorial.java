package Libro;

import Organizacion.Editorial;
import Persona.Autor;

//  Clase Libro con editorial, hijo de la clase abstracta Libro
public class LibroConEditorial extends Libro {

    // variable de referencia, las instancias de esta clase tienen editoriales
    private Editorial editorial;

    // constructores, uno lleno y otro vacio

    public LibroConEditorial(String nombre, Autor autor, String anio_publicacion,
            int cantidad_ejemplares, float costo, Editorial editorial) {
        super(nombre, autor, anio_publicacion, cantidad_ejemplares, costo);

        this.editorial = editorial;
    }

    public LibroConEditorial() {
        super();
    }

    // metodos
    @Override
    public String toString() {
        return "Nombre de libro: " + this.getNombre() + "\n" +
                "Autor del libro: " + this.getAutor().nombreCompleto() + "\n" +
                "Editorial: " + this.getEditorial().getNombre() + "\n" +
                "Año de publicación: " + this.getAnio_publicacion() + "\n" +
                "Cantidad de ejemplares: " + this.getCantidad_ejemplares() + "\n" +
                "Costo del libro: $" + this.getCosto();
    }

    // getter y setter de la clase Editorial
    public Editorial getEditorial() {
        return this.editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

}
