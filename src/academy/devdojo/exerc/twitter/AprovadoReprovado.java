package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaSis = 4;

        double a = 0;
        for (int i = 0; i < notaSis; i++) { //inicial; condição de parada; quanto somaa 1me 1 i++
            System.out.println("Digite a nota " + (i + 1)+": "); // próxima pergunta
            double valor = sc.nextDouble(); //digitar
            a = a + valor; // atribuir na variavel
        }
        double media = a / notaSis;
        System.out.println(media);
        sc.close();
    }
}
