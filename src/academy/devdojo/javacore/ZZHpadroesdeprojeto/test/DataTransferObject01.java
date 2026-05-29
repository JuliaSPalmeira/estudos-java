package academy.devdojo.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObject01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person.PersonBuilder.builder().firstName("julia").lastName("palmeira").build();
        ReportDto.ReportDtoBuilder.builder().aircraftName(aircraft.getName()).country(country).currency(currency)
                .personName(person.get)
    }
}
