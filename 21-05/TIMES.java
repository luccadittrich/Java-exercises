
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.JList;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class TIMES extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();

    // Método para inclusão de registro
    public void incluirRegistro() {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String serverName = "localhost:3306"; // caminho do servidor do BD
            String mydatabase = "test"; // nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String usuario = "root";
            String senha = "root";
            Class.forName(driverName);
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            Statement st = con.createStatement();
            String codigo = jTextField1.getText();
            String nome = jTextField2.getText();
            String pais = jTextField3.getText();
            String comando = ("INSERT INTO test.times (codigotime, nometime, paistime) "
                    + "VALUES ('" + codigo + "', '" + nome + "','" + pais + "')");
            st.executeUpdate(comando);
            jLabel5.setText("Inclusão na Tabela com sucesso.");
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(" e " + e);
            jLabel5.setText("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \nRecompile e execute novamente.");
        }
    }

    // Método para alteração de registro
    public void alterarRegistro() {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String serverName = "localhost:3306"; // caminho do servidor do BD
            String mydatabase = "test"; // nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String usuario = "root";
            String senha = "root";
            Class.forName(driverName);
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            String codigo = jTextField1.getText();
            String nome = jTextField2.getText();
            String pais = jTextField3.getText();
            Statement st = con.createStatement();
            String comando = ("UPDATE test.times SET nometime = '" + nome + "', paistime = '" + pais + "' WHERE codigotime = '" + codigo + "';");
            st.executeUpdate(comando);
            jLabel5.setText("Alteração na Tabela com sucesso.");
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(" e " + e);
            jLabel5.setText("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \nRecompile e execute novamente.");
        }
    }

    // Método para exclusão de registro
    public void excluirRegistro() {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String serverName = "localhost:3306"; // caminho do servidor do BD
            String mydatabase = "test"; // nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String usuario = "root";
            String senha = "root";
            Class.forName(driverName);
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            String codigo = jTextField1.getText();
            Statement st = con.createStatement();
            String comando = ("DELETE FROM test.times WHERE codigotime = " + codigo + ";");
            st.executeUpdate(comando);
            jLabel5.setText("Exclusão com sucesso.");
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(" e " + e);
            jLabel5.setText("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \nRecompile e execute novamente.");
        }
    }

    // Método para consulta de registro
    public void consultarRegistro() {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String serverName = "localhost:3306"; // caminho do servidor do BD
            String mydatabase = "test"; // nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String usuario = "root";
            String senha = "root";
            Class.forName(driverName);
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            Statement st = con.createStatement();
            String codigo = jTextField1.getText();
            ResultSet rs = st.executeQuery("Select * from test.times where codigotime = " + codigo);
            while (rs.next()) {
                jTextField1.setText(rs.getString("codigotime"));
                jTextField2.setText(rs.getString("nometime"));
                jTextField3.setText(rs.getString("paistime"));
                jLabel5.setText("Consulta na Tabela com sucesso.");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(" e " + e);
            jLabel5.setText("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \nRecompile e execute novamente.");
        }
    }

    // Método para listar registros da tabela
    public void listarRegistros() {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String serverName = "localhost:3306"; // caminho do servidor do BD
            String mydatabase = "test"; // nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String usuario = "root";
            String senha = "root";
            Class.forName(driverName);
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);
            Statement st = con.createStatement();
            ArrayList<String> times = new ArrayList();
            ResultSet rs = st.executeQuery("Select * FROM test.times;");
            int indice = 0;
            while (rs.next()) {
                String codigo = rs.getString("codigotime");
                String nome = rs.getString("nometime");
                String pais = rs.getString("paistime");
                times.add("Codigo: " + codigo + " Nome: " + nome + " Pais: " + pais);
            }
            model.removeAllElements(); // limpa lista
            int limiteindice = times.size();
            for (indice = 0; indice < limiteindice; indice++) {
                model.addElement(times.get(indice));
                jList1.setModel(model);
                jList1.setVisible(true);
            }
            jLabel5.setText("Listagem da Tabela com sucesso.");
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \nRecompile e execute novamente.");
        }
    }
}
