package academy.devdojo.javacore.ZZAClassesinternas.teste;

class Animal {
    public void walk() {
        System.out.println("Animal Walking");
    }
}

public class AnonymousClassesTest0 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
