package academy.devdojo.javacore.Oexception.exception.teste;

import academy.devdojo.javacore.Oexception.exception.dominio.Funcioario;
import academy.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcioario funcionario = new Funcioario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
