package academy.devdojo.java.ju.exercicios.treino;

public class Exercicioju13 {
    public static void main(String[] args) {
        String[] palavras = {"victor", "julia", "luffy","mel"};
        int contador= 0;

        for(String nome: palavras){
            int letras = nome.length();
            if(letras > 5 ){
                System.out.println(nome);
                contador++;
            }

        }
        System.out.println("há "+contador +" palavras com mais de 5 letras");

    }
}
