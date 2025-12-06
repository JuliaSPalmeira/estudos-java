package academy.devdojo.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTeste02 {
    public static void main(String[] args) {
//        Locale localeDefault = Locale.getDefault(); // do Sis Op da pessoa
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN; //pegar resumido nem tds tem
        Locale localeIT = Locale.ITALY;

        //classe number format abstrata
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] =  NumberFormat.getCurrencyInstance(); //currencyinstance pra moeda
        nfa[1] =  NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] =  NumberFormat.getCurrencyInstance(localePT);
        nfa[3] =  NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1_000.2130;
       for (NumberFormat numberFormat : nfa){
           numberFormat.setMaximumFractionDigits(1);
           System.out.println( numberFormat.format(valor));
       }
       String valorString = "R$1,000";
        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
