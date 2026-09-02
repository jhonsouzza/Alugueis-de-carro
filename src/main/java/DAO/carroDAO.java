package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Connection.Conexao;


public class carroDAO {
    public static void main(String[] args) {
        String cadastro;

        cadastro = "insert into carro (modelo,marca,cor,ano,placa,valorDiaria)" +
                "values (?,?,?,?,?,?,?)";

        Connection conexao = Conexao.getConnection();
        try {
            PreparedStatement stmt = conexao.prepareStatement(cadastro);
            stmt.setString(1, "modelo");
            stmt.setString(2, "marca");
            stmt.setString(3, "cor");
            stmt.setString(4, "ano");
            stmt.setString(5, "placa");
            stmt.setString(6, "valorDiaria");
            stmt.execute();

        }  catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
