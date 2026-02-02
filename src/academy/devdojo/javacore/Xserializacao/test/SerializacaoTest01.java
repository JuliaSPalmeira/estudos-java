package academy.devdojo.javacore.Xserializacao.test;

import academy.devdojo.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1l, "William Suane", "123412121"); //objeto
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }
    //metodo que salva. obj em array de bits baixo nivel
    //outputstream uot pra onde mandar o arquico file outputstream ou o link dele com files ou path

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pastatesteX/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno); //escrever um objeto
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pastatesteX/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}