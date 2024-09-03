package taller;

public class Vehiculo {

    // declaracion de variables
    int id;
    String patente;
    String marca;
    String modelo;
    String color;

    // Constructor vacio
    public void Vehiculo() {
    };

    // Constructor completo
    public void Vehiculo(int id, String patente, String marca, String modelo, String color) {
        this.id = id;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

}
