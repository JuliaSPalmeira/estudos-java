package academy.devdojo.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");

    }
    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivos");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
        System.out.println("checking permission in a file");
    }
}
