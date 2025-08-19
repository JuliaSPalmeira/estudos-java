package academy.devdojo.javacore.Bintroducaometodos.domino;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){    // sem parametro pq ela ja está dentro da classe então ele referencia a td dentro dela
        System.out.println("---------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    // palavra reservada pra referencia oq da dentro (this)

}
