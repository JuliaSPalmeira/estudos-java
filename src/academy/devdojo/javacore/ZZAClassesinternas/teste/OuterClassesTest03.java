package academy.devdojo.javacore.ZZAClassesinternas.teste;

public class OuterClassesTest03 {
    private String name = "Wiliam";
    static class Nested{
        private String lastName = "Suane";
        void print(){
            System.out.println(new OuterClassesTest03().name+ " "+ lastName);
        }
    }


    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
