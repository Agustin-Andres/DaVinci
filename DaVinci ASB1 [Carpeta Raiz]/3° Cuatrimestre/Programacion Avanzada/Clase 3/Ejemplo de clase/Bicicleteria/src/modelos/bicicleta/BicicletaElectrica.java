package modelos.bicicleta;

public class BicicletaElectrica extends Bicicleta {
    private static final int POTENCIA_MAXIMA = 250;

    private int potencia;

    // constructor
    public BicicletaElectrica(String marca, String modelo, int potencia) {

        super(marca, modelo);
        this.potencia = potencia;

    }

    @Override
    public Boolean aptoServicio() {

        return potencia < POTENCIA_MAXIMA;
    }

    // getter y setter

    public int getPotencia() {
        return this.potencia;
    }

    private void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // to string
    @Override
    public String toString() {
        return "Marca: " + getMarca() + "\t\t, Modelo: " + getModelo() + "\t\t, Potencia: " + getPotencia() + "\t\t, Apta: " + aptoServicio();
    }

}
