import java.util.Scanner;

public class InterfaceCliente {

    public static void main(String[] args) {
        String statusDaVerificacao = "";

        do{
            System.out.println("--------------------------------------------------------");
            System.out.println("||||||||||||||||     Login no Client     |||||||||||||||");
            System.out.println("--------------------------------------------------------");
            AveriguacaoLogin verificacao = new AveriguacaoLogin();

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
