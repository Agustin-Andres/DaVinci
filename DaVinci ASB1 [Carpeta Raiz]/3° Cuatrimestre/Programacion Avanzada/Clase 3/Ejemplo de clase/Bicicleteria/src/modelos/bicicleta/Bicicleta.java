package modelos.bicicleta;

public class Bicicleta {
    private static final int KILOMETRAJE_MAXIMO = 2000;

    private String marca;
    private String modelo;
    private int kilometros;

    // Constructor para bicicleta comun
    public Bicicleta(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;

    }

    // Constructor para bicicleta electrica
    public Bicicleta(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }

    // Constructor vacio
    public void Bicicleta() {

    }

    // metodo apto de servicio que sera heredado, polimorfico
    public Boolean aptoServicio() {

        return kilometros < KILOMETRAJE_MAXIMO;
    }

    // getters y setters
    public String getMarca() {
        return this.marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometros() {
        return this.kilometros;
    }

    private void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }

    // tostring
    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\t\t, Modelo: " + getModelo() + "\t\t, Km: " + getKilometros() + "\t\t, Apta: " + aptoServicio();
    }

}
