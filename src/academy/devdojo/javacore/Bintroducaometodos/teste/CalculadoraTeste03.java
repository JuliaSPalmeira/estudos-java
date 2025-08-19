package academy.devdojo.javacore.Bintroducaometodos.teste;

import academy.devdojo.javacore.Bintroducaometodos.domino.Calculadora;
import org.w3c.dom.ls.LSOutput;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("------------");
        calculadora.imprimirDivisaoDeDoisNumeros(86,5);

    }
}
