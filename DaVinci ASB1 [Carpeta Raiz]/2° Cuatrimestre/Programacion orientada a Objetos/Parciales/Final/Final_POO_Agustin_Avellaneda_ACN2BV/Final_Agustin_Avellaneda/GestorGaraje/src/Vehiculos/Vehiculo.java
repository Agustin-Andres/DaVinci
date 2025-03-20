package Vehiculos;

public abstract class Vehiculo {

    private int cantidadRuedas; // cantidad de ruedas de vehiculo - constante en clase hija.
    private int cantidadRuedasTrabajadas; // cantidad de ruedas trabajadas
    private int cantidadRuedasATrabajar; // cantidad de ruedas a trabajar
    private int cantidadRuedasPagas;// cantidad de ruedas que pago el titular

    private Double montoACobrar; // se settea en las clases hijas. es el monto a cobrar
    private Double montoCobrado; // se settea en clases hijas. Es el monto que se cobro, que pago

    private Double kilometraje;

    private String patente;
    private String marca;

    private boolean fueParcialmenteCobrado; // para calcular metodos internos de cada objeto
    private boolean fueTotalmenteCobrado; // para calcular metodos internos de cada objeto

    // constructor vacio, no sera instanciada por ser abstracta.
    public Vehiculo() {

    }

    // Constructor para popular
    public Vehiculo(int cantidadRuedas, int cantidadRuedasTrabajadas, int cantidadRuedasPagas, Double kilometraje,
            String patente, String marca, int cantidadRuedasATrabajar, boolean fueParcialmenteCobrado,
            boolean fueTotalmenteCobrado) {

        this.cantidadRuedas = cantidadRuedas;
        this.cantidadRuedasTrabajadas = cantidadRuedasTrabajadas;
        this.cantidadRuedasPagas = cantidadRuedasPagas;
        this.cantidadRuedasATrabajar = cantidadRuedasATrabajar;

        this.kilometraje = kilometraje;
        this.patente = patente;
        this.marca = marca;

        this.fueParcialmenteCobrado = fueParcialmenteCobrado;
        this.fueTotalmenteCobrado = fueTotalmenteCobrado;
    }

    // constructor para creacion de Interfaz
    public Vehiculo(int cantidadRuedas, int cantidadRuedasTrabajadas, Double kilometraje,
            String patente, String marca, int cantidadRuedasATrabajar) {
        this.cantidadRuedas = cantidadRuedas;
        this.kilometraje = kilometraje;
        this.patente = patente;
        this.marca = marca;
        this.cantidadRuedasTrabajadas = cantidadRuedasTrabajadas;
        this.cantidadRuedasATrabajar = cantidadRuedasATrabajar;

    }

    public int getCantidadRuedas() {
        return this.cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public Double getMontoACobrar() {
        return this.montoACobrar;
    }

    public void setMontoACobrar(Double montoACobrar) {
        this.montoACobrar = montoACobrar;
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

    public int getCantidadRuedasTrabajadas() {
        return this.cantidadRuedasTrabajadas;
    }

    public void setCantidadRuedasTrabajadas(int cantidadRuedasTrabajadas) {
        this.cantidadRuedasTrabajadas = cantidadRuedasTrabajadas;
    }

    public int getCantidadRuedasATrabajar() {
        return this.cantidadRuedasATrabajar;
    }

    public void setCantidadRuedasATrabajar(int cantidadRuedasATrabajar) {
        this.cantidadRuedasATrabajar = cantidadRuedasATrabajar;
    }

    public int getCantidadRuedasPagas() {
        return this.cantidadRuedasPagas;
    }

    public void setCantidadRuedasPagas(int cantidadRuedasPagas) {
        this.cantidadRuedasPagas = cantidadRuedasPagas;
    }

    public boolean isFueParcialmenteCobrado() {
        return this.fueParcialmenteCobrado;
    }

    public void setFueParcialmenteCobrado(boolean fueParcialmenteCobrado) {
        this.fueParcialmenteCobrado = fueParcialmenteCobrado;
    }

    public boolean isFueTotalmenteCobrado() {
        return this.fueTotalmenteCobrado;
    }

    public void setFueTotalmenteCobrado(boolean fueTotalmenteCobrado) {
        this.fueTotalmenteCobrado = fueTotalmenteCobrado;
    }

    public Double getMontoCobrado() {
        return this.montoCobrado;
    }

    public void setMontoCobrado(Double montoCobrado) {
        this.montoCobrado = montoCobrado;
    }

    // metodos que pertenecen al objeto
    public void calcularMontoACobrar(Double precioDiario) {
    };

    public void agregarCostoAdicional(Double montoAdicional) {
    };

    public abstract String toString();
}