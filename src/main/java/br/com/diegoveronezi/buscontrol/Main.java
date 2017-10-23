package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.Time;
import java.time.LocalTime;


public class Main {

    public static void main(String[] args) {

        //TESTE DA CONEXÃO DO BD
        /*ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.status);*/

        HorarioBus horario = new HorarioBus();

        horario.mostrarHorario();




    }

}
