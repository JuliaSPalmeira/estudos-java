package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();


        if (idade >= 18){
            System.out.println(nome+ " é maior de idade");
        }else {
            System.out.println(nome+ " é menor de idade");
        }

    }
}
