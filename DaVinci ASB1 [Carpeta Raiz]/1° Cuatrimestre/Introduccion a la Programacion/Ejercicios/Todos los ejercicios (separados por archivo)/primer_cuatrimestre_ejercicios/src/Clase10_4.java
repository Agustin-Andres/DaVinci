public class Clase10_4 {
    public static void main(String[] args) {

        int[] numerosRandom = new int[10];
        int numEvaluado = 0;
        boolean flag = false;

        for (int i = 0; i < numerosRandom.length; i++) {
            // generamos numero random
            int randomNumber = (int) (Math.random() * 10) + 1;

            System.out.println("El numero random en i es: " + numerosRandom[i]);
            for (int j = 0; j < numerosRandom.length - 1; j++) {
                System.out.println(" -- estamos comparando " + numerosRandom[i] + " con " + numerosRandom[j]);
                if (numerosRandom[i] == randomNumber) {
                    flag = true;

                }
                if (flag) {
                    numerosRandom[i] = randomNumber;

                }

            }

        }

        for (int i = 0; i < numerosRandom.length; i++) {
            System.out.print(numerosRandom[i] + " / ");

        }

    }

}
