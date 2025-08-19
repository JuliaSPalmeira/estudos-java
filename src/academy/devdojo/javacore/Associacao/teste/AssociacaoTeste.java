package academy.devdojo.javacore.Associacao.teste;

import academy.devdojo.javacore.Associacao.dominio.Aluno;
import academy.devdojo.javacore.Associacao.dominio.Local;
import academy.devdojo.javacore.Associacao.dominio.Professor;
import academy.devdojo.javacore.Associacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das rosas");
        Aluno aluno = new Aluno("ju", 22);
        Professor professor = new Professor("Victor", "garoto de programa");
        Aluno[] alunosParaSeminario =  {aluno};
        Seminario seminario = new Seminario("Aprendendendo ",alunosParaSeminario, local );

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
