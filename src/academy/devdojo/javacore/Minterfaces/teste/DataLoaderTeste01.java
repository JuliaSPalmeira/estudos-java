package academy.devdojo.javacore.Minterfaces.teste;

import academy.devdojo.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader DataBaseLoader = new DatabaseLoader();
        FileLoader FileLoader =  new FileLoader();
        DataBaseLoader.load();
        FileLoader.load();

        DataBaseLoader.remove();
        FileLoader.remove();
        DataBaseLoader.checkPermission();
        FileLoader.checkPermission();

        DataBaseLoader.retriveMaxDataSize();
        DataLoader.retriveMaxDataSize();
    }
}
