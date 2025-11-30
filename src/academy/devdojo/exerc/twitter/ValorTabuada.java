package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class ValorTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int valor = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor+"x"+i+"="+(valor*i));

        }
    }
}
