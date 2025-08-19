package academy.devdojo.java.ju.exercicios.treino;

public class Exercicioju08 {
    public static void main(String[] args) {
        int opcao =2;
        switch (opcao){
            case 1:
                System.out.println("Iniciar Jogo");
                break;
            case 2:
                System.out.println("Carregar jogo");
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
