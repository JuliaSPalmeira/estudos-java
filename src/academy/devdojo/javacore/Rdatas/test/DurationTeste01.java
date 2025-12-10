package academy.devdojo.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTeste01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now,nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow,timeMinus7Hours);
        Duration d4 = Duration.ofDays(20); //x dias em horas
        Duration d5 = Duration.ofMinutes(3); //x dias em minutos
        Duration d6 = Duration.of(3, ChronoUnit.HOURS); //cuidado com o chrono pq pode passar coisa errada
        Duration d3 = Duration.between(Instant.now(),Instant.now().plusSeconds(1000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println();

    }
}
