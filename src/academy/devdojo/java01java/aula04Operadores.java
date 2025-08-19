package academy.devdojo.java01java;

public class aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int num1 = 10;
        int num2 = 20;
        int res = num1 / num2;
        System.out.println(res);

        //% resto
        int resto = 21 % 7;
        System.out.println(resto);

        //< > ≤ ≥  == comparação ≠ diferente retornan boolean
        boolean isDezMenorQueVinte = 10<20 ;
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);


        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade >= 30 && salario >=4612; //os dois tem q ser verdadeiro pra ser true

        System.out.println("isDentroDaLeiMaiorQueTrinta" + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta" + isDentroDaLeiMaiorQueTrinta);

        // or ou
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("isPlaystationCincoCompravel" +isPlaystationCincoCompravel);

        // = += -= *= /= %= econbomizar codigo
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800000.0
        bonus %= 2; // 0.0

        System.out.println(bonus);
        // ++ --
        int contador  = 0;
        contador += 1; //conatdor = contador +1
        contador++;
        contador--;
        ++contador; // incrementat depois executar
        --contador;

        int contador2 = 0;


        System.out.println(contador2++); //imrprime e depois vc encrementa + 1
    }
}

