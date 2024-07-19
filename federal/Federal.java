package megaSena;

import java.util.Random;

public class Federal {
    public static void main(String[] args) {       
        
        Random random = new Random();
        int randomNumber = random.nextInt(100001);
        System.out.println("Numero: " + randomNumber);
    }
}
