package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Seven deadly sins",19.9));
        mangas.add(new Manga(1L,"one piece",9.5));
        mangas.add(new Manga(4L,"Attack on titan",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.2));
        mangas.add(new Manga(2L,"Black clover",2.9));

       // Collections.sort(mangas);

        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L,"Black clover",2.9); //pegar esse manga
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator)); // da lista, quero esse
    }
}
