package academy.devdojo.javacore.Hheranca.teste;

import academy.devdojo.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Abigail");
    }
}
// o bloco de inicialização estatico da super classe é executado quando a jvm carrega a classe pai
// o bloco de inicialização estatico da sub classe é executado quando a jvm carrega a classe super
// 2 - alocado espaço em memoria para o objeto da superclasse
// cada atributo de superclasse criado e inicializado com vbalores  default ou que for passado da classe pai
// bloco de inicialização da superclasse é executado na ordem em q aparece
//construtor da superclasse é executado
//depopis ele repete pra classe filhas as seguintes funções
//alocado espaço em memoria para o objeto da subclasse
// cada atributo de subclasse criado e inicializado com vbalores  default ou que for passado da classe pai
// bloco de inicialização da subclasse é executado na ordem em q aparece
//construtor da subclasse é executado