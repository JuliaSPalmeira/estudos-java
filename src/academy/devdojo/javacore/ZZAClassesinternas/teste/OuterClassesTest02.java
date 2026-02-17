package academy.devdojo.javacore.ZZAClassesinternas.teste;

public class OuterClassesTest02 {
    private String name = "Midoriya";

    //local classes dentro de um método e bloco de in icialização tb
    void print() {//tempo de vida menor
        //se tiver parametro tem q ser fional tb n pode mudar
        final String lastName = "Izuku"; //atributo  tb pode usar diretamente na classe ela tem q ser final ou efetivamente final n tem como modificar
        class LocalClass { //abstract ou final
            public void printLocal() { //outro metodo
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass localClass = new LocalClass(); //prreciso inicializar diretamente no metodo se n n da pra achar
        localClass.printLocal();
        //ou new LocalClass().printLocal(); instancia e chama
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
