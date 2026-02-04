package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Seven deadly sins");
        mangas.add("one piece");
        mangas.add("Attack on titan");
        mangas.add("Pokemon");
        mangas.add("Black clover");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        Collections.sort(dinheiros);

        for (String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);

       // new Manga(null,null, 0);
    }
}
