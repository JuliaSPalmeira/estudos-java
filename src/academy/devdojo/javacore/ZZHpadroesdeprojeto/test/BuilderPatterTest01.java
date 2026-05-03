package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Person;


public class BuilderPatterTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .build()
                .firstName("Julia")
                .lastName("plameira")
                .userName("whitefox")
                .email("juliapalmeira@gmail.com")
                .build();
        System.out.println(build);

    }
}
