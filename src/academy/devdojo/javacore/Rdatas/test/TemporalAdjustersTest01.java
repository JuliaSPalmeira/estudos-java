package academy.devdojo.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
//        now = now.plusDays(20); //aumenta e troca o mÊs
//        now = now.withDayOfMonth(20); // coloca o dia especifico sem alterrar o mês
//        now = now.withMonth(11); // coloca o dia especifico sem alterrar o dia
        now = now.with(ChronoField.DAY_OF_MONTH, 16); //substitui a data
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)); //LocalDate.now() prra data de hoje
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.TUESDAY)); //LocalDate.now() prra data de hoje
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //next pra proxima oq(dia da semana)

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)); //LocalDate.now() prra data de hoje
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //previus para ultima (dia da semana) ou previus or same q pode ser a mesma ou a anterior

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); //LocalDate.now() prra data de hoje
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //saber o primeiro dia do mês firstDayOfMonth()

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); //LocalDate.now() prra data de hoje
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //ultimo dia do mes lastDayOfMonth()

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear()); //LocalDate.now() prra data de hoje
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //proximo dia primeiro firstDayOfNextYear() do prox ano ou next month do prox mes
    }
}
