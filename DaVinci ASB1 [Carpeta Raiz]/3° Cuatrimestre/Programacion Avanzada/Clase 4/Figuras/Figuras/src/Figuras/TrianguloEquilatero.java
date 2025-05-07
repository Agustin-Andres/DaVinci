package Figuras;

public class TrianguloEquilatero extends Figura {
    private double lado;


    public TrianguloEquilatero(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }


}
