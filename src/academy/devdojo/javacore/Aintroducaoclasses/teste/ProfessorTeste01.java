package academy.devdojo.javacore.Aintroducaoclasses.teste;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Victor";
        professor.idade = 22;
        professor.sexo = 'M';

        System.out.println("Nome do professor: "+professor.nome + " idade: " +professor.idade+ " sexo: "+professor.sexo);
    }
}
