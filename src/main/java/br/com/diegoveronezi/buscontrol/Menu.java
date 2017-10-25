package br.com.diegoveronezi.buscontrol;

import java.util.Scanner;

public class Menu {

    HorarioBus horario = new HorarioBus();

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

    while (opcaoHorario<1 || opcaoHorario>3){
        System.out.println("Opção inválida!");
        System.out.println("\nDigite o numero da opção:");
        opcaoHorario = (s.nextInt());
    }

    return opcaoHorario;


}

public void respostaDoHorario(int opcaoHorario){

    String resp = null;
    Scanner s = new Scanner(System.in);

    switch(opcaoHorario)
    {
        case 1:
            horario.mostrarPrimeiroHorario();
            System.out.println("Deseja ver todos os horario apos o atual? [S/N]");
            resp = (s.next());

            if (resp.equalsIgnoreCase("S")){

                horario.mostrarTodosHorarios();

            }else{

                mostrarMenu();
                respostaDoHorario(respostaDoUsuario());
            }

            break;

        default:
            System.out.println("Opção inválida");

    }

}





}//fecha classe
