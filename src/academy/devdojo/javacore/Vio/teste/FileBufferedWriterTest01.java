package academy.devdojo.javacore.Vio.teste;

import java.io.*;

public class FileBufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw =  new FileWriter(file, true);
            BufferedWriter br =  new BufferedWriter(fw)){
            br.write("O devDojo é o melhor curso do brasillll");
            br.newLine();
            br.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
