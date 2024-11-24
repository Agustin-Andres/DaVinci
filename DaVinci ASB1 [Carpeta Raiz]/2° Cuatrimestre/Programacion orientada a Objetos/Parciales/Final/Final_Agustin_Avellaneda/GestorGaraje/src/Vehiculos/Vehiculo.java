package Vehiculos;

public abstract class Vehiculo {

    private int cantidadRuedas;
    private Double montoCobrar;
    private Double kilometraje;
    private String patente;
    private String marca;


    //constructor vacio, no sera instanciada por ser abstracta.
    public Vehiculo (){

    }
    //para aplicar herencia
    public Vehiculo (int cantidadRuedas, Double montoCobrar, Double kilometraje,String patente, String marca ){
        this.cantidadRuedas = cantidadRuedas;
        this.montoCobrar = montoCobrar;
        this.kilometraje = kilometraje;
        this.patente = patente;
        this.marca = marca;
    }


    public int getCantidadRuedas() {
        return this.cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public Double getMontoCobrar() {
        return this.montoCobrar;
    }

    public void setmontoCobrar(Double montoCobrar) {
        this.montoCobrar = montoCobrar;
    }

    public Double getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract String toString();
}