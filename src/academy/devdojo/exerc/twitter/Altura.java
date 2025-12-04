package academy.devdojo.exerc.twitter;

public class Altura {
    public static void main(String[] args) {

        int ano = 0;

        double altFran = 110.0;
        double altSara = 150.0;

        final double crescimentoFran = 3.0;
        final double crescimentoSara = 2.0;

        System.out.println("--- Início ---");
        System.out.printf("Início: Francisco %.2f cm | Sara %.2f cm%n", altFran, altSara);
        System.out.println("----------------");

        do{
          ano++;
          altFran = altFran + crescimentoFran;
          altSara = altSara + crescimentoSara;
        }
        while (altFran <= altSara);

        System.out.println("--- Resultado ---");
        System.out.println("Serão necessários "+ano+ " anos");
        System.out.println("Altura final de Francisco "+altFran); // cm de cm e %n de quebra de linha
        System.out.println("Altura final de Sara  "+ altSara);

    }
}
