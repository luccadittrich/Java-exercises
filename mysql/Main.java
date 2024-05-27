import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;


public class Main {
    public static void main(String[] args) {
        //String url = "jdbc:mysql://localhost:3306/local";
        String driverName = "com.mysql.cj.jdbc.Driver";
        String serverName = "localhost:3306";
        String user = "lucca";
        String password = "Mbt2019@";
        String db = "local";

        String url = "jdbc:mysql://" + serverName + "/" + user;

        try {
            // Tenta carregar o driver JDBC
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            // Trata o caso em que o driver não pôde ser carregado
            System.out.println("Driver JDBC não encontrado: " + e.getMessage());
            return; // Sai do programa, pois não pode continuar sem o driver JDBC
        }


        Connection con;

        try {
            con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            String comando = "[SELECT * FROM local]";

            st.executeQuery(comando);
        } catch(Exception e) {
            System.out.println("erro: " + e);
        }





        // System.out.println("__________________");

        // System.out.println(System.getProperty("java.class.path"));
        // System.out.println("__________________");

        // try {
        //     // Registrar o driver JDBC
        //     Class.forName("com.mysql.cj.jdbc.Driver");

        //     // Conectar ao banco de dados
        //     Connection connection = DriverManager.getConnection(url, user, password);

        //     System.out.println("Conexão bem-sucedida!");

        //     // Fechar a conexão
        //     connection.close();
        // } catch (ClassNotFoundException e) {
        //     System.err.println("Driver JDBC não encontrado.");
        //     e.printStackTrace();
        // } catch (SQLException e) {
        //     System.err.println("Erro ao conectar ao banco de dados.");
        //     e.printStackTrace();
        // }
    }
}
