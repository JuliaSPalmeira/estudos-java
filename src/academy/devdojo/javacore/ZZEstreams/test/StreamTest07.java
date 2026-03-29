package academy.devdojo.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,(x, y) -> x + y)); //com o zero eu defino o começo

        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::sum));

        //multiplicação
        System.out.println("-----------------------------------");
        integers.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,(x, y) -> x * y)); //1 pa multiplicar por 0 da zero


        //maior fomra feia
        System.out.println("-----------------------------------");
        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1,(x, y) -> x * y));

        //maior forma bonita
        System.out.println("-----------------------------------");
        integers.stream().reduce((x, y) ->x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0,Integer::max));
    }
}
