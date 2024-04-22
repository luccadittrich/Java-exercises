import java.awt.Container;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
import javax.swing.JButton;

public class Main extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton b1; // Declaração do botão


    public static void main(String[] args) {
        Main field = new Main();
        field.testaJFormattedTextField();

    }

    private void testaJFormattedTextField() {
        Container janela = getContentPane();
        setLayout(null);

        JLabel labelCep = new JLabel("CEP: ");
        JLabel labelTel = new JLabel("Telefone: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelData = new JLabel("Data: ");
        JLabel labelEndereco = new JLabel("Endereço:");
        JLabel labelCidade = new JLabel("Cidade");
        b1 = new JButton("INCLUIR");

        labelCep.setBounds(50,40,100,20);
        labelTel.setBounds(50,80,100,20);
        labelCpf.setBounds(50,120,100,20);
        labelData.setBounds(50,160,100,20);
        labelEndereco.setBounds(50, 200, 100, 20);
        labelCidade.setBounds(50, 240, 100, 20);

        MaskFormatter mascaraCep = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraData = null;
        MaskFormatter mascaraEndereco = null;
        MaskFormatter mascaraCidade = null;

        try {
            mascaraCep = new MaskFormatter("#####-###");
            mascaraTel = new MaskFormatter("(##)####-####");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraData = new MaskFormatter("##/##/####");
            mascaraEndereco = new MaskFormatter("");
            mascaraCidade = new MaskFormatter("");


            mascaraCep.setPlaceholderCharacter('_');
            mascaraTel.setPlaceholderCharacter('_');
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraData.setPlaceholderCharacter('_');
            mascaraEndereco.setPlaceholderCharacter('_');
            mascaraCidade.setPlaceholderCharacter('_');


        } catch(ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        JFormattedTextField jFormattedTextCep = new JFormattedTextField();
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextData = new JFormattedTextField(mascaraData);
        JTextField jFormattedTextEndereco= new JTextField();
        JTextField jFormattedTextCidade = new JTextField();

        jFormattedTextCep.setBounds(150,40,100,20);
        jFormattedTextTel.setBounds(150,80,100,20);
        jFormattedTextCpf.setBounds(150,120,100,20);
        jFormattedTextData.setBounds(150,160,100,20);
        jFormattedTextEndereco.setBounds(150,200,100,20);
        jFormattedTextCidade.setBounds(150,240,100,20);
        b1.setBounds(50, 280, 100, 30); // Definição das coordenadas e do tamanho do botão



        janela.add(labelCep);
        janela.add(labelTel);
        janela.add(labelCpf);
        janela.add(labelData);
        janela.add(labelEndereco);
        janela.add(labelCidade);

        janela.add(jFormattedTextCep);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextData);
        janela.add(jFormattedTextEndereco);
        janela.add(jFormattedTextCidade);
        janela.add(b1);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setEnabled(true);



        //b1.addActionListener(this);
    }
}
