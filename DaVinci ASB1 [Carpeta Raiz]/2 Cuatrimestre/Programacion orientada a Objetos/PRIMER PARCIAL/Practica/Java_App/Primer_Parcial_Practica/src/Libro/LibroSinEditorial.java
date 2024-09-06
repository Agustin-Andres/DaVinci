package Libro;

import Persona.Autor;

public class LibroSinEditorial extends Libro {

    //Constructores, uno con todo y uno sin
    public LibroSinEditorial(String nombre, Autor autor, String anio_publicacion,
            int cantidad_ejemplares, float costo) {
        super(nombre, autor, anio_publicacion, cantidad_ejemplares, costo);

    }

    public LibroSinEditorial() {
        super();
    }

    //Metodos
    @Override
    public void mostrarInformacion() {
        System.out.println("Mostrar informacion de libro");
    };

    @Override
    public String toString() {
        return "";
    }

}
