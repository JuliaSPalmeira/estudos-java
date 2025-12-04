package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class LadosTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int A = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        int B = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println("Triangulo equilatero");
        } else if (A == B || B == C || A == C) {
            System.out.println("Triangulo Isoceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }
    }
}
