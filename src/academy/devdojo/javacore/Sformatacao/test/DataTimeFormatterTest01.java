package academy.devdojo.javacore.Sformatacao.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeFormatterTest01 {
    public static void main(String[] args) {
        //formatter de um objeto para String
        // parse de String para objeto
        //ctrl q mostra a formatação
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20251216", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2025-12-16", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2025-12-16", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2025-12-16T17:45:01.3773182", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        //dd/mm/yyyy
        //mm/dd/yyyy
        //yyyy/mm/dd
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBr);
        System.out.println(formatBR);
        LocalDate parseBr = LocalDate.parse("16/12/2025", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("16.Dezember.2025", formatterGR);
        System.out.println(parseGR);
        //
    }
}
