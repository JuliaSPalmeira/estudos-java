package academy.devdojo.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("deentro do bloco estatico de funcionario ");
    }
    {
        System.out.println("bloco de inicialização de funcionario 1 ");
    }
    {
        System.out.println("bloco de inicialização de funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("dentro do constrututor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void  relatorioPagamento(){
        System.out.println("Eu "+this.nome+"Recebi o salario de"+ this.salario); //get nome épublicpo
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
