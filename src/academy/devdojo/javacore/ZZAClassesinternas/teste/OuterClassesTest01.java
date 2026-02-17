package academy.devdojo.javacore.ZZAClassesinternas.teste;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy"; //atributo q pertence a classe
//nested

    class Inner { //como se fosse metodo, acesso aos obje da classe estrernas e tem seus proprios atributos
        public void printOuterClassAttribute(){ //metodo dentro da classe interna
            System.out.println(name);
            System.out.println(this);//contexte a classe que se encontra objeto interno
            System.out.println(OuterClassesTest01.this);//contexte a classe que se encontra objeto externo
        }

    }

    public static void main(String[] args) {//faz parte da classe externa
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
