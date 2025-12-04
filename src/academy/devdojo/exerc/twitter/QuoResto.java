package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class QuoResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        int vA= sc.nextInt();
        System.out.println("Digite o valor B: ");
        int vB= sc.nextInt();

        int quo = (vA / vB);
        int rest = vA % vB;
        System.out.println("O valor do quociente é "+quo);
        System.out.println("O valor do resto da divisão é "+rest);
    }
}
