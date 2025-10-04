package academy.devdojo.javacore.Oexception.exception.teste;

import academy.devdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            Logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void Logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Julia";
        String senhaDB = "12345";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Uruário ou senha Inválidos ");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
