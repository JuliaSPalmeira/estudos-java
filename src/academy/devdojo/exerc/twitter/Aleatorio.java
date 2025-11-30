package academy.devdojo.exerc.twitter;
import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        double min = 0;
        double max = 100;

        double numAle = (int) (Math.random() * (max - min + 1)+ min);
        System.out.println("O número aleatório é: " + numAle);
    }
}
