package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        int A = sc.nextInt();
        System.out.println("Digite a nota 2: ");
        int B = sc.nextInt();
        System.out.println("Digite a nota 3: ");
        int C = sc.nextInt();

        int nota = A + B + C;
        double media = (double) (A + B + C) / 3;
        System.out.println("A média do aluno é: "+ media);

    }

}
