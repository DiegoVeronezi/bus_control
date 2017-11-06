package br.com.diegoveronezi.buscontrol;

import java.sql.Time;
import java.time.LocalTime;

public class HorarioBus {

    private LocalTime now = LocalTime.now();

    private Time time = Time.valueOf(now);

    private OnibusDAO onibusDAO = new OnibusDAO();


    public Time horarioAtual() {

        return time;
    }

    public void mostrarHorarioAtual() {
        now = LocalTime.now();
        time = Time.valueOf(now);
        System.out.println("\nHorário Atual: " + time + "h");

    }

    public void mostrarPrimeiroHorario(int opcaoHorario) {

        try {

            System.out.println("\t-> " + onibusDAO.getHorarioTabela(horarioAtual(), opcaoHorario).get(0) + "h");

        } catch (Exception e) {
            System.out.println(e.imprimirMsgErro());

        }

    }

    public void mostrarTodosHorarios(int opcaoHorario) {

        try {

            for (int i = 0; i < onibusDAO.getHorarioTabela(horarioAtual(), opcaoHorario).size(); i++) {

                System.out.println(" -> " + onibusDAO.getHorarioTabela(horarioAtual(), opcaoHorario).get(i) + "h");
            }

        } catch (Exception e) {
            System.out.println(e.imprimirMsgErro());

        }

    }

}
