package academy.devdojo.java.ju.exercicios.treino;

public class Exercicioju12 {
    public static void main(String[] args) {
        int[] nums = {3,4,7,10,12,15,18};
        int contador = 0;

//        for(int num: nums){
//            if(num %2 == 0 ){
//                System.out.println(num);
//                contador++;
//            }
//        }

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num %2 ==0){
                System.out.println(num);
                contador++;
            }
        }

        System.out.println(contador+ " numeros pares encontrado");

    }
}
