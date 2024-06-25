public class MenuConversorDivisas {

    public static void mostrarMenuDivisas() {
        System.out.println("\nDivisas disponibles:");
        System.out.println("1. Dólar (USD)\n" + //
                "2. Euro (EUR)\n" + //
                "3. Libra Esterlina (GBP)\n" + //
                "4. Yuan (CNY)\n" + //
                "5. Real (BRL)\n" + //
                "6. Ver tipos de cambio histórico\n" + //
                "7. Salir");
    }
    public static double compararDivisa(double pesos, double divisa){
        return pesos / divisa;
    }


}
