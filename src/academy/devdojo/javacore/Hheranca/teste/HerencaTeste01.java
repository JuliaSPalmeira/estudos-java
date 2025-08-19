package academy.devdojo.javacore.Hheranca.teste;

import academy.devdojo.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.javacore.Hheranca.dominio.Pessoa;

public class HerencaTeste01 {
    public static void main(String[] args) {
        Endereco endereco =  new Endereco();
        endereco.setRua("rua 3");
        endereco.setCep("012345-09");
        Pessoa pessoa = new Pessoa("Julia");
        pessoa.setCpf("000.0130");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Abigail");

        funcionario.setCpf("455572-98");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------");
        funcionario.imprime();
    }
}
