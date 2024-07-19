package megaSena;

import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {

        int[] numeros = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            numeros[i] = random.nextInt(60) + 1;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    i--;
                    break;
                }
            }            
        }
        System.out.println("Números gerados: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(numeros[i] + " ");
            }
    }
}
