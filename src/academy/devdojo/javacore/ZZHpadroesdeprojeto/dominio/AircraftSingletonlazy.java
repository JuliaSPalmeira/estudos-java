package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonlazy {
    private static AircraftSingletonlazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonlazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonlazy getINSTANCE() {
        if(INSTANCE == null){
            synchronized (AircraftSingletonlazy.class) {
                if(INSTANCE == null){} //double lock fazer o mesmo if q tem em cima
                 INSTANCE = new AircraftSingletonlazy("787-900");
            }
        }
        return INSTANCE;
    }


    public Set<String> getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
