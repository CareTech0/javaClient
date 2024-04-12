
import repository.Conexao;


public class TesteEmpresa {
    public static void main(String[] args) {
        Conexao query = new Conexao();
        query.executandoNoBanco("""
               CREATE TABLE empresa(
               nome VARCHAR(200)
               )
                """);
    }
}

