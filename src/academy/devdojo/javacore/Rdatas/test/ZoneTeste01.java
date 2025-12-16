package academy.devdojo.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());// a zona do seu sistema
       ZoneId tokyoZone = ZoneId.of("Asia/Tokyo"); //passar a zona de um local especifico
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now(); //não oferece zona
        System.out.println(now);
        ZonedDateTime zonedDateTime =  now.atZone(tokyoZone); // dizer a zona do horariod e agora q vc quer
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now(); //trabalha com zulu time
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime2); // ja traz com o horário da zona atualizado

        //sei o horário mas n sei a zona
        System.out.println(ZoneOffset.MIN); //-18
        System.out.println(ZoneOffset.MAX); //+18

        ZoneOffset offsetManaus =ZoneOffset.of("-04:00"); //sintaxe 00:00
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset((offsetManaus));
        System.out.println(offsetDateTime3);

        //calendarios diferentes
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate = LocalDate.of(1900, 2,1); //saber de uma data especifica
        JapaneseDate meijiEra = JapaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiEra);
    }
}
