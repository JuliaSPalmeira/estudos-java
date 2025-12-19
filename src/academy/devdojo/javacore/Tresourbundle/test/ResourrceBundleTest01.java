package academy.devdojo.javacore.Tresourbundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourrceBundleTest01 {
    public static void main(String[] args) {
        //dentro de src file
        //exemplo pagina da amazon de portuguÊs pra ingles com back-end
        System.out.println(Locale.getDefault()); //localização definida do idioma de acordo com o local
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        //Locale("fr", "CA");
        //mensages_fr_CA.properties tenta achar
        //mensages_fr.properties arq q so tem a lingua
        //mensages_fr.properties
        //mensages_en_US.properties
        //mensages_en.properties
        ///caso n encontre procura o arq base messages.properties
        System.out.println(bundle.getString("hi"));
        //ele n traduz ele pega o valor baseado na chave e localização que eu coloquei no arquivo
    }
}
