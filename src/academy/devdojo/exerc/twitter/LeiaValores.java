package academy.devdojo.exerc.twitter;
// 1 - Faça um algoritmo que leia os valores de A, B, C e
// em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C


import java.util.Scanner;

public class LeiaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = sc.nextDouble();

        double soma = A + B;

        System.out.println("A soma de A + B é "+ soma);
        if (soma < C){
            System.out.println("A soma de A + B é menor que o valor de C");
        } else if (soma > C) {
            System.out.println("A soma de A + B é maior que C que é "+ C);
        } else{
            System.out.println("A soma de A + B é igual a C");
        }
    }
}
