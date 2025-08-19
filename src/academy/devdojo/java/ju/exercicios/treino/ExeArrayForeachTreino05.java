package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino05 {
    public static void main(String[] args) {
        String[] nomes = {"Lara","Fernanda","tiago","ana"};
        int contador = 0;

        for(String nom: nomes){
            if(nom.length() > 5 ){
                contador++;
                System.out.println("tem "+contador +" nome com mais de 5 letras que é "+nom);
            }

        }
    }
}

// eu sabia q era nom> 5 mas tava tipo como se nom é string (ai o gpt me lembrou do length()