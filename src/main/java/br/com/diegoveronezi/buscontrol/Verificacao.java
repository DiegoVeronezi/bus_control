package br.com.diegoveronezi.buscontrol;

import java.util.Scanner;

public class Verificacao {

    Scanner s = new Scanner(System.in);

    public int verificaSentido() {

        int sentidoLinha;

        System.out.println("\n- Digite o número da opção:");
        sentidoLinha = (s.nextInt());

        while (sentidoLinha < 1 || sentidoLinha > 2) {
            System.out.println("\nOpção inválida!");
            System.out.println("\n- Digite o número da opção:");
            sentidoLinha = (s.nextInt());
        }

        return sentidoLinha;
    }

    public int verificaLinhaPoaGuaiba() {

        int opcaoHorario;

        System.out.println("\n- Digite o número da opção:");
        opcaoHorario = (s.nextInt());

        while (opcaoHorario < 0 || opcaoHorario > 3) {
            System.out.println("\nOpção inválida!");
            System.out.println("\n- Digite o número da opção:");
            opcaoHorario = (s.nextInt());
        }

        return opcaoHorario;
    }

    public int verificaLinhaGuaibaPoa() {

        int opcaoHorario;

        System.out.println("\n- Digite o número da opção:");
        opcaoHorario = (s.nextInt());

        while (((opcaoHorario != 0) && (opcaoHorario < 4)) || (opcaoHorario > 6)) {
            System.out.println("\nOpção inválida!");
            System.out.println("\n- Digite o número da opção:");
            opcaoHorario = (s.nextInt());
        }

        return opcaoHorario;
    }

    public int verificaSubMenu() {

        int respostaSubMenu;

        System.out.println("\n- O que mais você deseja fazer?\n" +
                "\n1 - Ver todos os horários do dia após o horário atual\n2 - Voltar ao Menu\n3 - Sair");
        System.out.println("\n- Digite o número da opção:");
        respostaSubMenu = (s.nextInt());

        while (respostaSubMenu <1 || respostaSubMenu > 3) {
            System.out.println("\nOpção inválida!\n");
            System.out.println("- O que mais você deseja fazer?\n" +
                    "\n1 - Ver todos os horários do dia após o horário atual\n2 - Voltar ao Menu\n3 - Sair");
            System.out.println("\n- Digite o número da opção:");
            respostaSubMenu = (s.nextInt());
        }

        return respostaSubMenu;
    }

}//fecha classe
