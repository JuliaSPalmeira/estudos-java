package academy.devdojo.java.ju.exercicios.treino;

public class Repeticao {
    // Crie um programa que use um laço for para imprimir os números de 1 a 10.
    public static void main(String[] args) {
        int[] numeros = {1,25,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if (num == 25 || num ==3){
                System.out.println(num);
            }
        }
    }
}
