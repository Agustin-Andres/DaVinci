import java.util.Scanner;

public class Grados {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero en celcio:");

        int cel = input.nextInt();
        double far = (cel * 9/5) + 32;

        System.out.println("El numero en farenheit es: " + far);
        input.close();
    }
}
