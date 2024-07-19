package megaSena;

import java.util.Random;

public class JogoDoBicho {
    public static void main(String[] args) {       
        
        Random random = new Random();
        int randomNumber = random.nextInt(10001);
        System.out.println("Numero: " + randomNumber);
    }
    
}
