package academy.devdojo.javacore.ZZZlambdas.test;

import academy.devdojo.javacore.ZZZlambdas.dominio.Anime;
import academy.devdojo.javacore.ZZZlambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("attak on titan", 43),new Anime("One piece",900),new Anime("naruto",500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
