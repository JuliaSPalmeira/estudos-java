package academy.devdojo.javacore.Ycolecoes.teste;

import academy.devdojo.javacore.Ycolecoes.Dominio.Smartphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) { //criei
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("22222", "pixel");
        Smartphone s3 = new Smartphone("33333", "samsung");

        List<Smartphone> smartphones =  new ArrayList<>(6); //criei lista
        smartphones.add(s1); //adicionei
        smartphones.add(s2);
        smartphones.add(0,s3);


        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4= new Smartphone("22222", "pixel");

        System.out.println(smartphones.contains(s4));
        int indexSamsung4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSamsung4));
    }

}
