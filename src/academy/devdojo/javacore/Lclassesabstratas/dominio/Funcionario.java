package academy.devdojo.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("imprimindo");
    }
}
