package academy.devdojo.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa"; //\\d pra digito numero
        String[] nomes = texto.split(",");//token baseado no limitador q é a virgula ou "" pra espaço em branco pra delimitador
        for (String nome : nomes){
            System.out.println(nome.trim()); //trim rremove espaço
        }
    }
}
