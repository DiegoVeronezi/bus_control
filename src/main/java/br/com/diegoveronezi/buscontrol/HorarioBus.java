package br.com.diegoveronezi.buscontrol;

import sun.util.resources.cldr.es.TimeZoneNames_es_419;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class HorarioBus {

    LocalTime now = LocalTime.now();

    Time time = Time.valueOf(now);

    FatimaDAO hFatima = new FatimaDAO();

    //ArrayList<Time> timeDoBus = new ArrayList<>(); -> entender se esse objeto esta sendo usada ainda


    public Time horarioAtual(){
        return time;
    }

    public void mostrarHorarioAtual(){
        System.out.println("Horario Atual:" + time);

    }

    public void mostrarPrimeiroHorario(){

        System.out.println(hFatima.getHorarioFatimaTabela(horarioAtual()).get(0));
    }

    public void mostrarTodosHorarios(){

        for (int i = 0; i < hFatima.getHorarioFatimaTabela(horarioAtual()).size(); i++) {

            System.out.println(hFatima.getHorarioFatimaTabela(horarioAtual()).get(i));
        }

    }






}
