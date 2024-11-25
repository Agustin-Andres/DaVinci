package Vehiculos;

public class Moto extends Vehiculo {

    private static final int cantidadRuedasMoto = 2;
    private int cilindrada;

    public Moto(int cantidadRuedasATrabajar, int cantidadRuedasTrabajadas, Double kilometraje,
            String patente, String marca,
            int cilindrada, double precioDiario, boolean fueCobrado) {
        // herencia
        super(cantidadRuedasMoto, cantidadRuedasTrabajadas, kilometraje, patente, marca, cantidadRuedasATrabajar,
                fueCobrado);
        this.cilindrada = cilindrada;

        calcularMontoACobrar(precioDiario);
        calcularCotizacion(precioDiario);
        calcularSiFueCobrado(precioDiario);
    }

    // constructor vacio
    public Moto() {

    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto {" +
                "\n   Marca                : " + this.getMarca() +
                "\n   Patente              : " + this.getPatente() +
                "\n   Cilindrada           : " + this.getCilindrada() + " cc" +
                "\n   Kilometraje          : " + String.format("%.2f", this.getKilometraje()) +
                "\n   Cantidad de Ruedas   : " + this.getCantidadRuedas() +
                "\n   Ruedas a Trabajar    : " + this.getCantidadRuedasATrabajar() +
                "\n   Cotizacion           : $" + String.format("%.2f", this.getCotizacion()) +
                "\n   Ruedas Trabajadas    : " + this.getCantidadRuedasTrabajadas() +
                "\n   Monto a Cobrar       : $" + String.format("%.2f", this.getMontoCobrar()) +
                "\n   Fue cobrado?         : " + this.isFueCobrado() + 
                "\n   Monto Cobrado:       : $" + this.getMontoCobrado() +
                "\n}";
    }

    // el sistema deberia settear el monto a cobrar por el precio diario y ruedas
    // trabajadas.
    @Override
    public void calcularMontoACobrar(Double precioDiario) {
        this.setmontoCobrar(this.getCantidadRuedasTrabajadas() * precioDiario);

    }

    // cotizacion por si el ingreso del vehiculo no ha sido trabjado
    @Override
    public void calcularCotizacion(Double precioDiario) {
        this.setCotizacion(this.getCantidadRuedasATrabajar() * precioDiario);
    }

    // por si se quiere agregar algun costo adicional
    @Override
    public void agregarCostoAdicional(Double montoAdicional) {
        this.setmontoCobrar(this.getMontoCobrar() + montoAdicional);
    }

    // si fue cobrado el monto a cobrar es igual al monto cobrado y no se factura
    @Override
    public void calcularSiFueCobrado(Double precioDiario) {
        if (this.isFueCobrado()) {
            this.setMontoCobrado(this.getMontoCobrar());
            this.setmontoCobrar(0.0);
        } else {
            this.setMontoCobrado(0.0);
        }
    }

}