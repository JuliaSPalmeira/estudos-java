package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Seven deadly sins", 19.9, 0));
        mangas.add(new Manga(1L, "one piece", 9.5, 5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.2, 2));
        mangas.add(new Manga(2L, "Black clover", 2.9, 0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
