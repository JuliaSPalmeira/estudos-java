package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService { //banco de dados de aluguel de carro
    private List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscanmdo barco disponível ...");
        Barco barco = barcoDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcoDisponiveis);
        return barco;
    }
    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco "+barco);
        barcoDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcoDisponiveis);
    }
}
