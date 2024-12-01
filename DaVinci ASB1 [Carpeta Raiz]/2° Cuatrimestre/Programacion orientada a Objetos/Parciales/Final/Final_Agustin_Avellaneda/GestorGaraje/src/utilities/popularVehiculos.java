package utilities;

import Vehiculos.Coche;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class popularVehiculos {

    // desde que esta hardcodeado, el precio diario = precio diario setteado de
    // garaje tambien hardocodeado + ruedas pagas que se obtiene en el concern
    public static List<Vehiculo> popularCoches() {
        List<Vehiculo> coches = new ArrayList<>();

        coches.add(new Coche(2, 2, 3, 12000.0, "ABC123", "Toyota", 4, 100.0, true, false)); // Pago parcial
        coches.add(new Coche(1, 2, 2, 10000.0, "DEF456", "Ford", 4, 100.0, true, false)); // Pago parcial

        coches.add(new Coche(0, 4, 4, 15000.0, "GHI789", "Honda", 5, 100.0, false, true)); // Pago total
        coches.add(new Coche(1, 3, 4, 8000.0, "JKL012", "Chevrolet", 4, 100.0, false, true)); // Pago total
        /*
         * coches.add(new Coche(2, 0, 0, 9000.0, "PQR678", "Volkswagen", 4, 100.0,
         * false, false)); // Sin pago
         * coches.add(new Coche(1, 1, 0, 13000.0, "STU901", "Kia", 5, 100.0, false,
         * false)); // Sin pago
         * 
         * coches.add(new Coche(1, 2, 2, 11000.0, "YZA567", "Renault", 4, 100.0, true,
         * false)); // Pago parcial
         * coches.add(new Coche(0, 4, 3, 19000.0, "VWX234", "Hyundai", 4, 100.0, true,
         * false)); // Pago parcial
         * 
         * coches.add(new Coche(0, 4, 4, 21000.0, "BCD890", "Peugeot", 5, 100.0, false,
         * true)); // Pago total
         * coches.add(new Coche(2, 2, 4, 17000.0, "MNO345", "Nissan", 5, 100.0, false,
         * true)); // Pago total
         */
        return coches;
    }

    public static List<Vehiculo> popularMotos() {
        List<Vehiculo> motos = new ArrayList<>();

        motos.add(new Moto(1, 1, 1, 8000.0, "XYZ123", "Yamaha", 250, 100.0, true, false)); // Pago parcial
        motos.add(new Moto(1, 0, 1, 9500.0, "OPQ012", "Ducati", 400, 100.0, true, false)); // Pago parcial
        /*
         * motos.add(new Moto(1, 1, 1, 11000.0, "GHI901", "Triumph", 550, 100.0, true,
         * false)); // Pago parcial
         * motos.add(new Moto(1, 1, 1, 12500.0, "ZYX890", "Aprilia", 700, 100.0, true,
         * false)); // Pago parcial
         * 
         * motos.add(new Moto(0, 2, 2, 8500.0, "UVW456", "Suzuki", 300, 100.0, false,
         * true)); // Pago total
         * motos.add(new Moto(0, 2, 2, 10000.0, "LMN345", "Harley-Davidson", 100, 200.0,
         * false, true)); // Pago total
         * motos.add(new Moto(0, 2, 2, 11500.0, "DEF234", "KTM", 600, 100.0, false,
         * true)); // Pago total
         */
        motos.add(new Moto(2, 0, 0, 9000.0, "RST789", "Kawasaki", 350, 100.0, false, false)); // Sin pago
        motos.add(new Moto(1, 0, 0, 10500.0, "JKL678", "BMW", 500, 100.0, false, false)); // Sin pago
        motos.add(new Moto(2, 0, 0, 12000.0, "ABC567", "Honda", 650, 100.0, false, false)); // Sin pago

        return motos;
    }

}
