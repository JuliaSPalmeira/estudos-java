package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class ValorAouB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int valorA= sc.nextInt();
        System.out.println("Digite o valor B: ");
        int valorB= sc.nextInt();


        int c = valorA;
        valorA = valorB;
        valorB = c;

        System.out.println(valorB);
        System.out.println(valorA);

    }
}

