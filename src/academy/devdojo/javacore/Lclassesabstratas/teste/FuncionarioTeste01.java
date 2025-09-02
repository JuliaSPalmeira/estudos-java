package academy.devdojo.javacore.Lclassesabstratas.teste;

import academy.devdojo.javacore.Lclassesabstratas.dominio.Dev;
import academy.devdojo.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
       Gerente gerente = new Gerente(7000,"Nami");
       Dev desenvolvedor = new Dev(12000,"touya");
        System.out.println(gerente);
        System.out.println(desenvolvedor);

    }
}
