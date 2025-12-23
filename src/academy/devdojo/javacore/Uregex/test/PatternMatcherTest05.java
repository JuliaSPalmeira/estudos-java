package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        //hexa decimal valido 0x
        //? Zero ou uma
        //* Zero ou mais
        //+ uma ou mais
        //{n,m} de n até m
        // agrupamento ()
        // ou | o(v|c)0 = ovo ou oco
        //$ fim da linha
        //coringa . 1.3 -> 123, 133, 1@3 entre 1 e 3 ele é considerado

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //se repita + uma ou mais
        String  texto = "luffy@hotmail.com, 123jotaro@gmail.com,#@!zoro@mail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex)); // bate a strign com a expressão regular
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:   "+texto);
        System.out.println("Indice:  0123456789");
        System.out.println("regex:  "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
        int numHex = 0x1; //numero decimal valido
//        System.out.println(numHex);// mostra o numero decimal de fato
    }
    //como encontrar todos os emails validos
    // \\ para usar caracter de escape da expressão regular
    //validando padrão n o texto e n uma determinada string
    // no regex o + pleo men  os 1 e mais ou seja se n tiver ele covai ficar .c
}
