package academy.devdojo.javacore.Xserializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private static final long serialVersionUID = 5767309252103520286L;

    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo";
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }
   //serializando a string
    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject(); //salva da forma padrão
            oos.writeUTF(turma.getNome()); //obj n é seriali mas atributo pode escrever string write utf
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject(); //salva da forma padrão
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
