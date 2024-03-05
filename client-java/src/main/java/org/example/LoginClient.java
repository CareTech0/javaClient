package atividadePi;

import org.example.AveriguacaoDeLogin;

import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) {
        String statusDaVerificacao = "";


        do{
            System.out.println("--------------------------------------------------------");
            System.out.println("||||||||||||||||     Login no Client     |||||||||||||||");
            System.out.println("--------------------------------------------------------");
            AveriguacaoDeLogin verificacao = new AveriguacaoDeLogin();

            Scanner input = new Scanner(System.in);
            System.out.println("User: ");
            String user = input.nextLine();
            System.out.println("Senha: ");
            String senha = input.nextLine();

            statusDaVerificacao = verificacao.verificarLogin(user, senha);
            System.out.println(statusDaVerificacao);
        } while(!statusDaVerificacao.equals("Login Realizado com Sucesso!!!"));


    }
}
