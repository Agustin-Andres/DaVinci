package utilities;

import java.util.ArrayList;
import java.util.List;

import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class popularVehiculos {

    public static List<Vehiculo> popularCoches() {
        List<Vehiculo> coches = new ArrayList<>();

        // Agregamos manualmente 10 objetos Coche con valores válidos
        coches.add(new Coche(2, 2, 15000.0, "ABC123", "Toyota", 4, 100)); // 2 ruedas trabajadas
        coches.add(new Coche(1, 3, 16000.0, "DEF456", "Ford", 4, 100)); // 3 ruedas trabajadas
        coches.add(new Coche(0, 4, 17000.0, "GHI789", "Honda", 5, 100)); // 4 ruedas trabajadas (máximo)
        coches.add(new Coche(2, 0, 18000.0, "JKL012", "Chevrolet", 4, 100)); // 0 ruedas trabajadas
        coches.add(new Coche(2, 1, 19000.0, "MNO345", "Nissan", 5, 100)); // 1 rueda trabajada
        coches.add(new Coche(0, 4, 20000.0, "PQR678", "Volkswagen", 4, 100)); // 4 ruedas trabajadas
        coches.add(new Coche(1, 2, 21000.0, "STU901", "Kia", 5, 100)); // 2 ruedas trabajadas
        coches.add(new Coche(2, 1, 22000.0, "VWX234", "Hyundai", 4, 100)); // 1 rueda trabajada
        coches.add(new Coche(4, 0, 23000.0, "YZA567", "Renault", 4, 100)); // 0 ruedas trabajadas
        coches.add(new Coche(0, 3, 24000.0, "BCD890", "Peugeot", 5, 100)); // 3 ruedas trabajadas

        return coches;
    }

    public static List<Vehiculo> popularMotos() {
        List<Vehiculo> motos = new ArrayList<>();

        // Agregamos manualmente 10 objetos Moto con valores válidos
        motos.add(new Moto(0, 1, 8000.0, "XYZ123", "Yamaha", 250, 100)); // 1 rueda trabajada
        motos.add(new Moto(0, 2, 8500.0, "UVW456", "Suzuki", 300, 100)); // 2 ruedas trabajadas (máximo)
        motos.add(new Moto(2, 0, 9000.0, "RST789", "Kawasaki", 350, 100)); // 0 ruedas trabajadas
        motos.add(new Moto(1, 1, 9500.0, "OPQ012", "Ducati", 400, 100)); // 1 rueda trabajada
        motos.add(new Moto(0, 2, 10000.0, "LMN345", "Harley", 450, 100)); // 2 ruedas trabajadas
        motos.add(new Moto(1, 0, 10500.0, "JKL678", "BMW", 500, 100)); // 0 ruedas trabajadas
        motos.add(new Moto(1, 1, 11000.0, "GHI901", "Triumph", 550, 100)); // 1 rueda trabajada
        motos.add(new Moto(0, 2, 11500.0, "DEF234", "KTM", 600, 100)); // 2 ruedas trabajadas
        motos.add(new Moto(2, 0, 12000.0, "ABC567", "Honda", 650, 100)); // 0 ruedas trabajadas
        motos.add(new Moto(0, 1, 12500.0, "ZYX890", "Aprilia", 700, 100)); // 1 rueda trabajada

        return motos;
    }

}
