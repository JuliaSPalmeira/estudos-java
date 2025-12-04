package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        int F = sc.nextInt();

        int C = (5 * ( F-32) / 9);
        System.out.println("A temperatura em Celcius é de: "+C);
        System.out.println("A temperatura em Fahrenheit é de: "+F);
    }
}
