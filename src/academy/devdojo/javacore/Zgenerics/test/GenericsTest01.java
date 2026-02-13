package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Ycolecoes.Dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //type erasure
        List<String> lista = new ArrayList<>();
        lista.add("midoriya");
        lista.add("midoriya");
        for (String o : lista) {
            System.out.println(o);
        }

        add(lista,  new Consumidor("midoriya"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }

        private static void add(List lista, Consumidor consumidor){
            lista.add(consumidor);
        }
    }

