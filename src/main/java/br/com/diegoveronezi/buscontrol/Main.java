package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //TESTE DA CONEXÃO DO BD
        /*ConexaoMySQL.getConexaoMySQL();
        System.out.println(ConexaoMySQL.status);*/

        Menu menu = new Menu();


        menu.mostrarMenu();

        menu.respostaDoHorario(menu.respostaDoUsuario());




    }

}
