package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino04 {
    public static void main(String[] args) {
        int[] numeros = {10,15,22,33,44,57};
        int contador = 0;

        for(int num: numeros){
            if(num %2 ==0){
                contador++;
            }
        }
        System.out.println("tem " +contador+ " numeros pares");
    }
}
// errei dnv pq coloquiei o sout dentro do for tava tirando do if e colocando no for e tava dando
// tem 1 n, tem 2 n, tem 3 numeros