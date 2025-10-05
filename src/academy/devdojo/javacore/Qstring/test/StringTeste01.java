package academy.devdojo.javacore.Qstring.test;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Julia"; //String constant pool
        String nome2 = "Julia";
        nome = nome.concat(" Suane");//nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Julia");// 1 var de ref, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
