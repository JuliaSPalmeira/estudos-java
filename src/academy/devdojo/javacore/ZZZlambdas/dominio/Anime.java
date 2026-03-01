package academy.devdojo.javacore.ZZZlambdas.dominio;

public class Anime {
    private String title;
    private  int episodes;

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodes=" + episodes+
                '}';
    }

    public Anime(String title, int episodes) {
        this.title = title;
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getTitle() {
        return title;
    }


}
