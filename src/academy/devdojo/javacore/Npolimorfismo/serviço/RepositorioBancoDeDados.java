package academy.devdojo.javacore.Npolimorfismo.serviço;

import academy.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em um Banco de dados");
    }
}
