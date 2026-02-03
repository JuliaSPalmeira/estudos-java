package academy.devdojo.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List <String> nomes = new ArrayList<>(16); //criar
        List <String> nomes2 = new ArrayList<>(16); //criar
        nomes.add("William"); //adicionar
        nomes.add("DevDojo");
        nomes2.add("Suane");
        nomes2.add("Academy");

        nomes.addAll(nomes2);
      //  System.out.println(nomes.remove("William"));

        for(String nome: nomes){
            System.out.println(nome);
        }


        nomes.add("Suane");
        System.out.println("----------");
        int size = nomes.size();
        for (int i = 0; i < nomes.size(); i++) { //como interar
            System.out.println(nomes.get(i));
        }

        List <Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
