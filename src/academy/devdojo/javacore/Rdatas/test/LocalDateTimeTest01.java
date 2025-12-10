package academy.devdojo.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt =  LocalDateTime.now();
//        LocalDate date = LocalDate.of(2026, Month.AUGUST,11);
        LocalDate date = LocalDate.parse("2026-08-11");
//        LocalTime time = LocalTime.of(9,45,21);
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(ldt);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);//ocalDateTime ldt1 = date.atTime(12,15,04); dia e adicioan hora
        LocalDateTime ldt2 = time.atDate(date); //pegar o dia hora e adiciona dia
        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
