package br.com.diegoveronezi.buscontrol;

import java.sql.Time;
import java.time.LocalTime;

public class HorarioBus {

    LocalTime now = LocalTime.now();

    Time time = Time.valueOf(now);

    OnibusDAO onibusDAO = new OnibusDAO();


    public Time horarioAtual(){

        return time;
    }

    public void mostrarHorarioAtual(){
        now = LocalTime.now();
        time = Time.valueOf(now);
        System.out.println("Horario Atual:" + time);

    }

    public void mostrarPrimeiroHorario(int opcaoHorario){

        System.out.println(onibusDAO.getHorarioTabela(horarioAtual(),opcaoHorario).get(0));
    }

    public void mostrarTodosHorarios(int opcaoHorario){

        for (int i = 0; i < onibusDAO.getHorarioTabela(horarioAtual(),opcaoHorario).size(); i++) {

            System.out.println(onibusDAO.getHorarioTabela(horarioAtual(),opcaoHorario).get(i));
        }

    }









}
