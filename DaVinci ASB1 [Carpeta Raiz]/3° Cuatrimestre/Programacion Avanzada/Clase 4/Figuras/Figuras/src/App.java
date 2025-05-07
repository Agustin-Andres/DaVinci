import Figuras.Circulo;
import Figuras.Rectangulo;
import Figuras.TrianguloEquilatero;

public class App {
    public static void main(String[] args) throws Exception {
    
        Rectangulo rectangulo = new Rectangulo("Verde", 3, 4);

        TrianguloEquilatero Triangulo = new TrianguloEquilatero("Rojo", 6);

        Circulo Circulo = new Circulo("Negro", 3);


        GrupoDeFiguras figuritas = new GrupoDeFiguras();
        figuritas.agregarFigura(Circulo);
        figuritas.agregarFigura(Triangulo);
        figuritas.agregarFigura(rectangulo);

        figuritas.mostrarFiguras();



    }
}
