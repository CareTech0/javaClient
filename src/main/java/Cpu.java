import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processador.Processador;

public class Cpu {

    private Double usoCpu;

    public Cpu(){

    }

    public Double buscarUsoCpu(){
        Looca looca = new Looca();
        Processador processador = looca.getProcessador();
        usoCpu = processador.getUso();
        return usoCpu;
    }

}
