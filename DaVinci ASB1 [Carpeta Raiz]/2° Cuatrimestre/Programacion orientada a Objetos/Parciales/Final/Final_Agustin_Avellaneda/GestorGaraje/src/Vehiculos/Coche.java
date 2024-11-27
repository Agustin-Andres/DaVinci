package Vehiculos;

//clase hija de vehiculo
public class Coche extends Vehiculo {

    // constante estableciendo que cada coche tiene 4 ruedas a trabajar
    private static final int CANTIDAD_DE_RUEDAS_COCHE = 4;

    private int cantidadPuertas; // cantidad de puertas del vehiculo

    // por defecto todo coche tiene 4 ruedas, lo podemos pasar como constante
    // CONSTRUCTOR PARA POPULAR
    public Coche(int cantidadRuedasATrabajar, int cantidadRuedasTrabajadas, int cantidadRuedasPagas, Double kilometraje,
            String patente,
            String marca,
            int cantidadPuertas, double precioDiario, boolean fueParcialmenteCobrado, boolean fueTotalmenteCobrado) {

        // pasamos la cantidad de ruedas
        super(CANTIDAD_DE_RUEDAS_COCHE, cantidadRuedasTrabajadas, cantidadRuedasPagas, kilometraje, patente, marca,
                cantidadRuedasATrabajar,
                fueParcialmenteCobrado, fueTotalmenteCobrado);
        this.cantidadPuertas = cantidadPuertas;

        calcularMontoACobrar(precioDiario);
    }

    // CONSTRUCTOR PARA CREACION DESDE INTERFAZ
    public Coche(int cantidadRuedasATrabajar, int cantidadRuedasTrabajadas, Double kilometraje, String patente,
            String marca,
            int cantidadPuertas, double precioDiario) {

        // pasamos la cantidad de ruedas
        super(CANTIDAD_DE_RUEDAS_COCHE, cantidadRuedasTrabajadas, kilometraje, patente, marca, cantidadRuedasATrabajar);
        this.cantidadPuertas = cantidadPuertas;

        calcularMontoACobrar(precioDiario);
    }

    // constructor estableciendo el valor defecto por cantidad de ruedas
    public Coche() {
        this.setCantidadRuedas(CANTIDAD_DE_RUEDAS_COCHE);
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
                "\n   Marca                     : " + this.getMarca() +
                "\n   Patente                   : " + this.getPatente() +
                "\n   Cantidad de Puertas       : " + this.getCantidadPuertas() +
                "\n   Kilometraje               : " + String.format("%.2f", this.getKilometraje()) +
                "\n   Cantidad de Ruedas        : " + this.getCantidadRuedas() +
                "\n\n   Ruedas a Trabajar         : " + this.getCantidadRuedasATrabajar() +
                "\n   Ruedas Trabajadas         : " + this.getCantidadRuedasTrabajadas() +
                "\n   Fue Parcialmente cobrado? - " + this.isFueParcialmenteCobrado() +
                "\n   Fue Totalmente cobrado?     " + this.isFueTotalmenteCobrado() +
                "\n   Ruedas Pagas              : " + this.getCantidadRuedasPagas() +
                "\n   Monto a Cobrar            : $" + String.format("%.2f", this.getMontoACobrar()) +
                "\n   Monto Cobrado             : $" + String.format("%.2f", this.getMontoCobrado()) +
                "\n}";
    }

    // el sistema deberia settear el monto a cobrar por el precio diario y ruedas
    // trabajadas.
    @Override
    public void calcularMontoACobrar(Double precioDiario) {
        // total de ruedas a trabajar/trabajadas
        int totalRuedas = (this.getCantidadRuedasATrabajar() + this.getCantidadRuedasTrabajadas());

        // si el pago es total
        if (this.isFueTotalmenteCobrado()) {
            // si fue totalmente pagado, seteamos el monto cobrado
            this.setMontoCobrado(this.getCantidadRuedasTrabajadas() * precioDiario);
            this.setMontoACobrar(0.0); // si pago totalmente, no queda nada para cobrar

        } else if (this.isFueParcialmenteCobrado()) {

            // si fue parcialmente pagado, calculamos el monto cobrado de las ruedas pagas
            // y las ruedas a cobrar x precio diario
            this.setMontoCobrado(this.getCantidadRuedasPagas() * precioDiario);
            this.setMontoACobrar((totalRuedas - this.getCantidadRuedasPagas()) * precioDiario);

        } else {
            // si no pago ninguna rueda, le cobramos el monto total.
            this.setMontoCobrado(0.0);
            this.setMontoACobrar(totalRuedas * precioDiario);

        }

    }

    // por si se quiere agregar algun costo adicional
    @Override
    public void agregarCostoAdicional(Double montoAdicional) {
        this.setMontoACobrar(this.getMontoACobrar() + montoAdicional);
    }

}
