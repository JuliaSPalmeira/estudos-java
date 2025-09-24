package academy.devdojo.javacore.Npolimorfismo.teste;

import academy.devdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.javacore.Npolimorfismo.serviço.RepositorioArquivo;
import academy.devdojo.javacore.Npolimorfismo.serviço.RepositorioBancoDeDados;
import academy.devdojo.javacore.Npolimorfismo.serviço.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
