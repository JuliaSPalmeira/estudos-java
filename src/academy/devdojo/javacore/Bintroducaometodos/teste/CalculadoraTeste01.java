package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.domino.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste01 ");
        calculadora.subtrairDoisNumeros(); //ele ja printa direto ja faz saida mas n retorna nada
    }
}
