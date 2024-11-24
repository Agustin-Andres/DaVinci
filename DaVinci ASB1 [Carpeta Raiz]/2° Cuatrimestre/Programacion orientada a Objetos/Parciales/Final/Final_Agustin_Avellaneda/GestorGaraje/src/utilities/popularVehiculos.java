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
        coches.add(new Coche(2, 15000.0, 120000.0, "ABC123", "Toyota", 4)); // 2 ruedas trabajadas
        coches.add(new Coche(3, 16000.0, 130000.0, "DEF456", "Ford", 4)); // 3 ruedas trabajadas
        coches.add(new Coche(4, 17000.0, 140000.0, "GHI789", "Honda", 5)); // 4 ruedas trabajadas (máximo)
        coches.add(new Coche(0, 18000.0, 150000.0, "JKL012", "Chevrolet", 4)); // 0 ruedas trabajadas
        coches.add(new Coche(1, 19000.0, 160000.0, "MNO345", "Nissan", 5)); // 1 rueda trabajada
        coches.add(new Coche(4, 20000.0, 170000.0, "PQR678", "Volkswagen", 4)); // 4 ruedas trabajadas
        coches.add(new Coche(2, 21000.0, 180000.0, "STU901", "Kia", 5)); // 2 ruedas trabajadas
        coches.add(new Coche(1, 22000.0, 190000.0, "VWX234", "Hyundai", 4)); // 1 rueda trabajada
        coches.add(new Coche(0, 23000.0, 200000.0, "YZA567", "Renault", 4)); // 0 ruedas trabajadas
        coches.add(new Coche(3, 24000.0, 210000.0, "BCD890", "Peugeot", 5)); // 3 ruedas trabajadas

        return coches;
    }

    public static List<Vehiculo> popularMotos() {
        List<Vehiculo> motos = new ArrayList<>();

        // Agregamos manualmente 10 objetos Moto con valores válidos
        motos.add(new Moto(1, 8000.0, 30000.0, "XYZ123", "Yamaha", 250)); // 1 rueda trabajada
        motos.add(new Moto(2, 8500.0, 32000.0, "UVW456", "Suzuki", 300)); // 2 ruedas trabajadas (máximo)
        motos.add(new Moto(0, 9000.0, 34000.0, "RST789", "Kawasaki", 350)); // 0 ruedas trabajadas
        motos.add(new Moto(1, 9500.0, 36000.0, "OPQ012", "Ducati", 400)); // 1 rueda trabajada
        motos.add(new Moto(2, 10000.0, 38000.0, "LMN345", "Harley", 450)); // 2 ruedas trabajadas
        motos.add(new Moto(0, 10500.0, 40000.0, "JKL678", "BMW", 500)); // 0 ruedas trabajadas
        motos.add(new Moto(1, 11000.0, 42000.0, "GHI901", "Triumph", 550)); // 1 rueda trabajada
        motos.add(new Moto(2, 11500.0, 44000.0, "DEF234", "KTM", 600)); // 2 ruedas trabajadas
        motos.add(new Moto(0, 12000.0, 46000.0, "ABC567", "Honda", 650)); // 0 ruedas trabajadas
        motos.add(new Moto(1, 12500.0, 48000.0, "ZYX890", "Aprilia", 700)); // 1 rueda trabajada

        return motos;
    }

}
