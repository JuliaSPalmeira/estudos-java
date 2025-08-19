package academy.devdojo.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome Abaixo");
        String nome = entrada.nextLine();
        System.out.println("digite sua idade");
        int idade = entrada.nextInt();
        System.out.println("Digite m ou f para o seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------");
        System.out.println("Nome "+nome);
        System.out.println("Idade "+idade);
        System.out.println("Sexo "+sexo);
    }
}
