package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino07 {
    public static void main(String[] args) {
        int[] valores ={23,89,15,92,31,70};
        int maior =0;

        for(int num: valores){
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número é " + maior);
    }
}
