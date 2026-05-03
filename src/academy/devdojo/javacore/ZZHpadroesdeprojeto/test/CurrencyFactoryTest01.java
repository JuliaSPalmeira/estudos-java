package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Country;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.Currency;
import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
        //baixo aclopamento facilitanod a manutenção tter uma regra de negocio
    }
}
