import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private JButton botao;
    private JTextField texto;
    private JLabel etiqueta;

    public Calculadora(){
        super("Calculadora");
        botao = new JButton("Soma");
        texto = new JTextField("0", 10);
        
    }


}
