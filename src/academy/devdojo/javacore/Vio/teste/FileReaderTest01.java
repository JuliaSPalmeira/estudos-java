package academy.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileReader fr =  new FileReader(file)){
//            char[] in = new char[100];
//            int size = fr.read(in);//readd retorna -1
//            System.out.println(size);
//            for (char c : in){
//                System.out.println(c);
//            }
            int i;
            while ((i=fr.read()) != -1){ //ler primeira posição se diferente de -1
                System.out.print((char)i); //ler posição por posição quando n tem mais nada retorna -1
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
