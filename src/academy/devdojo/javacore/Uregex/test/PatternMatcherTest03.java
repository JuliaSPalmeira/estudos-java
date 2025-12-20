package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // mias basicos -> \d = todos os digitos
        // \\D = tudo que não for digito (letras e caracteres)
        // \\s = espaços em branco \t \n \f \r so mostras eles os em branco
        // \\S = caracteres excluindo os bracos
        // \\W = a-AZ-Z, digitos, _ (tira os caracteres tb)
        // \\w = tudo que nÃO FOR inclusso no \w
        //[] -> range  String regex = "[abcABC]"; retorna tendo
        //  String regex = "abc"; é essa exata sequencia
        // AZ min e max

        String regex = "[abcABC]";
//        String texto = "abaaba";
        String texto2 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:   "+texto2);
        System.out.println("Indice:  0123456789");
        System.out.println("regex:  "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
