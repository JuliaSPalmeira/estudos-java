package academy.devdojo.javacore.Eblocosinicializacao.teste;

import academy.devdojo.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("on piece");

        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }


    }
}
