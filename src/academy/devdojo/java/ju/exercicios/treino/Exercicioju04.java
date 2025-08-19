package academy.devdojo.java.ju.exercicios.treino;

public class Exercicioju04 {
    public static void main(String[] args) {
        boolean temDinheiro = true;
        boolean temTempo = false ;
        if(temDinheiro && temTempo) {
            System.out.println("Pode Viajar!");
        }else if(temDinheiro || temTempo ){
            System.out.println("Talvez dê para viajar!");
        }else{
            System.out.println("Sem chance de viajar!");
        }
    }
}
