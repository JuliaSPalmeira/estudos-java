package academy.devdojo.javacore.Lclassesabstratas.dominio;

public class Dev extends Funcionario {
    public Dev(double salario, String nome) {
        super(salario, nome);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

}
