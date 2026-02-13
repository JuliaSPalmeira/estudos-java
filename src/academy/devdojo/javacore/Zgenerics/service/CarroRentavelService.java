package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService { //banco de dados de aluguel de carro
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro BuscarCarroDisponivel() {
        System.out.println("Buscanmdo carro disponível ...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("alugando carro: " + carro);
        System.out.println("carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
        return carro;
    }
    public void retornarCarroAlugado(Carro carro){
        System.out.println("devolvendo carro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return;
    }
}
