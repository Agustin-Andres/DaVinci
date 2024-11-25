package Vehiculos;

//clase hija de vehiculo
public class Coche extends Vehiculo {

    // constante estableciendo que cada coche tiene 4 ruedas a trabajar
    private static final int cantidadRuedasCoche = 4;
    private int cantidadPuertas;

    // por defecto todo coche tiene 4 ruedas, lo podemos pasar como constante
    public Coche(int cantidadRuedasATrabajar, int cantidadRuedasTrabajadas, Double kilometraje, String patente,
            String marca,
            int cantidadPuertas, double precioDiario, boolean fueCobrado) {

        // pasamos la cantidad de ruedas
        super(cantidadRuedasCoche, cantidadRuedasTrabajadas, kilometraje, patente, marca, cantidadRuedasATrabajar,
                fueCobrado);
        this.cantidadPuertas = cantidadPuertas;

        // automaticamente se calcula segun el precio diario
        calcularMontoACobrar(precioDiario);
        calcularCotizacion(precioDiario);
        calcularSiFueCobrado(precioDiario);
    }

    // constructor estableciendo el valor defecto por cantidad de ruedas
    public Coche() {
        this.setCantidadRuedas(cantidadRuedasCoche);
    }

    public int getCantidadPuertas() {
        return this.cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Coche {" +
                "\n   Marca                : " + this.getMarca() +
                "\n   Patente              : " + this.getPatente() +
                "\n   Cantidad de Puertas  : " + this.getCantidadPuertas() +
                "\n   Kilometraje          : " + String.format("%.2f", this.getKilometraje()) +
                "\n   Cantidad de Ruedas   : " + this.getCantidadRuedas() +
                "\n   Ruedas a Trabajar    : " + this.getCantidadRuedasATrabajar() +
                "\n   Ruedas Trabajadas    : " + this.getCantidadRuedasTrabajadas() +
                "\n   Cotizacion           : $" + String.format("%.2f", this.getCotizacion()) +
                "\n   Monto a Cobrar       : $" + String.format("%.2f", this.getMontoCobrar()) +
                "\n   Fue cobrado?         : " + this.isFueCobrado() +
                "\n   Monto Cobrado        : $" + String.format("%.2f", this.getMontoCobrado()) +
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
