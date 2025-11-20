package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A ");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B ");
        int B = sc.nextInt();

        int C = 0;

        if (A == B){
            C = A + B;
        } else{
            C = A * B;
        }
        System.out.println(C);
    }

}
