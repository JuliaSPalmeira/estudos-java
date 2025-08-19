package academy.devdojo.javacore.Dconstrutores.test;

import academy.devdojo.javacore.Dconstrutores.dominio.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("attack on titan","tv",12,"Glibi");
        anime.setGenero("Ação");
        anime.imprime();

    }
}
//  anime.init("attack on titan","tv",12);//so digitar as coisa q aprece o tipo
//        anime.setNome("attack on titan");
//        anime.setTipo("tv");
//        anime.setEpisodios(12);