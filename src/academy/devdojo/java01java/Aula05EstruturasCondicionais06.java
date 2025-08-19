package academy.devdojo.java01java;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //dado os valores de 1 a 7 imprima se é dia util ou final de semana
        //considerando 1 como domingo
        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("final de semana");
                break;
            default:
                System.out.println("opção inválida");
                break;
        }
    }
}
