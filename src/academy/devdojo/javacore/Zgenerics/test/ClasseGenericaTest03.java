package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;


public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcoDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mês...");
        rentalServiceCarro.retornarObjetosAlugado(carro);
        System.out.println("------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcoDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando barco por um mês...");
        rentalServiceBarco.retornarObjetosAlugado(barco);
    }
}
