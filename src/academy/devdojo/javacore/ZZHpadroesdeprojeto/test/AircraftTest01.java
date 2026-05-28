package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Aircraft;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args){
        bookseat("1A");
        bookseat("1A");
    }

    static void bookseat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));

    }
}
