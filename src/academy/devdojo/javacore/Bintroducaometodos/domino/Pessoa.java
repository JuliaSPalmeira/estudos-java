package academy.devdojo.javacore.Bintroducaometodos.domino;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);// só preciso colocar this se existir outra var com mesmo nome dentro do imprime()
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public  void setIdade(int idade){
        if (idade < 0) {
            System.out.println("idade inválida");
            return;
        }
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
