package academy.devdojo.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatos);
        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);
        printConsulta(cachorros);
        }
        //type erasure ?
    private static void printConsulta(List<? extends Animal> animals){ //recebo animal ou qualuqer um q seja filho
        for (Animal animal : animals) {
            animal.consulta();
            //aqui n tem garantia pq é irmão
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals){//animal ou qualquer um q seja pai (List<? super Animal> animals)
        Animal animal = new Cachorro();
        Animal animal2 = new Gato();
        animals.add(new Cachorro());
        animals.add(new Gato());
        //passa no teste é um
    }
}
