package academy.devdojo.javacore.Ycolecoes.Dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private  Long  id;
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"Id não pode ser null"); //n aceitam ser nulos da erro
        Objects.requireNonNull(nome,"Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade =  quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        //negativo se o this < outromanga
        //se this == outroManga, return 0
        //positivo se this > outroManga
//       if (this.id < outromanga.getId()){
//           return -1;
//       } else if (this.id.equals(outromanga.getId())) {
//           return 0;
//       }else {
//           return 1;
//       }
       // return this.id.compareTo(outromanga.getId()); //pelo id
        //return Double.compare(preco,outroManga.getPreco()); //peço
        return this.nome.compareTo(outroManga.getNome()); //pelo nome
    }
}
