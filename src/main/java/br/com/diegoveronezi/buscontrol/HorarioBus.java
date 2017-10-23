package br.com.diegoveronezi.buscontrol;

import java.sql.Time;
import java.time.LocalTime;

public class HorarioBus {

    LocalTime now = LocalTime.now();

    Time time = Time.valueOf(now);

    public void mostrarHorario(){
        System.out.println("Horario Ataul:" + time);

    }




}
