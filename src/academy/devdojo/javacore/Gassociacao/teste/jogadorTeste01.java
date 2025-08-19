package academy.devdojo.javacore.Gassociacao.teste;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;

public class jogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador :  jogadores){
            jogador.imprime();
        }
    }


}
