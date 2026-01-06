package academy.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriated = fileDiretorio.mkdir();
        System.out.println("pasta criada? "+isDiretorioCriated);

        //arquivo dentro do diretorio
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");//filefiretorio ja tem refeencia e manda pra dentro da pasta //cria arquivo na raiz do projeto
        boolean isFileCreated = false;
        try {
            isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("arquivo.txt criado?"+isFileCreated);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt"); //criando novo obj destino
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed); // renomear
        System.out.println("Aruivo.txt renomedado?"+isRenamed);
        // saiu da pasta pra manter coloca filediretorio

        //renomear diretorio
        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado =  fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("diretorio pasta renomeado?"+isDiretorioRenomeado);

    }
}
