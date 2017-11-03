package br.com.diegoveronezi.buscontrol;

import java.util.Scanner;

public class Menu {

    HorarioBus horario = new HorarioBus();

    public void mostrarMenu() {

        System.out.println("\n**************** GUAÍBA BUS CONTROL ****************");
        horario.mostrarHorarioAtual();
        System.out.println("\n\t\t\t\t\t# MENU #");
        System.out.println("\n-Qual linha você deseja saber o próximo horário?\n" +
                "\n\t1 - Fátima\t2 - Florida\t 3 - Colina");

    }

    public int respostaDoUsuario() {

        Scanner s = new Scanner(System.in);

        int opcaoHorario;

        System.out.println("\n-Digite o número da opção:");
        opcaoHorario = (s.nextInt());

        while (!(opcaoHorario == 1) && !(opcaoHorario == 2) && !(opcaoHorario == 3)) {
            System.out.println("Opção inválida!");
            System.out.println("\nDigite o numero da opção:");
            opcaoHorario = (s.nextInt());
        }

        return opcaoHorario;

    }

    public void subMenu(int opcaoHorario) {

        int op;
        Scanner s = new Scanner(System.in);

        System.out.println("\n-O que mais você deseja fazer?\n" +
                "\n1 - Ver todos os horario apos o atual\n2 - Voltar ao Menu\n3 - Sair");
        System.out.println("\n-Digite o número da opção:");
        op = (s.nextInt());

        while (op != 1 && op != 2 && op != 3) {
            System.out.println("\nOpção inválida!\n");
            System.out.println("O que mais você deseja fazer?\n" +
                    "\n1 - Ver todos os horario apos o atual\n2 - Voltar ao Menu\n3 - Sair");
            System.out.println("\n-Digite o número da opção:");
            op = (s.nextInt());
        }

        if (op == 1) {

            System.out.println("\n-Mostrando todos os horários:\n");
            horario.mostrarTodosHorarios(opcaoHorario);
            subMenu(opcaoHorario);

        }

        if (op == 2) {

            mostrarMenu();
            respostaDoHorario(respostaDoUsuario());

        }

        if (op == 3) {

            System.out.println("Você saiu!");

        }

    }

    public void respostaDoHorario(int opcaoHorario) {

        switch (opcaoHorario) {
            case 1:
                System.out.println("\n-O próximo horário da linha Fátima é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                subMenu(opcaoHorario);

                break;
            case 2:
                System.out.println("\n-O próximo horário da linha Florida é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                subMenu(opcaoHorario);

                break;
            case 3:
                System.out.println("\n-O próximo horário da linha Colina é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                subMenu(opcaoHorario);

                break;
            default:
                System.out.println("Opção inválida!");

        }

    }

}//fecha classe
