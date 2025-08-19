package academy.devdojo.java01java;

public class aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 mesesm
        //1,2,3,4,5 dias
        int[][] dias = new int[2][];

        dias[0] = new int[3]; // Inicializa a linha 0 com 3 colunas
        dias[1] = new int[3]; // Inicializa a linha 1 com 3 colunas

        dias[0][0] =31;
        dias[0][1] =28;
        dias[0][2] =31;

        dias[1][0] =31;
        dias[1][1] =28;
        dias[1][2] =31;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }
        }
        System.out.println("-------------------------");

        for (int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
