package academy.devdojo.java01java;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 50000;

        if(salario >=0 && salario <=34712){
            System.out.println("Vou pagar 9,70% de taxa");
        } else if(salario >34712 && salario <=68502){
            System.out.println("Eu vou pagar 37,35% de taxa");
        } else{
            System.out.println("Eu vou pagar 49% de taxa");
        }
    }
}
