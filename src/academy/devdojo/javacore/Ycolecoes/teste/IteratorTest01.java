package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L, "Seven deadly sins", 19.9, 0));
        mangas.add(new Manga(1L, "one piece", 9.5, 5));
        mangas.add(new Manga(4L, "Attack on titan", 3.2, 0));
        mangas.add(new Manga(3L, "Pokemon", 11.2, 2));
        mangas.add(new Manga(2L, "Black clover", 2.9, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0){ //next pagando obj
//                mangaIterator.remove();
//                //programação iperativa
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        //navega por todos os mangas e remove se vc achar oq eu quero
        //programação funcional
        System.out.println(mangas);
    }
}
