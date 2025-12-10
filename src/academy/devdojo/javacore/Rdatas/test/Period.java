package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Period {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
       java.time.Period p1 = java.time.Period.between(now, nowAfterTwoYears);
       java.time.Period p2 = java.time.Period.ofDays(10);
       java.time.Period p3 = java.time.Period.ofWeeks(58);
       java.time.Period p4 = java.time.Period.ofMonths(3);
       java.time.Period p5 = java.time.Period.ofYears(3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        // mesmo q queira transformar semanas em meses tem usar a classe chronounit
        System.out.println(java.time.Period.between(now, now.plusDays(p3.getDays())).getMonths());
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS)); // meses e anos retorna

    }
}
