package academy.devdojo.javacore.Oexception.exception.teste;

import academy.devdojo.javacore.Oexception.exception.dominio.Leitor1;
import academy.devdojo.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try(Leitor1 leitor1= new Leitor1();
            Leitor2 leitor2 = new Leitor2()) {

        }catch(IOException e){

        }
    }
// so pode colocar dentro do try q implementa closeable ou autocloseble. ai n precisa chamar o finally

    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                assert reader != null;
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
