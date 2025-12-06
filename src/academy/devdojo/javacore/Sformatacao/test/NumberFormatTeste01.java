package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class NumberFormatTeste01 {
    public static void main(String[] args) {
//        Locale localeDefault = Locale.getDefault(); // do Sis Op da pessoa
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN; //pegar resumido nem tds tem
        Locale localeIT = Locale.ITALY;

        //classe number format abstrata
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] =  NumberFormat.getInstance();
        nfa[1] =  NumberFormat.getInstance(localeJP);
        nfa[2] =  NumberFormat.getInstance(localePT);
        nfa[3] =  NumberFormat.getInstance(localeIT);

        double valor = 10_000.2130;
       for (NumberFormat numberFormat : nfa){
           System.out.println(numberFormat.getMaximumFractionDigits());
           System.out.println( numberFormat.format(valor));
       }


    }
}
