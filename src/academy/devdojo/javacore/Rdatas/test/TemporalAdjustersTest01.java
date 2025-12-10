package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
//        now = now.plusDays(20); //aumenta e troca o mÊs
        now = now.withDayOfMonth(20); // coloca o dia especifico sem alterrar o mês
        now = now.withMonth(11); // coloca o dia especifico sem alterrar o dia
//        now = now.wit(11); //
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
