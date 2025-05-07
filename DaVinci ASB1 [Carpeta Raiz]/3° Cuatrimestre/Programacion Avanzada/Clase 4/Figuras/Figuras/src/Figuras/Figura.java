package Figuras;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract void tostring();

    
}
