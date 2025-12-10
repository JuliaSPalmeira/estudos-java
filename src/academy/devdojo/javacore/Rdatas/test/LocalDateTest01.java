package academy.devdojo.javacore.Rdatas.test;



import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;


public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        //new date ou calendar.getintance

        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2025,Month.DECEMBER,6);
        //localdate data(ano, dia, mes) apenas,
        LocalDate agora = LocalDate.now(); // a data de hoje
        agora = agora.plusWeeks(4); //imutavel tudo nessas classes tem q ser criado novo objeto referenciando dnv a classe
        System.out.println(date.getYear()); //ano
        System.out.println(date.getMonth()); //mês
        System.out.println(date.getMonthValue()); //numero do mês
        System.out.println(date.getDayOfWeek()); //dia da semana
        System.out.println(date.getDayOfMonth()); //dia do mÊs
        System.out.println(date.lengthOfMonth()); //saber o comprimento do mês
        System.out.println(date.isLeapYear()); //saber o ano é bissexto ou não
        System.out.println(date.get(ChronoField.DAY_OF_MONTH)); //TemporalField . e tem tudo q vc pode precisar
        System.out.println(date); // ano, mês, dia
        System.out.println(agora);
        System.out.println(LocalDate.MAX); //data maxima pra utilizar
        System.out.println(LocalDate.MIN); // data minima pra utilizar
    }
}
