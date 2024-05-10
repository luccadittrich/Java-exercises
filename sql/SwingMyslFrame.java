// package swingmysl;

//importar bibliotecas

// import static com.sun.xml.internal.bind.marshaller.Messages.format;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;

// declarando classe e herdando de JFrame
public class SwingMyslFrame extends JFrame {

    // declarando atributos e encapsulando
    private final JLabel lbNome;
    private final JLabel lbApelido;
    private final JLabel lbDtNascimento;
    private final JTextField txtNome;
    private final JTextField txtApelido;
    private final JTextField txtDtNascimento;
    private final JTextField txtLocalizar;
    private final JButton btnSalvar;
    private final JButton btnAlterar;
    private final JButton btnExcluir;
    private final JButton btnClear;
    private final JButton btnLocalizar;
    private final JButton btnPrimeiro;
    private final JButton btnProximo;
    private final JButton btnAnterior;
    private final JButton btnUltimo;
    private Long id;
    private String nome;
    private String apelido;
    private Date dtNascimento;
    //gere os métodos getters and setters

    public List contatoList = new ArrayList();
    private int registroAtual = 0;
    private Long key;

    // método construtor;
    public SwingMyslFrame() {
        // importando atributos da classe pai;
        super("SWING X MYSQL");

        // criando a tela
        Container tela = getContentPane();
        setLayout(null);

        // definindo os campos da janela
        lbNome = new JLabel("Nome");
        lbApelido = new JLabel("Apelido");
        lbDtNascimento = new JLabel("Data de Nascimento(dd/mm/aaaa)");

        // definindo o espaçamento entre as janelas
        lbNome.setBounds(10, 10, 240, 15);
        lbApelido.setBounds(10, 50, 240, 15);
        lbDtNascimento.setBounds(10, 90, 240, 15);

        // definindo a cor das letras
        lbNome.setForeground(Color.BLACK);
        lbApelido.setForeground(Color.BLACK);
        lbDtNascimento.setForeground(Color.BLACK);

        // definindo a fonte
        lbNome.setFont(new Font("Courier New", Font.BOLD, 14));
        lbApelido.setFont(new Font("Courier New", Font.BOLD, 14));
        lbDtNascimento.setFont(new Font("Courier New", Font.BOLD, 14));

        // Definindo o nome dos campos
        tela.add(lbNome);
        tela.add(lbApelido);
        tela.add(lbDtNascimento);

        // criando objetos
        txtNome = new JTextField();
        txtApelido = new JTextField();
        txtDtNascimento = new JTextField();

        // definindo as coordenadas onde os campos vao aparecer e tamanho dos campos
        txtNome.setBounds(10, 25, 265, 20);
        txtApelido.setBounds(10, 65, 265, 20);
        txtDtNascimento.setBounds(10, 105, 265, 20);

        // adicionar os objetos no container da tela
        tela.add(txtNome);
        tela.add(txtApelido);
        tela.add(txtDtNascimento);

        // instanciando botões
        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnClear = new JButton("Limpar");
        btnPrimeiro = new JButton("|<");
        btnAnterior = new JButton("<<");
        btnProximo = new JButton(">>");
        btnUltimo = new JButton(">|");

        // localização e tamanho dos botões
        btnSalvar.setBounds(280, 25, 80, 20);
        btnAlterar.setBounds(280, 65, 80, 20);
        btnExcluir.setBounds(280, 105, 80, 20);

        // adicionando os botões na janela (container)
        tela.add(btnSalvar);
        tela.add(btnAlterar);
        tela.add(btnExcluir);

        // localizações e tamanho dos botões
        btnPrimeiro.setBounds(10, 135, 50, 20);
        btnAnterior.setBounds(60, 135, 50, 20);
        btnClear.setBounds(110, 135, 75, 20);
        btnProximo.setBounds(185, 135, 50, 20);
        btnUltimo.setBounds(235, 135, 50, 20);

        // colocar os botões no container
        tela.add(btnPrimeiro);
        tela.add(btnAnterior);
        tela.add(btnClear);
        tela.add(btnProximo);
        tela.add(btnUltimo);

        // intanciar um novo titulo para os campos
        JLabel lbLocalizar = new JLabel("Localizar por nome");
        lbLocalizar.setBounds(10, 160, 220, 20);

        // adicionar novos campos para texto
        txtLocalizar = new JTextField();
        txtLocalizar.setBounds(10, 180, 220, 20);

        // instanciar um novo botão
        btnLocalizar = new JButton("Ir");
        btnLocalizar.setBounds(230, 180, 55, 20);

        // adicionar na janela
        tela.add(lbLocalizar);
        tela.add(txtLocalizar);
        tela.add(btnLocalizar);

        // definir tamanho
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);

