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

        HorarioBus horario = new HorarioBus();

        FatimaDAO hFatima = new FatimaDAO();

        //ArrayList <Time> timeDoBus = new ArrayList<>();

        //timeDoBus = hFatima.getHorarioFatimaTabela(horario.horarioAtual());

        Scanner s = new Scanner(System.in);


        System.out.println("******* BUS CONTROL *******");
        System.out.println("-Qual linha você deseja saber o horário?\n" +
                "1 - Fátima ");
        System.out.println("\nDigite o numero da opção:");
        // terminar de completar aqui



        horario.mostrarHorarioAtual();

        horario.mostrarPrimeiroHorario();

        System.out.println("Mostrando todos os horarios após o atual");

        horario.mostrarTodosHorarios();


    }

}
