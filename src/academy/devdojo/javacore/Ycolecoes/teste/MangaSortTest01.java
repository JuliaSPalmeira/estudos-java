package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Seven deadly sins",19.9));
        mangas.add(new Manga(1L,"one piece",9.5));
        mangas.add(new Manga(4L,"Attack on titan",3.2));
        mangas.add(new Manga(3L,"Pokemon",11.2));
        mangas.add(new Manga(2L,"Black clover",2.9));
        System.out.println(mangas);
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("----------");
        Collections.sort(mangas);
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        System.out.println("----------");
        Collections.sort(mangas,new MangaByIdComparator());
      //  mangas.sort(new MangaByIdComparator()); temq passae um obj q é um comparator
        for (Manga manga : mangas){
            System.out.println(manga);
        }
        
    }
}
