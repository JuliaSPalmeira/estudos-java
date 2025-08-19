package academy.devdojo.java01java;

public class aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5}; //indice 0 a 4
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};// n colcoa numero dentro do [] mas colcoa as chaves logo depois

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//
//        }

        for (int num : numeros3) {
            System.out.println(num);
        }
        int num = numeros3[0];
        System.out.println(num);
        num = numeros3[1];
        System.out.println(num);
        num = numeros3[2];
        System.out.println(num);
    }
}
