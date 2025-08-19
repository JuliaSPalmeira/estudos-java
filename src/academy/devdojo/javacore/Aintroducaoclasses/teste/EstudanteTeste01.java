package academy.devdojo.javacore.Aintroducaoclasses.teste;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante =  new Estudante();
        estudante.nome = "Julia";
        estudante.idade =21;
        estudante.sexo = 'F';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
