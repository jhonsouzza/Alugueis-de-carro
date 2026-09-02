package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Conexao {


    private static final String url = "jdbc:mysql://localhost:3306/sistemadealuguel";
    private static final String user = "root";
    private static final String password = "1234567";


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar com o banco.", e);
        }



    }

}
