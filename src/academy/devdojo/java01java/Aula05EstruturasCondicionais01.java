package academy.devdojo.java01java;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade =16;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

//        if(isAutorizadoComprarBebida == false){
//            System.out.println("Não Autorizado a comprar bebida alcólica");
//
//        }
//        System.out.println("fora do if");
    }
}
