package br.com.diegoveronezi.buscontrol;

import br.com.ConexaoBanco.ConexaoMySQL;

import java.sql.*;
import java.util.ArrayList;

public class OnibusDAO {

    public ArrayList<Time> getHorarioTabela(Time time, int resposta) {

        Connection connection = ConexaoMySQL.getConexaoMySQL();
        PreparedStatement preparedStatement;
        ResultSet rs;

        ArrayList<Time> horarioRecebido = new ArrayList<>();

        try {

            assert connection != null;
            preparedStatement = connection.prepareStatement("select hora from horario where hora>? and idLinha= ?");

            preparedStatement.setTime(1, time);
            preparedStatement.setInt(2, resposta);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                horarioRecebido.add(rs.getTime("hora"));
            }

            return horarioRecebido;

        } catch (SQLException e) {
            throw new Exception("Não existem mais horários para o dia de hoje, " +
                    "os próximos horários começam a partir da 00:00h");

        } finally {
            ConexaoMySQL.FecharConexao();
        }

    }

}
