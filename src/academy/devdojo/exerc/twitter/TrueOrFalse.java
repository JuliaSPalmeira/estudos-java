package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        boolean v1 = sc.nextBoolean();
        System.out.println("Digite outro valor");
        boolean v2 = sc.nextBoolean();

        if (v1 && v2 ){
            System.out.println("Ambos são verdadeiros");
        } else if (!v1 && !v2){
            System.out.println("Ambos são falsos");
        }
    }
}
