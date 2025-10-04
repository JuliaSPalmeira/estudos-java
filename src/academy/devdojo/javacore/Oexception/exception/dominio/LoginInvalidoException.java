package academy.devdojo.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("login in inválido"); // se ninguem mandar mensagem ela vai ser essa
    }

    public LoginInvalidoException(String message) {
        super(message); //se alguem quiser uma mensagem customizada
    }
}
