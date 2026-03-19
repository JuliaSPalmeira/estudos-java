package academy.devdojo.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;


public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("haha uhu");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------");

        Optional<String> nameOptional =findName("William");
        //caso eu queira executar
        String empty = nameOptional.orElse("Empty");//caso n tenha retorne()
        System.out.println(empty);
        nameOptional.ifPresent(s ->System.out.println(s.toUpperCase())); // se tiver
    }


    private static Optional<String> findName(String name){
        List<String> list = List.of("Willima", "Dojo"); // verificarr se nome está na lista
        int i = list.indexOf(name);
        if (i != -1){
            return Optional.of(list.get(i));
        }
        return Optional.empty();

    }
}
