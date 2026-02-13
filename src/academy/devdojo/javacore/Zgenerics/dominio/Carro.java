package academy.devdojo.javacore.Zgenerics.dominio;

public class Carro {
    private String nome; //atributo



    public Carro(String nome) { //construtor
        this.nome = nome;
    }

    @Override //to string
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
