import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;

import java.util.List;
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

        while (true){
            MemoriaRam ram = new MemoriaRam();
            System.out.println("Ram em uso no momento: %.1f".formatted(ram.buscarUsoDeRam()));
            DiscoRigido ssd = new DiscoRigido();
            System.out.println("Total de espaço nos discos rigidos: " + ssd.buscarTotalDeEspaco());
            System.out.println("Espeço disponível nos discos rígidos: " + ssd.buscarEspacoLivre());
            RedeLocal rede = new RedeLocal();
            System.out.println("Infos de rede: ");
            rede.buscarVelocidadeRede();
            Cpu cpu = new Cpu();
            System.out.println("Infos de temperatura: ");
            System.out.println(cpu.buscarUsoCpu());
            System.out.println("Temperatura: ");
            System.out.println(cpu.buscarTemperatura());
            break;
        }

    }

}
