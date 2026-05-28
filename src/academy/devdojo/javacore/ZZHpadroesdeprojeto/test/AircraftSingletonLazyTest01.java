package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.AircraftSingletonlazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
   public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
       System.out.println(AircraftSingletonlazy.getINSTANCE());
       System.out.println(AircraftSingletonlazy.getINSTANCE());
       Constructor<AircraftSingletonlazy> constructor = AircraftSingletonlazy.class.getDeclaredConstructor(String.class);
    constructor.setAccessible(true);
       AircraftSingletonlazy aircraftSingletonlazy = constructor.newInstance("787-900");
       System.out.println(aircraftSingletonlazy);
   }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonlazy.getINSTANCE());
        AircraftSingletonlazy aircraft = AircraftSingletonlazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
