package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.domino.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "jiraya";
//        pessoa.idade = 70 ;
        pessoa.setNome("Julia");
        pessoa.setIdade(22);
        pessoa.imprime();
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }
}
