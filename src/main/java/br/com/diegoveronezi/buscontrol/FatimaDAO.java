package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FatimaDAO {


    public ArrayList<Time> getHorarioFatimaTabela(Time time){

        Connection connection = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        ArrayList <Time> horarioRecebido = new ArrayList<>();

        try{
            preparedStatement = connection.prepareStatement("select horario from fatima where horario>?");
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
