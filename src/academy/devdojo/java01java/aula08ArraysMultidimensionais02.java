package academy.devdojo.java01java;

public class aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int [3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        for (int[] arrrayBase: arrayInt){
            System.out.println("\n---------");
            for (int num:arrrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
