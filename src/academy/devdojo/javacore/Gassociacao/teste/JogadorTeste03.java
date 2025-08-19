package academy.devdojo.javacore.Gassociacao.teste;

import academy.devdojo.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador =new Jogador("Cafu");
        Time time = new Time("brasil");
        Jogador[] jogadors = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadors);
        System.out.println("---Jogador---");
        jogador.imprime();
        System.out.println("---Jogador---");
        time.imprime();
    }
}
