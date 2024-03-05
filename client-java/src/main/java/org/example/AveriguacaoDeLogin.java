package org.example;

import java.util.ArrayList;
import java.util.List;

public class AveriguacaoDeLogin {
    public String verificarLogin(String user, String senha) {
        if (user != null || !user.isEmpty() && senha != null || !senha.isEmpty()) {
            return buscarNoBanco(user, senha);
        } else {
            return "Preencha o formulário corretamente";
        }
    }

    private String buscarNoBanco(String user, String senha) {
        List<String> senhas = new ArrayList<>();
        List<String> users = new ArrayList<>();

        //Usuários
        users.add("Thawan Bruno");
        users.add("Matheus Munari");
        users.add("Matheus Souza");
        users.add("Amanda Geovana");
        users.add("Henrique Crispino");

        //Senhas
        senhas.add("212911ar");
        senhas.add("MM12345");
        senhas.add("MS12345");
        senhas.add("A12345");
        senhas.add("HC12345");

        Integer resEncontrado = 0;

        for (Integer i = 0; i < senhas.size(); i++) {
            String userBanco = users.get(i);
            String senhaBanco = senhas.get(i);

            if (user.equals(userBanco) && senha.equals(senhaBanco)) {
                resEncontrado++;
            }
        }


        return switch (resEncontrado) {
            case 0 -> "User ou senha não encontrados!!!";
            case 1 -> "Login Realizado com Sucesso!!!";
            default -> "Erro desconhecido!!!";
        };
    }
}
