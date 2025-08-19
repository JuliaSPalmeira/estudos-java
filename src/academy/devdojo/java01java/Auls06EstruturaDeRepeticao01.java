package academy.devdojo.java01java;

public class Auls06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10){
            System.out.println(count);
            count ++;
        }

        do {
            System.out.println("dentro do do-while");
        }while(count <10);


        for(int a =0;a<10;a++){
            System.out.println("for "+a);
        }
    }
}
