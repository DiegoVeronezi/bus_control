package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.*;

public class FatimaDAO {


    public Time getHorario(Time time){

        Connection connection = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try{
            preparedStatement = connection.prepareStatement("select horario from fatima where horario>?");
                preparedStatement.setTime(1,time);
            rs = preparedStatement.executeQuery();
            rs.next();
            Time horarioRecebido = rs.getTime("horario");
            return horarioRecebido;

        } catch (SQLException e) {
            System.out.println("Erro ao pegar o ID pelo Nome");
            return -1;

        }finally {
            ConexaoMySQL.FecharConexao(connection,preparedStatement,rs);
        }

    }



}
