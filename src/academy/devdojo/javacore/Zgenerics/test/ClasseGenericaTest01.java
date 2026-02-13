package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) { //aligar carro ou barco
        CarroRentavelService carroRentavelService =  new CarroRentavelService();
        Carro carro = carroRentavelService.BuscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