        // adicionar uma ação de salvar ao clicar no botão
        btnSalvar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickSalvar();
            }
        }
        );

        // adicionar uma ação de modificar ao clicar no botão

        btnAlterar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickAlterar();
            }
        }
        );

        // adicionar uma ação de excluir ao clicar no botão

        btnExcluir.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onClickExcluir();
            }
        }
        );

        // adicionar uma ação de limpar a tela ao clicar no botão

        btnClear.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
                registroAtual = 0;
            }
        }
        );

        // adicionar uma ação ao clicar no botão, para realizar uma busca

        btnLocalizar.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickLocalizar();
            }
        }
        );

        // chamando o evento clickPrimeiro

        btnPrimeiro.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickPrimeiro();
            }
        }
        );

        // chamando o evento clickAnterior
        btnAnterior.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickAnterior();
            }
        }
        );

        // chamando o evento clickProximo
        btnProximo.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickProximo();
            }
        }
        );

        // chamando o evento clickUltimo
        btnUltimo.addActionListener(
                new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onClickUltimo();
            }
        }
        );
    }

    // encapsulando e declarando um método para puxar o ultimo valor
    private void onClickUltimo() {
        System.out.println(" onClickUltimo = ");
    }
    // declarando um método para puxar o proximo valor

    private void onClickProximo() {
        System.out.println(" onClickProximo = ");
    }

    // declarando um método para puxar o valor anterior

    private void onClickAnterior() {
        if (registroAtual != 0) {
            getValores(--registroAtual);
            System.out.println(" onClickAnterior = ");
        }
    }

    // declarando um método para puxar o primeiro valor

    private void onClickPrimeiro() {
        registroAtual = 0;
        getValores(registroAtual);
        System.out.println(" onClickPrimeiro = ");
    }

    // declarando um método para modificar o valor

    private void getValores(int index) {

        txtNome.setText(" ");
        txtApelido.setText(" ");
        txtDtNascimento.setText(" ");

    }

    // método para mostrar uma caixa de diálogo no JOPTION PANE

    private void onClickAlterar() {
        System.out.println(" onClickAlterar = ");
         JOptionPane.showMessageDialog (null, "\n Alteração com sucesso !! ");
    }

    // declarando um método que irá fazer uma tentativa de salvar os dados no MYSQL
    private void onClickSalvar() {
        System.out.println(" onClickSalvar = ");
        //Contato contato = new Contato();
        try {

            String driverName = "com.mysql.cj.jdbc.Driver";
            String serverName = "localhost:3306";   //caminho do servidor do BD
            String mydatabase = "mydb"; //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String usuario = "root";
            String senha = "root";
            System.out.println(" url " + url);
            System.out.println(" usuario " + usuario);
            System.out.println(" senha " + senha);
            Class.forName(driverName);
            Connection con;
            con = DriverManager.getConnection(url, usuario, senha);

            Statement st = con.createStatement();
            System.out.println(" st " + st);
            String nome = txtNome.getText();
            String apelido = txtApelido.getText();
            String dtnascimento = txtDtNascimento.getText();

            String comando = ("INSERT INTO mydb.contatos "
                    + "(NOME, APELIDO, DATA_NASCIMENTO) "
                    + "VALUES ('" + nome + "', '"
                    + apelido + "','"
                    + dtnascimento + "')");
            System.out.println(" comando = " + comando);
            st.executeUpdate(comando);
            JOptionPane.showMessageDialog (null, "\n Inclusão com sucesso! ");
            System.out.println("Inclusão na Tabela com sucesso." + comando);

            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(" e " + e);
            //     jLabel5.setText("Problemas na conexão. Verifique a digitação dos nomes e a existência da fonte de dados. \nRecompile e execute novamente.");
        }

    }

    // este método vai excluir os dados do banco de dados
    private void onClickExcluir() {
        System.out.println(" onClickExcluir = ");
        JOptionPane.showMessageDialog (null, "\n Exclusão com sucesso !! ");
    }

    // vai localizar no banco de dados
    private void onClickLocalizar() {
        System.out.println(" onClickLocalizar = ");
        JOptionPane.showMessageDialog (null, "\n Localização com sucesso !! ");
    }

    // metodo que limpa tudo da janela
    private void clearFields() {
        txtNome.setText("");
        txtApelido.setText("");
        txtDtNascimento.setText("");
        txtLocalizar.setText("");
        System.out.println(" clearFields = ");
        JOptionPane.showMessageDialog (null, "\n Tela limpa com sucesso!! ");

    }

    // método main, vai executar o código
    public static void main(String[] args) {
        SwingMyslFrame frame = new SwingMyslFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // formatar a data no padrão brasileiro
    private Date formatarData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return new Date(formatter.parse(data).getTime());
    }

    private Date formatarData(Date dtNascimento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object SimpleDateFormat(String ddMMyyyy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // aviso que deu erro
    void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setApelido(String apelido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDtNascimento(Date formatarData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getApelido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getDtNascimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Long getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setId(long aLong) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
