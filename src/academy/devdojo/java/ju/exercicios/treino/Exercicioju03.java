package academy.devdojo.java.ju.exercicios.treino;

public class Exercicioju03 {
    public static void main(String[] args) {
        double nota1 = 6.0;
        double nota2 = 8.5;

        double media = (nota1 + nota2) /2;
        System.out.println("Média: "+media);
        if(media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
