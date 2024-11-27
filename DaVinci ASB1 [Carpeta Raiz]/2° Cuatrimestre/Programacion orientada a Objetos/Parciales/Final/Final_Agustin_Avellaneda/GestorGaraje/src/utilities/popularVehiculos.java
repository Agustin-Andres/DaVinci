package utilities;

import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class popularVehiculos {

    public static List<Vehiculo> popularCoches() {
        List<Vehiculo> coches = new ArrayList<>();

        // Ejemplos de coches para popular
        coches.add(new Coche(2, 2, 12000.0, "ABC123", "Toyota", 4, 150.0, true, true)); // Pago total
        coches.add(new Coche(1, 2, 10000.0, "DEF456", "Ford", 4, 120.0, true, false)); // Pago parcial
        coches.add(new Coche(0, 4, 15000.0, "GHI789", "Honda", 5, 200.0, false, true)); // Pago total
        coches.add(new Coche(1, 3, 8000.0, "JKL012", "Chevrolet", 4, 180.0, true, false)); // Pago parcial
        coches.add(new Coche(0, 4, 17000.0, "MNO345", "Nissan", 5, 160.0, false, true)); // Pago total
        coches.add(new Coche(2, 0, 9000.0, "PQR678", "Volkswagen", 4, 140.0, false, false)); // Sin pago
        coches.add(new Coche(1, 1, 13000.0, "STU901", "Kia", 5, 130.0, true, false)); // Pago parcial
        coches.add(new Coche(0, 4, 19000.0, "VWX234", "Hyundai", 4, 190.0, false, true)); // Pago total
        coches.add(new Coche(1, 3, 11000.0, "YZA567", "Renault", 4, 160.0, true, false)); // Pago parcial
        coches.add(new Coche(0, 4, 21000.0, "BCD890", "Peugeot", 5, 200.0, false, true)); // Pago total

        return coches;
    }

    public static List<Vehiculo> popularMotos() {
        List<Vehiculo> motos = new ArrayList<>();

        // Agregamos manualmente 10 objetos Moto con valores válidos y variados
        motos.add(new Moto(1, 1, 8000.0, "XYZ123", "Yamaha", 250, 100.0, true, false)); // Pago parcial
        motos.add(new Moto(0, 2, 8500.0, "UVW456", "Suzuki", 300, 120.0, false, true)); // Pago total
        motos.add(new Moto(2, 0, 9000.0, "RST789", "Kawasaki", 350, 80.0, false, false)); // Sin pago
        motos.add(new Moto(1, 1, 9500.0, "OPQ012", "Ducati", 400, 150.0, true, false)); // Pago parcial
        motos.add(new Moto(0, 2, 10000.0, "LMN345", "Harley-Davidson", 450, 200.0, false, true)); // Pago total
        motos.add(new Moto(1, 0, 10500.0, "JKL678", "BMW", 500, 90.0, false, false)); // Sin pago
        motos.add(new Moto(1, 1, 11000.0, "GHI901", "Triumph", 550, 110.0, true, false)); // Pago parcial
        motos.add(new Moto(0, 2, 11500.0, "DEF234", "KTM", 600, 140.0, false, true)); // Pago total
        motos.add(new Moto(2, 0, 12000.0, "ABC567", "Honda", 650, 95.0, false, false)); // Sin pago
        motos.add(new Moto(0, 1, 12500.0, "ZYX890", "Aprilia", 700, 100.0, true, false)); // Pago parcial

        return motos;
    }

}
