package academy.devdojo.java.ju.exercicios.treino;

public class ExeArrayForeachTreino08 {
    public static void main(String[] args) {
        int[] numeros = {-5,3,-1,0,-8,4};
        int contador =0;

        for(int num: numeros){
            if ( num < 0 ){
                contador++;
                System.out.println(num);
            }
        }

    }
}
