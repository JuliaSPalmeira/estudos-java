package academy.devdojo.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        c.add(Calendar.DAY_OF_MONTH, 2); //aumenta 2 dias.
        c.add(Calendar.HOUR,2); //pode virar dia, mês e até ano
        c.roll(Calendar.HOUR, 12); //aumneta mas n vira nada
        Date date = c.getTime();
        System.out.println(date);
    }
}
