package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número ");
        int num = sc.nextInt();

        int ant = num - 1;
        int suc = num + 1;
        System.out.println("o antecessor de "+num +" é "+ant+ " e o sucessor é "+suc);
    }
}
