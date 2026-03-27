package academy.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Liam","Lobo", "leão");
        List<String> developers = List.of("William", "David","Harisson");
        List<String> students = List.of("Edi","gustavo","lima", "leme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        //pegar tudo q colcoar em uma lista só


        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}

//forEach(System.out::println); imprimir