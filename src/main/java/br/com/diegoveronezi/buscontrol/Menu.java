package br.com.diegoveronezi.buscontrol;


public class Menu {

    HorarioBus horario = new HorarioBus();
    Verificacao verificacao = new Verificacao();

    public void mostrarMenu() {

        System.out.println("\n********************* GUAÍBA BUS CONTROL *********************");
        System.out.println("\nVisualize de maneira rápida os horários do dia do seu ônibus");
        horario.mostrarHorarioAtual();
        System.out.println("\n\t\t\t\t\t\t# MENU #");
        System.out.println("\n- Escolha o sentido do ônibus\n" +
                "\n\t1 - POA -> GUAÍBA\t2 - GUAÍBA -> POA");

    }

    public int respostaDoSentidoLinha() {

        int sentidoLinha;

        sentidoLinha = verificacao.verificaSentido();

        if (sentidoLinha == 1) {
            System.out.println("\n- Qual linha você deseja saber o próximo horário?\n" +
                    "\n\t1 - FÁTIMA\t2 - FLORIDA\t 3 - COLINA\t |  0 - VOLTAR");
        }

        if (sentidoLinha == 2) {
            System.out.println("\n- Qual linha você deseja saber o próximo horário?\n" +
                    "\n\t4 - FÁTIMA\t5 - FLORIDA\t 6 - COLINA\t |  0 - VOLTAR");

        }

        return sentidoLinha;

    }


    public int respostaDoUsuarioLinha(int sentidoLinha) {

        int opcaoHorario = 0;

        if (sentidoLinha == 1) {

            opcaoHorario = verificacao.verificaLinhaPoaGuaiba();

        }

        if (sentidoLinha == 2) {

            opcaoHorario = verificacao.verificaLinhaGuaibaPoa();

        }

        return opcaoHorario;

    }

    public void mostrarHorario(int opcaoHorario) {

        switch (opcaoHorario) {
            case 1:
                System.out.println("\n- O próximo horário da linha FÁTIMA sentido POA -> GUAÍBA é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                mostrarSubMenu(opcaoHorario);

                break;
            case 2:
                System.out.println("\n- O próximo horário da linha FLORIDA sentido POA -> GUAÍBA é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                mostrarSubMenu(opcaoHorario);

                break;
            case 3:
                System.out.println("\n- O próximo horário da linha COLINA sentido POA -> GUAÍBA é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                mostrarSubMenu(opcaoHorario);

                break;
            case 4:
                System.out.println("\n- O próximo horário da linha FÁTIMA sentido GUAÍBA -> POA é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                mostrarSubMenu(opcaoHorario);
                break;
            case 5:
                System.out.println("\n- O próximo horário da linha FLORIDA sentido GUAÍBA -> POA é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                mostrarSubMenu(opcaoHorario);
                break;
            case 6:
                System.out.println("\n- O próximo horário da linha COLINA sentido GUAÍBA -> POA é às:\n");
                horario.mostrarPrimeiroHorario(opcaoHorario);

                mostrarSubMenu(opcaoHorario);
                break;
            default:
                mostrarMenu();
                mostrarHorario(respostaDoUsuarioLinha(respostaDoSentidoLinha()));
                //Entra aqui se o usuário digitar "0" para voltar
        }

    }

    public void mostrarSubMenu(int opcaoHorario) {

        int respostaSubMenu;

        respostaSubMenu = verificacao.verificaSubMenu();

        if (respostaSubMenu == 1) {

            System.out.println("\n- Mostrando todos os horários de hoje:\n");
            horario.mostrarTodosHorarios(opcaoHorario);
            mostrarSubMenu(opcaoHorario);

        }

        if (respostaSubMenu == 2) {

            mostrarMenu();
            mostrarHorario(respostaDoUsuarioLinha(respostaDoSentidoLinha()));

        }

        if (respostaSubMenu == 3) {

            System.out.println("\nPrograma finalizado.");

        }

    }

}//fecha classe
