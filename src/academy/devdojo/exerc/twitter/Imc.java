package academy.devdojo.exerc.twitter;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu peso em kg: ");
        double peso = sc.nextDouble();
        System.out.println("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso /(altura * altura);
        System.out.println("Seu IMC é: "+ imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc < 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc < 29.99) {
             System.out.println(" Levemente acima do peso");
        } else if (imc < 34.9){
            System.out.println("Obesidade grau I");
        } else if (imc < 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else if (imc < 40) {
            System.out.println("Obesidade grau III (mórbida)");
        }
    }
}
