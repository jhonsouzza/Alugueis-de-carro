package DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import Connection.Conexao;

public class  aluguelDAO {
    public static void main(String args[]) {
        String sql;

        sql = "insert into aluguel(DataInicio, DataDevolucao, StatusPagamento,StatusAluguel,ValorTotal,Status)" +
                "values(?,?,?,?,?,?)";

        Connection conexao = Conexao.getConnection();

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1,"DataInicio");
            stmt.setString(2, "DataDevolucao");
            stmt.setString(3, "StatusPagamento");
            stmt.setString(4, "StatusAluguel");
            stmt.setString(5, "ValorTotal");
            stmt.setString(6, "Status");
            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(aluguelDAO.class.getName()).log(Level.SEVERE, null, ex);

        }
  
    }


}
