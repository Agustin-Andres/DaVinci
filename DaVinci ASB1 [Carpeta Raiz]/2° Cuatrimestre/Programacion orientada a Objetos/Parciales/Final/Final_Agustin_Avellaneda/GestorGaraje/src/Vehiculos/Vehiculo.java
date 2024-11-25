package Vehiculos;

public abstract class Vehiculo {

    private int cantidadRuedas;
    private Double montoCobrar; // se settea en las clases hijas.
    private Double cotizacion; // se settea en clases hijas
    private Double kilometraje;
    private String patente;
    private String marca;
    private int cantidadRuedasTrabajadas;
    private int cantidadRuedasATrabajar;

    // constructor vacio, no sera instanciada por ser abstracta.
    public Vehiculo() {

    }

    // para aplicar herencia
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

    public Double getCotizacion() {
        return this.cotizacion;
    }

    public void setCotizacion(Double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public void calcularMontoACobrar(Double precioDiario) {
    };

    public void calcularCotizacion(Double precioDiario) {
    };

    public void agregarCostoAdicional(Double montoAdicional) {
    };

    public abstract String toString();
}