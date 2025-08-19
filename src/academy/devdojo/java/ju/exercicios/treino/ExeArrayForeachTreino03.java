package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino03 {
    public static void main(String[] args) {
        int[] valores = {1,3,5,7,9};
        int soma = 0;

        for(int num: valores){
           soma +=num;
        }
        System.out.println("o total da soma dos valores é "+ soma);
    }
}
//fiz tudo certo meu erro foi colocar o sout dentro do foreach :(