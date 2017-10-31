package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OnibusDAO {

    public ArrayList<Time> getHorarioTabela(Time time, int resposta){

        Connection connection = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        ArrayList <Time> horarioRecebido = new ArrayList<>();

        try{
            switch (resposta){
                case 1:
                    preparedStatement = connection.prepareStatement("select horario from fatima where horario>?");
                    break;
                case 2:
                    preparedStatement = connection.prepareStatement("select horario from florida where horario>?");
                    break;
                case 3:

                    break;
            }
                preparedStatement.setTime(1,time);
                rs = preparedStatement.executeQuery();

            while (rs.next()){
                horarioRecebido.add(rs.getTime("horario"));
            }

            return horarioRecebido;

        } catch (SQLException e) {
            throw new Exception("Não foi possivel encontrar o horário");

        }finally {
            ConexaoMySQL.FecharConexao();
        }

    }



}
