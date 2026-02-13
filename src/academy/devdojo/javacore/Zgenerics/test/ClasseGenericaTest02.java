package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.javacore.Zgenerics.service.BarcoRentavelService;


public class ClasseGenericaTest02 {
    public static void main(String[] args) { //aligar carro ou barco
        BarcoRentavelService barcoRentavelService =  new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
