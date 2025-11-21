package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário minimo");
        double salarioUsu = sc.nextDouble();

        double salarioMinimo = 1518;

        double quantSalarios = salarioUsu / salarioMinimo;

        System.out.println("O usuário recebe "+String.format("%.2f", quantSalarios) + " salarios minimos");
    }
}
