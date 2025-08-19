package academy.devdojo.java01java;

public class aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double 0
        //char `\u0080` ´´ espaço em branco
        // boolean false
        // String null
        String[] nomes = new String[4];
       nomes[0] = "reyna";
       nomes[1] = "jett";
       nomes[2] = "sage";
       nomes[3] = "raze";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
