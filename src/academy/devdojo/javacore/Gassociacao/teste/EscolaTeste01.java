package academy.devdojo.javacore.Gassociacao.teste;

import academy.devdojo.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("kakashi sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("konoha", professores);

        escola.imprime();

    }
}
