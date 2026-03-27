package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//referencia parra um construtor
public class MethodsReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new; //construtor sem parrametros
        AnimeComparators animeComparators = newAnimeComparators.get();
//        //("retorna outro objeto")
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("attak on titan",
                43),new Anime("One piece",900),new Anime("naruto",500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes ) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = (title, episodes ) -> new Anime(title, episodes);
        System.out.println(animeBiFunction2.apply("Super campeões", 36));
    }
}
