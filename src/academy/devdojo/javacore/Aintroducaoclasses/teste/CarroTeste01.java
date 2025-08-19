package academy.devdojo.javacore.Aintroducaoclasses.teste;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.ano = 2003;
        carro1.nome = "Relampago marquinhos";
        carro1.modelo = "BMW";

        Carro carro2 = new Carro();
        carro2.ano = 1978;
        carro2.nome = "selly";
        carro2.modelo = "Mercedes";

        carro2 = carro1;

        System.out.println("Carro 1: "+carro1.ano+" "+ carro1.nome +" "+ carro1.modelo+ "\n  Carro 2:" + carro2.nome +" "+carro2.modelo+" "+carro2.ano);
    }
}
