package academy.devdojo.javacore.Gassociacao.teste;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");// cadastro so sistemas
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time); //associou
        jogador1.imprime();
    }
}
