package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

public class Main {

    public static void main(String[] args) {

        ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.status);

    }

}
