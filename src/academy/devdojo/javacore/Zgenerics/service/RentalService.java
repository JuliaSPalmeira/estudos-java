package academy.devdojo.javacore.Zgenerics.service;

import academy.devdojo.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel() {
        System.out.println("Buscando objeto  disponível ...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("alugando Objeto: " + t);
        System.out.println("Objetos disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornarObjetosAlugado(T t){
        System.out.println("devolvendo Objetos "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
