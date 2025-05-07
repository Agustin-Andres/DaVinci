
import java.util.ArrayList;
import modelos.Bicicleteria;
import modelos.bicicleta.Bicicleta;
import modelos.bicicleta.BicicletaElectrica;

public class App {
    public static void main(String[] args) throws Exception {

        // creacion de la lista
        ArrayList<Bicicleta> bicicletas = popularDatos();

        Bicicleteria donLuis = new Bicicleteria("Don Luis", bicicletas);

        System.out.println(donLuis.getBicicletas().get(0));
      // System.out.println(donLuis.toString());
    }

    // populamos los datos
    public static ArrayList<Bicicleta> popularDatos() {

        // creacion de objetos
        // Bicicletas comunes
        Bicicleta bicicleta1 = new Bicicleta("Venzo", "Fire", 100);
        Bicicleta bicicleta2 = new Bicicleta("TopMega", "Water", 1000);
        Bicicleta bicicleta3 = new Bicicleta("Olmo", "Leaf", 500);
        Bicicleta bicicleta4 = new Bicicleta("Aurora", "Electric", 2000);
        Bicicleta bicicleta5 = new Bicicleta("SLP", "Rock", 150);

        // Bicicletas eléctricas
        BicicletaElectrica biciElectrica1 = new BicicletaElectrica("Venzo", "FireElectric", 150);
        BicicletaElectrica biciElectrica2 = new BicicletaElectrica("TopMega", "WaterElectric", 230);
        BicicletaElectrica biciElectrica3 = new BicicletaElectrica("Olmo", "LeafElectric", 180);
        BicicletaElectrica biciElectrica4 = new BicicletaElectrica("Aurora", "ElectricMax", 260);
        BicicletaElectrica biciElectrica5 = new BicicletaElectrica("SLP", "RockVolt", 210);

        ArrayList<Bicicleta> bicicletas = new ArrayList<>();

        // Agregamos bicicletas comunes
        bicicletas.add(bicicleta1);
        bicicletas.add(bicicleta2);
        bicicletas.add(bicicleta3);
        bicicletas.add(bicicleta4);
        bicicletas.add(bicicleta5);

        // Agregamos bicicletas eléctricas (polimorfismo)
        bicicletas.add(biciElectrica1);
        bicicletas.add(biciElectrica2);
        bicicletas.add(biciElectrica3);
        bicicletas.add(biciElectrica4);
        bicicletas.add(biciElectrica5);

        return bicicletas;

    }

}
