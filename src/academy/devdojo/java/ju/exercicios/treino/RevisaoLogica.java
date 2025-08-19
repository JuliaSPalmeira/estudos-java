package academy.devdojo.java.ju.exercicios.treino;

public class RevisaoLogica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
         } ;
        for (int[] num: matriz){
            for (int n : num){
                System.out.println(n);
            }
        }

    }
}
