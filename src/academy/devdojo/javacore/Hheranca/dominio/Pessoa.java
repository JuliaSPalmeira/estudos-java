package academy.devdojo.javacore.Hheranca.dominio;


public class Pessoa {
     protected String nome;
     protected String cpf;
     protected Endereco endereco;
     static {
         System.out.println("deentro do bloco estatico de pessoa ");
     }
    {
        System.out.println("bloco de inicialização de pessoa ");
    }
    {
        System.out.println("bloco de inicialização de pessoa 2");
    }

     public Pessoa(String nome){
         System.out.println("dentro do construtor de pessoa");
         this.nome = nome;
     }

     public Pessoa(String nome, String cpf){
         this(nome); //chama o de cima construtor essa tem q ser o primeiro executado
         this.cpf = cpf;
     }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() +" "+this.endereco.getCep());

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
