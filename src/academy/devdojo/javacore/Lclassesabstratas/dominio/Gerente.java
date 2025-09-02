package academy.devdojo.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
