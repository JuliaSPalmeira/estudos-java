package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino09 {
    public static void main(String[] args) {
        String[] palavras = {"Amor","Casa", "Avião","Sol","alegria"};
        int contador = 0;

        for(String pa: palavras){
            if(pa.startsWith("A") || pa.startsWith("a")){
                contador++;
                System.out.println(pa);
            }
        }

    }
}
