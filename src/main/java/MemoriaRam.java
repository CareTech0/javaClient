import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessoGrupo;

import java.util.List;

public class MemoriaRam {
    private Double usoRam;
    private Double totalRam;
    private Integer qtdProcessos;
    private List<Processo> processos;

    public MemoriaRam() {

    }

    public Double buscarUsoDeRam() {
        Looca looca = new Looca();
        usoRam = looca.getMemoria().getEmUso() / (Math.pow(1024.0, 3));
        return usoRam;
    }

    public Double buscarTotalDeRam() {
        Looca looca = new Looca();
        totalRam = looca.getMemoria().getTotal() / (Math.pow(1024.0, 3));
        return totalRam;
    }

    public Integer buscarQtdProcessos() {
        Looca looca = new Looca();
        ProcessoGrupo grupoDeProcessos = looca.getGrupoDeProcessos();
        qtdProcessos = grupoDeProcessos.getTotalProcessos();
        return qtdProcessos;
    }

    public List<Processo> buscarProcessos(){
        Looca looca = new Looca();
        ProcessoGrupo grupoDeProcessos = looca.getGrupoDeProcessos();
        processos = grupoDeProcessos.getProcessos();
        return processos;
    }
}
