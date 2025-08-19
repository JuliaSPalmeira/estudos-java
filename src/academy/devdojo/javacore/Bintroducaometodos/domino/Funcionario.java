package academy.devdojo.javacore.Bintroducaometodos.domino;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios == null){
            return;
        }
        for (double salario: salarios){
            System.out.print(salario + " ");
        }
    }

    public void mediaSalario(){
        if(salarios == null) {
            return;
        }
        for(double s : salarios){
            System.out.println(s +"");
        }
        media /= salarios.length;
        System.out.println(media/ salarios.length);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salarios = salario;
    }



    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}

