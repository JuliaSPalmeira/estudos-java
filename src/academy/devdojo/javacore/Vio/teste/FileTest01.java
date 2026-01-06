package academy.devdojo.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //passar path name. onde = nome file.txt lugar especifico = caminho absoluto
        try {
            boolean isCreated = file.createNewFile(); //cria novo arquivo se vc roda dnv ele n cria dnv
            System.out.println("Created "+isCreated);
            System.out.println("Path "+file.getPath()); //pegar da onde ta vindo
            System.out.println("Path absolute"+file.getAbsolutePath()); // lugar absoluto todo o caminho
            System.out.println("is directory "+file.isDirectory());// se é diretorio
            System.out.println("is file "+file.isFile());// se é arquivo
            System.out.println("is hidden "+file.isHidden());// se é arquivo escondido
//            System.out.println("last modified "+ new Date(file.lastModified()));
            System.out.println("last modified "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault())); //
            boolean exists = file.exists();
            if (exists){
                boolean isDeleted = file.delete();
                System.out.println("Deleted "+isDeleted);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
