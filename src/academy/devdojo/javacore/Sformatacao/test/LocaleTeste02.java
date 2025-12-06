package academy.devdojo.javacore.Sformatacao.test;

import java.util.Locale;

public class LocaleTeste02 {
    public static void main(String[] args) {
        //como o meu SO esta definido? pt_BR
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOCountries();
        for (String isoLanguage : isoLanguages){
            System.out.print(isoLanguage+ " ");
        }
        System.out.println();
        for (String isoCountry : isoCountries){
            System.out.print(isoCountry+ " ");
        }
        System.out.println();
        // pra saber todos os paises e linguas suportadas
    }
}
