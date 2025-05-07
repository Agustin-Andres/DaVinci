package modelos;

import java.util.ArrayList;
import modelos.bicicleta.Bicicleta;

public class Bicicleteria {

    private String nombreComercio;
    private ArrayList<Bicicleta> bicicletas;

    public Bicicleteria(String nombreComercio, ArrayList<Bicicleta> bicicletas) {

        this.nombreComercio = nombreComercio;
        this.bicicletas = bicicletas;

    }

    public String getNombreComercio() {
        return this.nombreComercio;
    }

    private void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    private  ArrayList<Bicicleta> getBicicletas() {
        return this.bicicletas;
    }

    private void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    // tostring
    @Override
    public String toString() {
        String resultado = "Nombre del comercio: " + nombreComercio + "\n";

        for (Bicicleta bici : bicicletas) {
            resultado += bici.toString() + "\n";
        }

        return resultado;
    }

}
