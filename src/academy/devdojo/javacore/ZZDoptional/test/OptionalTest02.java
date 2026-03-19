package academy.devdojo.javacore.ZZDoptional.test;

import academy.devdojo.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        //busca por tipo
       Optional<Manga> mangaByTitle = MangaRepository.findByTitle("boku no hero");
        mangaByTitle.ifPresent(m -> m .setTitle("boku no hero 2")); //se existe fazer alteração
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findByTitle(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "drifters",20));
        System.out.println(newManga);
    }
}
