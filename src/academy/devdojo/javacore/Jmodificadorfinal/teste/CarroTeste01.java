package academy.devdojo.javacore.Jmodificadorfinal.teste;

import academy.devdojo.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("JUJU");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("gf");
        ferrari.imprime();

    }
}
