package academy.devdojo.exerc.twitter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class OrdemValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        int C = sc.nextInt();

        Integer[] valores = {A,B,C}; // cria um array (vetor) chamado valores que armazena os três números inteiros que o usuário digitou (A, B e C).
        // O que define o tipo do array é a palavra que vem antes dos colchetes []

        Arrays.sort(valores, Comparator.reverseOrder());

        System.out.println("valores em ordem decrescent: ");
        System.out.println(valores[0]+">"+ valores[1]+ ">"+ valores[2]);

        sc.close();

    }
}
