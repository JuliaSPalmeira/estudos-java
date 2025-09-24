package academy.devdojo.javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected   double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    //eu tenho um produto q tem q ter nome e valor obrigatorio
    // implementa taxavel pq tem o metodo mas n sou obrigada colocar aq pq eu quero dos produtos concretos n no geral ai em cada produto especifico eu tenho q colocar
}
