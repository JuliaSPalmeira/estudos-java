package academy.devdojo.javacore.Bintroducaometodos.domino;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);

    }

    public void subtrairDoisNumeros(){
        System.out.println(10-10);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 *num2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if(num2==0){
            return 0;
        }
            return num1/num2;
    }

    public double divideDoisNumeros02 (double num1, double num2){
        if(num2==0){
            return 0;
        } else{
        return num1/num2;}
    }
    public void imprimirDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("não existte divisão por zero");
        }else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera 2 numeros");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }

    public void somaArray(int[] numeros){
        int soma =0;
        for (int num: numeros) {
            soma += num;
            
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma =0;
        for (int num: numeros) {
            soma += num;

        }
        System.out.println(soma);
    }
}