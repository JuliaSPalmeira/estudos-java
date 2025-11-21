package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        double valor = sc.nextDouble();

        double valorReajuste = (valor * 0.05) + valor;
        System.out.println("Valor com reajuste de 5% é "+valorReajuste);
    }
}
