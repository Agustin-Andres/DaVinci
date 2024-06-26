public class MenuConversorDivisas {

    //Menu secundario, de divisas
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

    // retorna el valor de la divisa
    public static double compararDivisa(double pesos, double divisa) {
        return pesos / divisa;
    }

    //retorna el valor de la divisa seleccionada
    public static void mostrarConversion(int opcionDivisa, double pesosArg, double tipoDeCambio[][], int ultimoMes) {

        double conversion;
        switch (opcionDivisa) {
            // USD
            case 1:
                conversion = compararDivisa(pesosArg, tipoDeCambio[0][ultimoMes - 1]);
                System.out.println(String.format("El Dolar cotiza a $%.2f", tipoDeCambio[0][ultimoMes - 1]));
                System.out.println(String.format("$%s (ARG) equivalen a $%.2f USD", pesosArg, conversion));
                break;

            // EUR
            case 2:
                conversion = compararDivisa(pesosArg, tipoDeCambio[1][ultimoMes - 1]);
                System.out.println(String.format("El Euro cotiza a $%s", tipoDeCambio[1][ultimoMes - 1]));
                System.out.println(String.format("$%s (ARG) equivalen a $%.2f EUR", pesosArg, conversion));
                break;

            // GBP
            case 3:
                conversion = compararDivisa(pesosArg, tipoDeCambio[2][ultimoMes - 1]);
                System.out.println(
                        String.format("La Libra Esterlina cotiza a $%.2f", tipoDeCambio[2][ultimoMes - 1]));
                System.out.println(String.format("$%s (ARG) equivalen a $%.2f GBP", pesosArg, conversion));
                break;

            // CNY
            case 4:
                conversion = compararDivisa(pesosArg, tipoDeCambio[3][ultimoMes - 1]);
                System.out.println(String.format("El Yuan cotiza a $%.2f", tipoDeCambio[3][ultimoMes - 1]));
                System.out.println(String.format("$%s (ARG) equivalen a $%.2f CNY", pesosArg, conversion));
                break;

            // BRL
            case 5:
                conversion = compararDivisa(pesosArg, tipoDeCambio[4][ultimoMes - 1]);
                System.out.println(String.format("El Real cotiza a $%.2f", tipoDeCambio[4][ultimoMes - 1]));
                System.out.println(String.format("$%s (ARG) equivalen a $%.2f BRL", pesosArg, conversion));
                break;

        }

    }

}
