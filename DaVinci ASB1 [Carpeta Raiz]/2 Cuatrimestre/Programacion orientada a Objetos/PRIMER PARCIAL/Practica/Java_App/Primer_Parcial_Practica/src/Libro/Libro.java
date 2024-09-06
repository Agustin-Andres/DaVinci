package Libro;

import Persona.Autor; //Todo libro puede tener autor pero no Editorial, lo dejamos para su hijo 'por si acaso jaja'

// clase Abstracta con metodos publicos para que no sean modificables.
public abstract class Libro {

    // variables primitivas abstractas
    private String nombre;
    private Autor autor;
    private String anio_publicacion;
    private int cantidad_ejemplares;
    private float costo;

    // constructores, uno vacio y otro con el resto de la info
    public Libro(String nombre, Autor autor, String anio_publicacion, int cantidad_ejemplares, float costo) {
        this.nombre = nombre;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
        this.cantidad_ejemplares = cantidad_ejemplares;
        this.costo = costo;
    }

    public Libro() {
    }

    // metodos - van a ser Overriden
    public abstract void mostrarInformacionLibro();

    public abstract String toString();

    // getter and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getAnio_publicacion() {
        return this.anio_publicacion;
    }

    public void setAnio_publicacion(String anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }

    public int getCantidad_ejemplares() {
        return this.cantidad_ejemplares;
    }

    public void setCantidad_ejemplares(int cantidad_ejemplares) {
        this.cantidad_ejemplares = cantidad_ejemplares;
    }

    public float getCosto() {
        return this.costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

}
