package academy.devdojo.java.ju.exercicios.treino.pasta.teste;

import academy.devdojo.java.ju.exercicios.treino.pasta.dominio.Aluno;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia",100);
        Aluno aluno2 = aluno1;

//        aluno1.nota = 60;  troca por
        aluno1.setNota(60);  // set nota atribuir
        aluno1.nome = "Abigail";
        aluno2.nome = "Susu";
        aluno1.exibirNota();   // exibição do metodo

        aluno1.estudar();
        aluno1.estudar(2);

    }

}
