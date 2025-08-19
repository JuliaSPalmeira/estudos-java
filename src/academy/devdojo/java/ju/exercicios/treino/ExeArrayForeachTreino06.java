package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino06 {
    public static void main(String[] args) {
        String[] nomes = {"java","é","muito","legal"};
        String frase ="";

        for(String palavra: nomes){
            frase += palavra + " ";

        }
        System.out.println(frase);
    }
}
/*oq eu errei estava tentadno somar int com string e n ia n tinha pensadoe em criar uma
string vazia somar as coisa e somar + " " espaço
*/