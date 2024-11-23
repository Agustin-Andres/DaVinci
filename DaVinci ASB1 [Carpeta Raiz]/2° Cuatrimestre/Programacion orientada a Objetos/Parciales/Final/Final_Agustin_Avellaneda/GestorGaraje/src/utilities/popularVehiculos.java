package utilities;

import java.util.ArrayList;
import java.util.List;

import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class popularVehiculos {

    //populamos el coche
    public static List<Vehiculo> popularCoches() {
        List<Vehiculo> coches = new ArrayList<>();
        // Agregamos manualmente 10 objetos Coche
        coches.add(new Coche(4, 15000.0, 120000.0, "ABC123", "Toyota", 4));
        coches.add(new Coche(4, 16000.0, 130000.0, "DEF456", "Ford", 4));
        coches.add(new Coche(4, 17000.0, 140000.0, "GHI789", "Honda", 5));
        coches.add(new Coche(4, 18000.0, 150000.0, "JKL012", "Chevrolet", 4));
        coches.add(new Coche(4, 19000.0, 160000.0, "MNO345", "Nissan", 5));
        coches.add(new Coche(4, 20000.0, 170000.0, "PQR678", "Volkswagen", 4));
        coches.add(new Coche(4, 21000.0, 180000.0, "STU901", "Kia", 5));
        coches.add(new Coche(4, 22000.0, 190000.0, "VWX234", "Hyundai", 4));
        coches.add(new Coche(4, 23000.0, 200000.0, "YZA567", "Renault", 4));
        coches.add(new Coche(4, 24000.0, 210000.0, "BCD890", "Peugeot", 5));
        return coches;
    }

    //populamos motos
    public static List<Vehiculo> popularMotos() {
        List<Vehiculo> motos = new ArrayList<>();
        // Agregamos manualmente 10 objetos Moto
        motos.add(new Moto(2, 8000.0, 30000.0, "XYZ123", "Yamaha", 250));
        motos.add(new Moto(2, 8500.0, 32000.0, "UVW456", "Suzuki", 300));
        motos.add(new Moto(2, 9000.0, 34000.0, "RST789", "Kawasaki", 350));
        motos.add(new Moto(2, 9500.0, 36000.0, "OPQ012", "Ducati", 400));
        motos.add(new Moto(2, 10000.0, 38000.0, "LMN345", "Harley", 450));
        motos.add(new Moto(2, 10500.0, 40000.0, "JKL678", "BMW", 500));
        motos.add(new Moto(2, 11000.0, 42000.0, "GHI901", "Triumph", 550));
        motos.add(new Moto(2, 11500.0, 44000.0, "DEF234", "KTM", 600));
        motos.add(new Moto(2, 12000.0, 46000.0, "ABC567", "Honda", 650));
        motos.add(new Moto(2, 12500.0, 48000.0, "ZYX890", "Aprilia", 700));
        return motos;
    }


}
