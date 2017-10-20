package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.Time;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {

        //TESTE DA CONEXÃO DO BD
        /*ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.status);*/

        LocalTime now = LocalTime.now();

        Time time = Time.valueOf(now);

        System.out.println("Horário atual:" + time);

    }

}
