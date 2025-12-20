package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // mias basicos -> \d = todos os digitos
        // \\D = tudo que não for digito (letras e caracteres)
        // \\s = espaços em branco \t \n \f \r so mostras eles os em branco
        // \\S = caracteres excluindo os bracos
        // \\W = a-AZ-Z, digitos, _ (tira os caracteres tb)
        // \\w = tudo que nÃO FOR inclusso no \w

//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]"; //[0-9] ou [\\d]
//        String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:   "+texto2);
        System.out.println("Indice:  0123456789");
        System.out.println("regex:  "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
//        int numHex = 0x1; //numero decimal valido
//        System.out.println(numHex);// mostra o numero decimal de fato
    }
}
