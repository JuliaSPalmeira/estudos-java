package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.domino.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Julia");
        funcionario.setIdade(21);
        funcionario.setSalario(new double[]{1200, 987.32,2000});

        funcionario.imprime();
        System.out.println("Média "+funcionario.getMedia());;
    }
}
