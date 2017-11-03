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

            preparedStatement = connection.prepareStatement("select hora from horario where hora>? and idLinha= ?");

            preparedStatement.setTime(1, time);
            preparedStatement.setInt(2, resposta);
            rs = preparedStatement.executeQuery();

            while (rs.next()) {
                horarioRecebido.add(rs.getTime("hora"));
            }

            return horarioRecebido;

        } catch (SQLException e) {
            throw new Exception("Não foi possivel encontrar o horário");

        } finally {
            ConexaoMySQL.FecharConexao();
        }

    }

}
