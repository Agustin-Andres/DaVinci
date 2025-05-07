
import Figuras.Figura;
import java.util.ArrayList;

public class GrupoDeFiguras {

    private ArrayList<Figura> figuras;

    public GrupoDeFiguras(ArrayList<Figura> figuras) {
        setFiguras(figuras);
    }

    public GrupoDeFiguras() {

    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    private void setFiguras(ArrayList<Figura> figuras) {
        this.figuras.clear();
        this.figuras.addAll(figuras);
    }

    public void mostrarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras en el grupo.");
        } else {
            System.out.println("Figuras en el grupo:");
            for (Figura figura : figuras) {
                System.out.println(figura); // Esto llama al toString() de cada figura
            }
        }
    }
    
}