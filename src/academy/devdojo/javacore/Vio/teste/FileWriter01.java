package academy.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw =  new FileWriter(file,true);){
            fw.write("O devDojo é o melhor curso do brasil\n continuando mas n garante q vai funcionar em todos so");
            fw.flush(); //para forçar a gravação imediata de dados que estão temporariamente armazenados em um buffer de memória para o seu destino final, como um arquivo em disco.
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static FileWriter getFw(File file) throws IOException {
        return new FileWriter(file);
    }
}
