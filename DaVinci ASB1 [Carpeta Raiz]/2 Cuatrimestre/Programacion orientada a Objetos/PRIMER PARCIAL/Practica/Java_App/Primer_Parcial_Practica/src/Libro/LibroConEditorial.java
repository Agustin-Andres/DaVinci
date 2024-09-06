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
    public void mostrarInformacionLibro() {

        // notar en el output como llamamos los metodos en la instancia de Editorial y
        // Autor
        System.out.println("Nombre de libro: " + this.getNombre());
        System.out.println("Autor del libro: " + this.getAutor().getNombre());
        System.out.println("Editorial: " + this.getEditorial().getNombre());
        System.out.println("Año de publicación: " + this.getAnio_publicacion());
        System.out.println("Cantidad de ejemplares: " + this.getCantidad_ejemplares());
        System.out.println("Costo del libro: $" + this.getCosto());
    }

    @Override
    public String toString() {
        return "";
    }

    // getter y setter de la clase Editorial
    public Editorial getEditorial() {
        return this.editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

}
