package academy.devdojo.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto); //delimitador padrão = espaço e branco
        scanner.useDelimiter(",");
//        while(scanner.hasNext()){ //enquanto tiver proximo
//            System.out.println(scanner.next()); //pegue o proximo
//        }
        while(scanner.hasNext()){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("Int "+i);
            }else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("boolean "+b);
            }else {
                System.out.println(scanner.next());
            }
        }
    }
}
