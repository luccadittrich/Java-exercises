import java.awt.event.*;
import javax.swing.*;

public class Cap08Ex08 extends JPanel implements ActionListener {
    JLabel l1, l2, l3;
    JTextField c1, c2, c3;
    JButton b1;

    String nome, endereco, cpf;

    public Cap08Ex08() {
        l1 = new JLabel("Nome: ");
        c1 = new JTextField("", 45);
        add(l1);
        add(c1);

        l2 = new JLabel("Endereço");
        c2 = new JTextField("", 45);
        add(l2);
        add(c2);

        l3 = new JLabel("CPF");
        c3 = new JTextField("", 46);

        add(l3);
        add(c3);

        b1 = new JButton("INCLUIR");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == b1) {

            nome = c1.getText();
            endereco = c2.getText();
            cpf = c3.getText();
        }

        System.exit(0);
    }

    public static void main(String[] args) {
        JFrame Cap08Ex08 = new JFrame("Exemplo com JLabel, JTextField e JButton");
        Cap08Ex08.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Cap08Ex08.setContentPane(new Cap08Ex08());
        Cap08Ex08.setSize(600, 160);
        Cap08Ex08.setVisible(true);
    }
}
