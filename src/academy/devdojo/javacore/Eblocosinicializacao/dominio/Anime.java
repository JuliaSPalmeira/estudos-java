package academy.devdojo.javacore.Eblocosinicializacao.dominio;

public class Anime {
   private String nome;
   private int[] episodios;
    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i <episodios.length ; i++) {
            episodios[i]= i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep: this.episodios){
            System.out.println(ep + "");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
