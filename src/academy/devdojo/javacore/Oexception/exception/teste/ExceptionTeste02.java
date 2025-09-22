package academy.devdojo.javacore.Oexception.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
        boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        }catch (IOException e){
            e.printStackTrace();
        };
        //o tratamento foi o caso  a linha 13 n for vc executra
        // oq fazer quando tiver catch. nunca deixe o bloco em branco
        // imprime tudo q aconteceu pras tentar identificar stack quqando errsa vlta
        // regra de negocio no cath n pode
    }
}
