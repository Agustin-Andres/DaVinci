package Figuras;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.base;

    }

    @Override
    public double calcularPerimetro() {
        return (this.altura * 2) + (this.base * 2);
    }

}
