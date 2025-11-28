package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento");
        System.out.println(" [1] = Pix \n [2] = Crédito \n [3] = Cartão 2x \n [4] = Cartão 3x \n");
        int formaPagamento = sc.nextInt();

        int ps5 = 2000;

        switch (formaPagamento){
            case 1:
                System.out.println("O valor a se pago é de "+(ps5 - (ps5 * 0.15)));
                break;
            case 2:
                System.out.println("O valor a se pago é de "+(ps5 - (ps5 * 0.10)));
                break;
            case 3:
                System.out.println("O valor a se pago é de "+ps5);
                break;
            case 4:
                System.out.println("O valor a se pago é de "+(ps5 + (ps5 * 0.10)));
                break;
            default:
                System.out.println("Digite uma opção válida");
        }
        sc.close();
    }
}
