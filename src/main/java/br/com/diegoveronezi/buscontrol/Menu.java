package br.com.diegoveronezi.buscontrol;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu {

    HorarioBus horario = new HorarioBus();

    LocalTime now = LocalTime.now();

    Time time = Time.valueOf(now);


public void mostrarMenu(){

    System.out.println("******* BUS CONTROL *******");
    horario.mostrarHorarioAtual();
    System.out.println("-Qual linha você deseja saber o horário?\n" +
            "1 - Fátima \n2 - Florida\n3 - Colina");

}

public int respostaDoUsuario(){

    Scanner s = new Scanner(System.in);

    int opcaoHorario = 0;

    System.out.println("\nDigite o numero da opção:");
    opcaoHorario = (s.nextInt());

    while (!(opcaoHorario==1) && !(opcaoHorario==2) && !(opcaoHorario==3)){
        System.out.println("Opção inválida!");
        System.out.println("\nDigite o numero da opção:");
        opcaoHorario = (s.nextInt());
    }

    return opcaoHorario;

}

public void subMenu(int opcaoHorario) {

    int op;
    Scanner s = new Scanner(System.in);

    System.out.println("\nVocê deseja fazer o que?" +
            "\n1 - Ver todos os horario apos o atual\n2 - Voltar ao menu\n3 - Sair");
    op = (s.nextInt());

    while (op != 1 && op != 2 && op != 3) {
        System.out.println("\nOpção inválida!");
        System.out.println("Você deseja fazer o que?" +
                "\n1 - Ver todos os horario apos o atual\n2 - Voltar ao menu\n3 - Sair");
        op = (s.nextInt());
    }

    if (op == 1) {

        System.out.println("\nMostrando todos os horários:");
        horario.mostrarTodosHorarios(opcaoHorario);

    }

    if (op == 2){

        mostrarMenu();
        respostaDoHorario(respostaDoUsuario());

    }
    if (op == 3){

        System.out.println("Você saiu!");

    }

}


public void respostaDoHorario(int opcaoHorario){

    switch(opcaoHorario)
    {
        case 1:
            System.out.println("\nO próximo horário da linha Fátima é às:");
            horario.mostrarPrimeiroHorario(opcaoHorario);

            subMenu(opcaoHorario);

            break;
        case 2:
            System.out.println("\nO próximo horário da linha Florida é às:");
            horario.mostrarPrimeiroHorario(opcaoHorario);

            subMenu(opcaoHorario);

            break;
        case 3:
            System.out.println("\nO próximo horário da linha Colina é às:");
            horario.mostrarPrimeiroHorario(opcaoHorario);

            subMenu(opcaoHorario);

            break;
        default:
            System.out.println("Opção inválidarr");

    }

}





}//fecha classe
