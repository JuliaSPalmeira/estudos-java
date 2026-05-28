package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonlazy;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AircrrraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircrrraftSingletonEnum.INSTANCE.hashCode());
        AircrrraftSingletonEnum instance = AircrrraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
