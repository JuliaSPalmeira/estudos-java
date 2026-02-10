package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
        public static void main(String[] args) {
            Consumidor consumidor1 = new Consumidor("William Suane");
            Consumidor consumidor2 = new Consumidor("Julia Palmeira");

            Manga manga1 =new Manga(5L, "Seven deadly sins", 19.9);
            Manga manga2 =new Manga(1L, "one piece", 9.5);
            Manga manga3 =new Manga(4L, "Attack on titan", 3.2);
            Manga manga4 =new Manga(3L, "Pokemon", 11.2);
            Manga manga5 =new Manga(2L, "Black clover", 2.9);

            List<Manga> mangaConsumidorList = List.of(manga1,manga2, manga3); //var pra uma lista de objetos
            List<Manga> mangaConsumidorList2 = List.of(manga3,manga4); //var pra uma lista de objetos

            Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
            consumidorManga.put(consumidor1, mangaConsumidorList);
            consumidorManga.put(consumidor2, mangaConsumidorList2);

            for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()){
                System.out.println("---------"+entry.getKey().getNome());
                for (Manga manga : entry.getValue()){
                    System.out.println("---------"+manga.getNome());
                }
            }

        }
    }

