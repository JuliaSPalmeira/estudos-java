package academy.devdojo.javacore.Npolimorfismo.serviço;

import academy.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("salvando em uma Memoria");
    }
}
