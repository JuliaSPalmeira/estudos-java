package academy.devdojo.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdam' dd 'de' MMMM 'de' yyyy";//entre aspas simples oq n é formato
        SimpleDateFormat sdf = new SimpleDateFormat(pattern); //classe para formatar dados mais flexivelmente com o tipo entre ()
        System.out.println(sdf.format(new Date())); //newdate dia de hj
        try {
            System.out.println(sdf.parse("Amsterdam 05 de dezembro de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } //retorna em date format padrão no console

    }
}
