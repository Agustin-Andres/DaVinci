package Vehiculos;

public abstract class Vehiculo {

    private int cantidad_ruedas;
    private Double monto_cobrar;
    private Double kilometraje;
    private String patente;
    private String marca;


    //constructor vacio, no sera instanciada por ser abstracta.
    public Vehiculo (){

    }
    //para aplicar herencia
    public Vehiculo (int cantidad_ruedas, Double monto_cobrar, Double kilometraje,String patente, String marca ){
        this.cantidad_ruedas = cantidad_ruedas;
        this.monto_cobrar = monto_cobrar;
        this.kilometraje = kilometraje;
        this.patente = patente;
        this.marca = marca;
    }


    public int getCantidad_ruedas() {
        return this.cantidad_ruedas;
    }

    public void setCantidad_ruedas(int cantidad_ruedas) {
        this.cantidad_ruedas = cantidad_ruedas;
    }

    public Double getMonto_cobrar() {
        return this.monto_cobrar;
    }

    public void setMonto_cobrar(Double monto_cobrar) {
        this.monto_cobrar = monto_cobrar;
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