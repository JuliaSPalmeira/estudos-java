package academy.devdojo.java.ju.exercicios.treino.pasta.dominio;

public class Aluno {
    public String nome;
    private double nota;

    {
        System.out.println("Novo aluno foi criado"); // bloco de inicialização
    }

    public Aluno(String nome, double nota){ // construtor
        this.nome = nome;
        this.nota = nota;
    }

    // Aqui você vai colocar o metodo
    public void exibirNota(){
        System.out.println("A nota do aluno "+ nome+ " é: " + nota);
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void estudar(){
        System.out.println("Julia está estudando");
    }

    public void estudar(int horas){
        System.out.println("Julia está estudando por "+horas+ " horas.");
    }
}



