package academy.devdojo.exerc.twitter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AnosViveu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculo de Idade Preciso ---");
        System.out.println("Digite o ano de nascimento: ");
        int ano = sc.nextInt();
        System.out.println("Digite o mês de nascimento: ");
        int mes = sc.nextInt();
        System.out.println("Digite o dia de nascimento: ");
        int dia = sc.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano,mes,dia); // objeto dia de nascimento, mes e ano

        LocalDate dataAtual = LocalDate.now(); //define data de hoje

        Period idade = Period.between(dataNascimento, dataAtual);
        // 3. Calcula a Diferença Exata (Period)
        // O método Period.between calcula a diferença em anos, meses e dias

        int anos = idade.getYears();
        int meses = idade.getMonths();
        int dias = idade.getDays();

        // Para calcular o total de dias vividos (considerando anos bissextos)
        long totalDias = dataNascimento.until(dataAtual).getDays();

        // Para calcular o total de meses vividos (aproximado)
        long totalMeses = anos * 12L + meses;

        System.out.println("\n *** Sua idade exata é: ***");
        System.out.println("Você viveu "+anos+ " anos, "+meses+" meses e "+dias+ " dias");

        System.out.println("----");
        System.out.println("Total aproximado de meses: "+totalMeses+ " meses");
        System.out.println("total de dias vividos (considerando bissextos): "+totalDias+ " dias.");




    }
}
