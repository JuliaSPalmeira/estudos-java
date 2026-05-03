package academy.devdojo.javacore.ZZHpadroesdeprojeto.dominio;

public interface Currency {
    String getSymbol();
}

class Real implements Currency{

    @Override
    public String getSymbol() {
        return "R$";
    }
}
class UsDollar implements Currency{
    @Override
    public String getSymbol() {
        return "$";
    }
    //duas classes implementando uma moeda
    //como desacoplar. crar moeda baseada em  parâmetro
}
