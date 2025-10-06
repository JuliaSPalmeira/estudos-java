package academy.devdojo.javacore.Qstring.test;

import org.w3c.dom.ls.LSOutput;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Julia Palmeira";
        nome.concat(" Curso ");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Julia palmeira");
        sb.append(" Curso").append(" De Java");
        sb.reverse(); //reverte a ordem da frase
        sb.reverse();
        sb.delete(0,3);// deletab os caracteres dessas posições
        System.out.println(sb);
    }


}
