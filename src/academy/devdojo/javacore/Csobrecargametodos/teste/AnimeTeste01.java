package academy.devdojo.javacore.Csobrecargametodos.teste;

import academy.devdojo.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("attack on titan","tv",12);//so digitar as coisa q aprece o tipo
//        anime.setNome("attack on titan");
//        anime.setTipo("tv");
//        anime.setEpisodios(12);
        anime.setGenero("Ação");
        anime.imprime();
    }
}
