package br.com.diegoveronezi.buscontrol;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        menu.mostrarMenu();

        menu.mostrarHorario(menu.respostaDoUsuarioLinha(menu.respostaDoSentidoLinha()));

    }

}
